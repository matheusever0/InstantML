/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantml;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author matheus
 */
public class MLMain extends javax.swing.JFrame {

    /**
     * Creates new form MLMain
     */
    public MLMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarGreat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarUltimate = new javax.swing.JButton();
        btnIniciar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciarGreat.setText("Iniciar Great");
        btnIniciarGreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarGreatActionPerformed(evt);
            }
        });

        jLabel1.setText("F8: Magia");

        jLabel2.setText("F9: Potion");

        btnIniciarUltimate.setText("Iniciar Ultimate");
        btnIniciarUltimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarUltimateActionPerformed(evt);
            }
        });

        btnIniciar2.setText("Fechar");
        btnIniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnIniciarUltimate, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(btnIniciarGreat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciar2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarGreat)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnIniciarUltimate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarGreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarGreatActionPerformed
        IniciarGreat();
    }//GEN-LAST:event_btnIniciarGreatActionPerformed

    private void btnIniciarUltimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarUltimateActionPerformed
        IniciarUltimate();

    }//GEN-LAST:event_btnIniciarUltimateActionPerformed

    private void btnIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnIniciar2ActionPerformed

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
            java.util.logging.Logger.getLogger(MLMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MLMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MLMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MLMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MLMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar2;
    private javax.swing.JButton btnIniciarGreat;
    private javax.swing.JButton btnIniciarUltimate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
public void IniciarUltimate() {
        try {
            while (true) {
                Robot robot = new Robot();
                // Cria um delay de 5 segundos de modo que você possa abrir o notepad antes da execução do código a seguir
                // Robot começa a escrever
                robot.delay(3000);
                robot.keyPress(KeyEvent.VK_F8); //400 mana
                robot.delay(2000);
                robot.keyPress(KeyEvent.VK_F8); //800 mana
                robot.delay(2000);
                robot.keyPress(KeyEvent.VK_F8); // 1200 mana
                robot.delay(2000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot ULTIMATE - 500-600
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot ULTIMATE - 500-600
                robot.keyRelease(KeyEvent.VK_F8);
                robot.keyRelease(KeyEvent.VK_F9);

                robot.delay(10000);
                robot.keyPress(KeyEvent.VK_KP_UP);
                robot.keyRelease(KeyEvent.VK_KP_UP);
                robot.keyPress(KeyEvent.VK_KP_DOWN);
                robot.keyRelease(KeyEvent.VK_KP_DOWN);

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

            }
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

    public void IniciarGreat() {
        try {
            while (true) {
                Robot robot = new Robot();
                // Cria um delay de 5 segundos de modo que você possa abrir o notepad antes da execução do código a seguir
                // Robot começa a escrever
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); //400 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); //800 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1200 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F8); // 1600 mana
                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_F9); // 1 pot Great - 250-300
                robot.delay(1000);

                robot.keyRelease(KeyEvent.VK_F8);
                robot.keyRelease(KeyEvent.VK_F9);

                robot.delay(1000);
                robot.keyPress(KeyEvent.VK_UP);
                robot.delay(500);
                robot.keyRelease(KeyEvent.VK_UP);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.delay(500);
                robot.keyRelease(KeyEvent.VK_DOWN);

            }
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }

}
