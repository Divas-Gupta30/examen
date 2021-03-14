/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizPortal;

import static QuizPortal.QuestionMultiple.socket;
import static QuizPortal.Subject.socket;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Manvendra
 */
public class section extends javax.swing.JFrame {
static String qcode;
static Socket socket;
static String subject;
    /**
     * Creates new form section
     */
    public section(Socket socket,String subject,String qcode) {
        initComponents();
        this.qcode = qcode;
        this.socket=socket;
        this.subject=subject;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        single = new javax.swing.JLabel();
        multiple = new javax.swing.JLabel();
        tf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mcqst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mcqmt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tft = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        single.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        single.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singleMouseClicked(evt);
            }
        });
        getContentPane().add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 360, 50));

        multiple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multipleMouseClicked(evt);
            }
        });
        getContentPane().add(multiple, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 360, 50));

        tf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMouseClicked(evt);
            }
        });
        getContentPane().add(tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 360, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizPortal/stop-button-hi.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 100, 100));

        mcqst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mcqst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 40));

        jLabel8.setBackground(new java.awt.Color(102, 0, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SUBMIT");
        jLabel8.setToolTipText("");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 40));

        jLabel5.setBackground(new java.awt.Color(102, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUBMIT");
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 40));

        mcqmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mcqmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 90, 40));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 6, 40, 30));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 6, 50, 40));

        tft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tft, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizPortal/section.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseClicked
        // TODO add your handling code here:
        System.out.println("you have clicked on single correct mcq");
         new Question(socket, qcode).setVisible(true);
         dispose();
    }//GEN-LAST:event_singleMouseClicked

    private void multipleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multipleMouseClicked
        // TODO add your handling code here:
        System.out.println("you have clicked on multiple correct mcq");
         new QuestionMultiple(socket, qcode).setVisible(true);
         dispose();
    }//GEN-LAST:event_multipleMouseClicked

    private void tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMouseClicked
        // TODO add your handling code here:
        System.out.println("you have clicked on True/False mcq");
         new True(socket, qcode).setVisible(true);
         dispose();
    }//GEN-LAST:event_tfMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) 
    {                                       
        JOptionPane.showMessageDialog(null,"Quiz completed");
        new HOME().setVisible(true);
        dispose();
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Subject(socket).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String s[]={"settime",subject,qcode,mcqst.getText(),mcqmt.getText(),tft.getText()};
         try{
             System.out.println(s[3]+" "+s[4]+" "+s[5]);
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(s);
            JOptionPane.showMessageDialog(null,"Time set!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new section(socket,subject,qcode).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mcqmt;
    private javax.swing.JTextField mcqst;
    private javax.swing.JLabel multiple;
    private javax.swing.JLabel single;
    private javax.swing.JLabel tf;
    private javax.swing.JTextField tft;
    // End of variables declaration//GEN-END:variables
}
