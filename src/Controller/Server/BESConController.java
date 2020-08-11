/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Server;

import java.io.IOException;
/**
 *
 * @author Leonardo González G.
 */
public class BESConController implements Runnable{

    private SocketController controllerServer;
    private Thread theThread=null;
    private String resp = "";
    private String send="";
    
    public BESConController(String name, int port){
        try {
            controllerServer = new SocketController(name, port);
            controllerServer.readText();
        } catch (IOException ex) {
            System.out.println("Falla en conexion con el servidor: "+name+":"+port);
        }
    }
    
    public Thread sendQuestion(String sendInput){
        send =sendInput;
       
        if (theThread == null) {
            this.theThread = new Thread((Runnable) this);
            theThread.start();
        }
        return theThread;
    }
     @Override
    public void run() {
         resp = controllerServer.writeReadText(send);
    }
    
    public Thread getThread(){
        return this.theThread;
    }
    public String getResponse(){
    
        return resp;
  
    }
    
}
