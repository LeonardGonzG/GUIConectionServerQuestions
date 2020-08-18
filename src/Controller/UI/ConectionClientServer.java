package Controller.UI;

import Controller.Server.BESConController;
import Controller.Server.SocketController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo González G.
 */
public class ConectionClientServer extends javax.swing.JFrame {

    SocketController sc = null;
    String[] hosts = {};
    String[] info = {};
    String name = "";
    int portConection = 0;
    List<BESConController> controllerServer = new ArrayList<>();

    int numServer = 0;
    Thread thread[] = new Thread[hosts.length];
    int portUnique = 0;
    String SEND_SERVER = "";
    String ANSWER_SERVER = "";

    public ConectionClientServer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        host = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        send = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JPshow = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONECTION TO SERVER QUESTIONS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        host.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.light"));
        host.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        host.setText("127.0.0.1");
        host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Host");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Port");

        port.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.light"));
        port.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        port.setText("20000");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("IPs Manager Server");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/Img/socket.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(port)
                        .addComponent(jLabel2)
                        .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 880, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        send.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.light"));
        send.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        send.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Write your question");

        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controller/Img/send.png"))); // NOI18N
        btnSend.setEnabled(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 880, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Question and answers");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        JPshow.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(JPshow);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 880, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String host = this.host.getText();
        this.portConection = Integer.parseInt(this.port.getText());

        if (!host.isEmpty() && this.portConection != 0) {

            try {

                sc = new SocketController(this.host.getText(), this.portConection);
                // System.out.println(sc.readText());
                if (!sc.readText().isEmpty()) {

                    showMessageOk("Connected :)");
                    this.send.setEnabled(true);
                    this.btnSend.setEnabled(true);

                    this.hosts = sc.writeReadText("GET").split(";");
                    sc.close();

                    //Iniciar conexciones con servidores
                    //   this.beginConectionWithServes();
                } else {

                    this.showMessageError("No conection", "The server main does not answer");

                    this.send.setEnabled(false);
                    this.btnSend.setEnabled(false);
                }

            } catch (IOException ex) {
                this.showMessageError("NO CONECTION", "Fail conection with main server");

            }

        } else {

            this.showMessageError("No conection", "Did not possible the conection");
            this.send.setEnabled(false);
            this.btnSend.setEnabled(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        this.SEND_SERVER = send.getText();

        if (!this.SEND_SERVER.isEmpty()) {

            //Iniciar conexciones con servidores
            this.beginConectionWithServes();

            this.sendQuestionServer();

        } else {
            this.showMessageError("PLEASE!", "Input a question");
        }


    }//GEN-LAST:event_btnSendActionPerformed
//Inicia la conexión con las IPs y puertos que dió como respuesta el servidor principal

    public void beginConectionWithServes() {

        for (String host : hosts) {

            info = host.split(":");
            name = info[0];
            portUnique = Integer.parseInt(info[1]);
            controllerServer.add(new BESConController(name, portUnique));
        }
    }

    //Envia la pregunta a todos los servidores
    public void sendQuestionServer() {

        for (int i = 0; i < controllerServer.size(); i++) {
            controllerServer.get(i).sendQuestion(SEND_SERVER);
        }

        for (BESConController t : controllerServer) {
            try {
                t.getThread().join();
            } catch (InterruptedException ex) {
                this.showMessageError("SERVERS", "Error in answer with servers");
            }
        }
        this.answersServers();
    }

    //Muestra la respuesta de los servidores al usuario
    public void answersServers() {

        int items = 1;
        int itemsQuestion=1;
        int notAnswerServer = 0;
        this.ANSWER_SERVER = "";
        this.JPshow.setText("");

        for (int i = 0; i < controllerServer.size(); i++) {

            String answer = controllerServer.get(i).getResponse();
            if (answer != null) {
                //Temas
                if (answer.startsWith("0100")) {
                    String[] topics = answer.substring(5).split(";");

                    for (String topic : topics) {

                        this.ANSWER_SERVER += items + " - " + topic.trim() + "\n";
                        //System.out.println(ANSWER_SERVER);
                        items++;
                    }

                } else if (answer.startsWith("0200")) { //Preguntas ha realizar

                    String[] questions = answer.substring(5).split(";");
                    System.out.println("");

                    for (String q : questions) {

                        this.ANSWER_SERVER += itemsQuestion + " - " + q.trim() + "\n";
                        //System.out.println(ANSWER_SERVER);
                        itemsQuestion++;
                    }

                } else if (answer.startsWith("1000")) { //Respuesta a preguntas
                    this.ANSWER_SERVER = answer.substring(5);
                    // System.out.println( ANSWER_SERVER);

                } else if (answer.startsWith("0000")) { // no se encuentra respuesta a la pregunta

                    // System.out.println("No hay respuesta para tu pregunta :(");
                    notAnswerServer++;
                    //  System.out.println(""+notAnswerServer);
                }
            } else {

                this.showMessageError("NO ANSWER", "- - Did not answer");
            }
        }

        if (notAnswerServer == hosts.length) {
            this.ANSWER_SERVER = "...";
            showMessageError("NOT ANSWER :(", "No answer to your question");
        }

        this.JPshow.replaceSelection(ANSWER_SERVER);

        this.ANSWER_SERVER = "-1";
       
    }

    //Mensaje de error en pantalla al usuario
    private void showMessageError(String title, String message) {
        JOptionPane.showConfirmDialog(null, message, title, JOptionPane.CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    //Mensaje de exito en pantalla al usuario
    private void showMessageOk(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConectionClientServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConectionClientServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConectionClientServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConectionClientServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConectionClientServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane JPshow;
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField port;
    private javax.swing.JTextField send;
    // End of variables declaration//GEN-END:variables
}
