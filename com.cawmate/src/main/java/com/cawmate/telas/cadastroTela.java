package com.cawmate.telas;

import com.cawmate.classes.Pessoa;



public class cadastroTela extends javax.swing.JFrame {
    
    public cadastroTela() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        nascimentoTextField = new javax.swing.JTextField();
        escolaridadeTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        prontoButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        nomeLabel = new javax.swing.JLabel();
        nascimentoLabel = new javax.swing.JLabel();
        escolaridadeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        nascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTextFieldActionPerformed(evt);
            }
        });

        escolaridadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolaridadeTextFieldActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });

        prontoButton.setText("Pronto");
        prontoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prontoButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome");

        nascimentoLabel.setText("Nascimento");

        escolaridadeLabel.setText("Escolaridade");

        emailLabel.setText("Email");

        senhaLabel.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaLabel)
                    .addComponent(emailLabel)
                    .addComponent(escolaridadeLabel)
                    .addComponent(nascimentoLabel)
                    .addComponent(nomeLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(voltarButton)
                            .addGap(77, 77, 77)
                            .addComponent(prontoButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTextField)
                            .addComponent(nascimentoTextField)
                            .addComponent(escolaridadeTextField)
                            .addComponent(emailTextField)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolaridadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolaridadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prontoButton)
                    .addComponent(voltarButton))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        String nome = nomeTextField.getText();
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void nascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTextFieldActionPerformed
        String nascimento = nascimentoTextField.getText();
    }//GEN-LAST:event_nascimentoTextFieldActionPerformed

    private void escolaridadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolaridadeTextFieldActionPerformed
        String escolaridade = escolaridadeTextField.getText();
    }//GEN-LAST:event_escolaridadeTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        String email = emailTextField.getText();
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        String senha = senhaPasswordField.getText();
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void prontoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prontoButtonActionPerformed
        Pessoa cadastro = new Pessoa();
        cadastro.inserir();
        
        nomeTextField.setText("");
        nascimentoTextField.setText("");
        escolaridadeTextField.setText("");
        emailTextField.setText("");
        senhaPasswordField.setText("");
    }//GEN-LAST:event_prontoButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroTela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel escolaridadeLabel;
    private javax.swing.JTextField escolaridadeTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nascimentoLabel;
    private javax.swing.JTextField nascimentoTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton prontoButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}