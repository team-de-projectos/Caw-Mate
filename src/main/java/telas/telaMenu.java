/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.menubar;
/**
 *
 * @author 824143195
 */
public class telaMenu extends javax.swing.JFrame {

    /**
     * Creates new form telaMenu
     */
    public telaMenu() {
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

        perfilButton = new javax.swing.JButton();
        aulasButton = new javax.swing.JButton();
        suporteButton = new javax.swing.JButton();
        termosButton = new javax.swing.JButton();
        politicasButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        perfilButton.setBackground(new java.awt.Color(123, 111, 173));
        perfilButton.setForeground(new java.awt.Color(238, 241, 241));
        perfilButton.setText("Perfil");
        perfilButton.setAlignmentY(0.0F);
        perfilButton.setBorder(null);
        perfilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilButtonActionPerformed(evt);
            }
        });
        getContentPane().add(perfilButton);
        perfilButton.setBounds(210, 40, 170, 20);

        aulasButton.setBackground(new java.awt.Color(123, 111, 173));
        aulasButton.setForeground(new java.awt.Color(238, 241, 241));
        aulasButton.setText("Aulas");
        aulasButton.setBorder(null);
        aulasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aulasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aulasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aulasButton);
        aulasButton.setBounds(210, 80, 170, 20);

        suporteButton.setBackground(new java.awt.Color(123, 111, 173));
        suporteButton.setForeground(new java.awt.Color(238, 241, 241));
        suporteButton.setText("Suporte");
        suporteButton.setBorder(null);
        suporteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suporteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suporteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(suporteButton);
        suporteButton.setBounds(210, 120, 170, 20);

        termosButton.setBackground(new java.awt.Color(123, 111, 173));
        termosButton.setForeground(new java.awt.Color(238, 241, 241));
        termosButton.setText("Termos de Uso");
        termosButton.setBorder(null);
        termosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        termosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(termosButton);
        termosButton.setBounds(210, 160, 170, 20);

        politicasButton.setBackground(new java.awt.Color(123, 111, 173));
        politicasButton.setForeground(new java.awt.Color(238, 241, 241));
        politicasButton.setText("Políticas de Privacidade");
        politicasButton.setBorder(null);
        politicasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        politicasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(politicasButton);
        politicasButton.setBounds(210, 200, 170, 20);

        sairButton.setBackground(new java.awt.Color(123, 111, 173));
        sairButton.setForeground(new java.awt.Color(238, 241, 241));
        sairButton.setText("Sair");
        sairButton.setBorder(null);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton);
        sairButton.setBounds(210, 240, 170, 20);

        voltarButton.setBackground(new java.awt.Color(123, 111, 173));
        voltarButton.setForeground(new java.awt.Color(238, 241, 241));
        voltarButton.setText("Voltar");
        voltarButton.setBorder(null);
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton);
        voltarButton.setBounds(510, 10, 90, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilButtonActionPerformed
        telaPerfil perfil = new telaPerfil();
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_perfilButtonActionPerformed

    private void aulasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aulasButtonActionPerformed
        telaAulas aulas = new telaAulas();
        aulas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aulasButtonActionPerformed

    private void suporteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suporteButtonActionPerformed
        telaSuporte suporte = new telaSuporte();
        suporte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_suporteButtonActionPerformed

    private void termosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termosButtonActionPerformed
        telaTermos termos = new telaTermos();
        termos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_termosButtonActionPerformed

    private void politicasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicasButtonActionPerformed
        telaPolitica politicas = new telaPolitica();
        politicas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_politicasButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        telaLogin login = new telaLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aulasButton;
    private javax.swing.JButton perfilButton;
    private javax.swing.JButton politicasButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton suporteButton;
    private javax.swing.JButton termosButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}