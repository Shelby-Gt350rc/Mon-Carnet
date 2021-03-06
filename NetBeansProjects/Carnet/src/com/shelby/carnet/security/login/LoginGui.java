/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.shelby.carnet.security.login;

import carnet.CarnetApp;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Shelby
 */
public class LoginGui extends javax.swing.JFrame {
    
    /**
     * Creates new form LoginGui
     */
    public LoginGui() {
        initComponents();
        infosLbl.setVisible(false);
        centerEcran();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPnl = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        pwdLbl = new javax.swing.JLabel();
        loginTfld = new javax.swing.JTextField();
        pwdTfld = new javax.swing.JPasswordField();
        cancelBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        copyRightLbl = new javax.swing.JLabel();
        icebookVersionInfoLbl = new javax.swing.JLabel();
        banniereLbl = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        infosLbl = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        fondLoginLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(null);

        LoginPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        LoginPnl.setName("LoginPnl"); // NOI18N
        LoginPnl.setOpaque(false);

        loginLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 20)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setText("Pseudo"); // NOI18N
        loginLbl.setToolTipText("User name"); // NOI18N
        loginLbl.setName("loginLbl"); // NOI18N

        pwdLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 20)); // NOI18N
        pwdLbl.setForeground(new java.awt.Color(255, 255, 255));
        pwdLbl.setText("Password"); // NOI18N
        pwdLbl.setToolTipText("User password"); // NOI18N
        pwdLbl.setName("pwdLbl"); // NOI18N

        loginTfld.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 19)); // NOI18N
        loginTfld.setToolTipText("enter the user name"); // NOI18N
        loginTfld.setName("loginTfld"); // NOI18N
        loginTfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginTfldKeyReleased(evt);
            }
        });

        pwdTfld.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 19)); // NOI18N
        pwdTfld.setToolTipText("Input user password"); // NOI18N
        pwdTfld.setName("pwdTfld"); // NOI18N
        pwdTfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdTfldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout LoginPnlLayout = new javax.swing.GroupLayout(LoginPnl);
        LoginPnl.setLayout(LoginPnlLayout);
        LoginPnlLayout.setHorizontalGroup(
            LoginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPnlLayout.createSequentialGroup()
                        .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginTfld))
                    .addGroup(LoginPnlLayout.createSequentialGroup()
                        .addComponent(pwdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(pwdTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LoginPnlLayout.setVerticalGroup(
            LoginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginTfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        LoginPnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginTfld, pwdTfld});

        getContentPane().add(LoginPnl);
        LoginPnl.setBounds(140, 50, 300, 120);

        cancelBtn.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 12)); // NOI18N
        cancelBtn.setText("Cancel"); // NOI18N
        cancelBtn.setToolTipText("Zuuut You have done an error refresh it  now!"); // NOI18N
        cancelBtn.setName("cancelBtn"); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn);
        cancelBtn.setBounds(360, 180, 80, 25);

        okBtn.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 12)); // NOI18N
        okBtn.setText("Log in"); // NOI18N
        okBtn.setToolTipText("Enjoy IceBook apps !!!"); // NOI18N
        okBtn.setName("okBtn"); // NOI18N
        okBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okBtnMouseClicked(evt);
            }
        });
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn);
        okBtn.setBounds(270, 180, 80, 25);

        copyRightLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 12)); // NOI18N
        copyRightLbl.setForeground(new java.awt.Color(255, 255, 255));
        copyRightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyRightLbl.setText("© Copyright 2015. All Rights Reserved."); // NOI18N
        copyRightLbl.setName("copyRightLbl"); // NOI18N
        getContentPane().add(copyRightLbl);
        copyRightLbl.setBounds(200, 220, 250, 30);

        icebookVersionInfoLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 13)); // NOI18N
        icebookVersionInfoLbl.setForeground(new java.awt.Color(255, 255, 255));
        icebookVersionInfoLbl.setText("Carnet v1.0.1  made by Shelby"); // NOI18N
        icebookVersionInfoLbl.setName("icebookVersionInfoLbl"); // NOI18N
        getContentPane().add(icebookVersionInfoLbl);
        icebookVersionInfoLbl.setBounds(0, 220, 220, 30);

        banniereLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 28)); // NOI18N
        banniereLbl.setForeground(new java.awt.Color(255, 255, 255));
        banniereLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banniereLbl.setText("Authentification"); // NOI18N
        banniereLbl.setName("banniereLbl"); // NOI18N
        getContentPane().add(banniereLbl);
        banniereLbl.setBounds(10, 0, 430, 40);

        exitLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 11)); // NOI18N
        exitLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shelby/carnet/security/login/resources/fermer.GIF"))); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(carnet.CarnetApp.class).getContext().getResourceMap(LoginGui.class);
        exitLbl.setText(resourceMap.getString("exitLbl.text")); // NOI18N
        exitLbl.setToolTipText("Close this Apps !!!"); // NOI18N
        exitLbl.setName("exitLbl"); // NOI18N
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
        });
        getContentPane().add(exitLbl);
        exitLbl.setBounds(430, 0, 16, 16);

        infosLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 14)); // NOI18N
        infosLbl.setForeground(new java.awt.Color(250, 243, 243));
        infosLbl.setText(resourceMap.getString("infosLbl.text")); // NOI18N
        infosLbl.setName("infosLbl"); // NOI18N
        getContentPane().add(infosLbl);
        infosLbl.setBounds(100, 180, 160, 20);

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shelby/carnet/security/login/resources/aboutCarnetdb.png"))); // NOI18N
        logoLbl.setText(resourceMap.getString("logoLbl.text")); // NOI18N
        logoLbl.setName("logoLbl"); // NOI18N
        getContentPane().add(logoLbl);
        logoLbl.setBounds(10, 20, 140, 170);

        fondLoginLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        fondLoginLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shelby/carnet/security/login/fondLogin.jpg"))); // NOI18N
        fondLoginLbl.setName("fondLoginLbl"); // NOI18N
        getContentPane().add(fondLoginLbl);
        fondLoginLbl.setBounds(0, 0, 450, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLblMouseClicked
    
    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        okBtnMouseClicked(null);
    }//GEN-LAST:event_okBtnActionPerformed
    
    private void okBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnMouseClicked
        validation();
    }//GEN-LAST:event_okBtnMouseClicked
    
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        refreshLoginForm();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void loginTfldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTfldKeyReleased
       //appel de la methode validation après le relachement de la touche Enter
        validationSurClavier(evt);
    }//GEN-LAST:event_loginTfldKeyReleased

    private void pwdTfldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdTfldKeyReleased
       //appel de la methode validation après le relachement de la touche Enter
        validationSurClavier(evt);
    }//GEN-LAST:event_pwdTfldKeyReleased
    
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
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGui().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPnl;
    private javax.swing.JLabel banniereLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel copyRightLbl;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel fondLoginLbl;
    private javax.swing.JLabel icebookVersionInfoLbl;
    private javax.swing.JLabel infosLbl;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JTextField loginTfld;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JPasswordField pwdTfld;
    // End of variables declaration//GEN-END:variables
    
    boolean valeur;
    int numberOfTest =0;
    int MAX_CONEXION_TEST = 3;
    
    public int getNumberOfTest() {
        return numberOfTest;
    }
    
    public void setNumberOfTest(int numberOfTest) {
        this.numberOfTest = numberOfTest;
    }
    
    
    private void centerEcran() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimensionEcran = kit.getScreenSize();
        int largeur = dimensionEcran.width;
        int hauteur = dimensionEcran.height;
        setTitle("Authentification");
        setBounds((largeur-450)/2,(hauteur-250)/2, 450,250);
        setResizable(false);
    }
    
    /**
     * Methode qui nous permet de valider
     * les valeurs de connexion ceci en renvoyant un message de 
     * connexion reussie (l'interface principale Icebook) ou connexion
     * echec
     * 
     */
    private void validation() {
        char[] pwdTab = pwdTfld.getPassword();
        String pwdSaisie = String.copyValueOf(pwdTab);
        String loginSaisie = loginTfld.getText();
        if(isValid(loginSaisie, pwdSaisie)){
            JOptionPane.showMessageDialog(null, "Successful connection  !!!",
                    "Welcome", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            CarnetApp monCarnet = new CarnetApp();
            monCarnet.runApp();
        }  else {
            JOptionPane.showMessageDialog(null, "User unknown",
                    "Connexion Failed !!!", JOptionPane.ERROR_MESSAGE);
            infosLbl.setText("Remaining attempts: "+(MAX_CONEXION_TEST-getNumberOfTest()));//tentative restantes
        }
    }
    
    /**
     * Methode qui nous permet de tester si les informations réquise pour
     * la connexion sont valide et aussi de compter le nombre d'essaie
     * effectué
     */
    private boolean isValid(String loginSaisie, String pwdSaisie) {
        if("".equals(loginSaisie)&& "".equals(pwdSaisie) || "".equals(pwdSaisie) || "".equals(loginSaisie)){
            JOptionPane.showMessageDialog(null,
                    "Please insert your login!!!",
                    " Required Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            numberOfTest+=1;
            infosLbl.setVisible(true);
            if(numberOfTest ==MAX_CONEXION_TEST){
                 infosLbl.setText("Remaining attempts: "+(MAX_CONEXION_TEST-MAX_CONEXION_TEST));//tentative restantes
                JOptionPane.showMessageDialog(null, "number of attemps: "+numberOfTest+" Sorry you will leave Icebook  !!!",
                        "Failed connection ", JOptionPane.ERROR_MESSAGE);
                dispose();
                System.exit(0);
            }else{
                if(pwdSaisie.equals("Winchester") && loginSaisie.equals("Shelby")){
                    valeur = true;
                }
                else{
                    valeur = false;
                }
            }
        }
        return  valeur;
    }
    
    /**
     * Methode qui nous permet de rafraîchir le
     * formulaire de connexion LoginGui
     */
    private void refreshLoginForm() {
        loginTfld.setText("");
        pwdTfld.setText("");
    }

    private void validationSurClavier(java.awt.event.KeyEvent evt) {
        //appel de la methode validation après le relachement de la touche Enter
        if(evt.getKeyCode()==10){
            validation();
        }
    }
    
}
