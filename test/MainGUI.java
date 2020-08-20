

import Controller.Server.BESConController;
import Controller.Server.SocketController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo González G.
 */
public class MainGUI {

    public static void main(String[] args) {

       
        SocketController sc = null;
        String[] hosts = {};
        String[] info = {};
        String name = "";
        int port = 0;

        List<BESConController> controllerServer = new ArrayList<>();

        try {
            sc = new SocketController("127.0.0.1", 20000);
            System.out.println(sc.readText());
            hosts = sc.writeReadText("GET").split(";");

            sc.close();
        } catch (IOException ex) {
            System.out.println("Falla en conexión con el servidor principal");
        }

        int numServer = 0;
        Thread thread[] = new Thread[hosts.length];

        for (String host : hosts) {

            info = host.split(":");
            name = info[0];
            port = Integer.parseInt(info[1]);
            controllerServer.add(new BESConController(name, port));   
        }
        
        String SEND_SERVER = "Preguntar Avengers";
         
        for(int i=0; i<controllerServer.size(); i++){
             controllerServer.get(i).sendQuestion(SEND_SERVER);
        }
        
        for (BESConController t : controllerServer) {
            try {
                t.getThread().join();
            } catch (InterruptedException ex) {
                System.out.println("Error in answer with servers");
            }
        }

        for (int i = 0; i < controllerServer.size(); i++) {

            String answer = controllerServer.get(i).getResponse();
            if (answer != null) {
                //Temas
                if (answer.startsWith("0100")) {
                    String[] topics = answer.substring(5).split(";");
                    System.out.println("");

                    for (String topic : topics) {

                        System.out.println(topic.trim());
                    }
                    
                }else if(answer.startsWith("0200")){ //Preguntas ha realizar
                
                    String[] questions = answer.substring(5).split(";");
                    System.out.println("");
                
                    for (String q : questions) {

                        System.out.println(q.trim());
                    }
                    
                }else if(answer.startsWith("1000")){ //Respuesta a preguntas
                
                    String answ= answer.substring(5);
                    System.out.println(answ);
                
                }else if(answer.startsWith("0000")){ // no se encuentra respuesta a la pregunta
                
                    System.out.println("No hay respuesta para tu pregunta :(");
                    
                }        
                 
            } else {

                System.out.println("- - Did not answer");
            }
        }

        //////////--->

    }

}
