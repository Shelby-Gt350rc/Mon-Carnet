/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author shelby
 */
public class InfosComptes extends javax.swing.JPanel {

    /**
     * Creates new form InfosComptes
     * @param nl
     */
    public InfosComptes(String [] nl) {
        setVisible(true);
        initComponents();
         setComptes(nl[0]);
        setCompteInfos(nl[1]);
        setPhoto( nl[2]);
        setCategorieInfos( nl[3]);
        setCourriel( nl[4]); 
        setLogin( nl[5]);
        setPassword( nl[6]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoLbl = new javax.swing.JLabel();
        comptesLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        infoSupLbl = new javax.swing.JLabel();
        compteInfoLbl = new javax.swing.JLabel();
        comptesInfosLbl = new javax.swing.JLabel();
        categorieLbl = new javax.swing.JLabel();
        categorieInfosLbl = new javax.swing.JLabel();
        courrielLbl = new javax.swing.JLabel();
        adresseCourrielLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        utilisateurLbl = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        pwdLbl = new javax.swing.JLabel();
        logLbl = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setName("Form"); // NOI18N
        setLayout(null);

        photoLbl.setName("photoLbl"); // NOI18N
        add(photoLbl);
        photoLbl.setBounds(10, 10, 150, 130);

        comptesLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 30)); // NOI18N
        comptesLbl.setForeground(new java.awt.Color(0, 0, 204));
        comptesLbl.setName("comptesLbl"); // NOI18N
        add(comptesLbl);
        comptesLbl.setBounds(160, 20, 220, 60);

        jSeparator1.setName("jSeparator1"); // NOI18N
        add(jSeparator1);
        jSeparator1.setBounds(130, 150, 178, 10);

        infoSupLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 12)); // NOI18N
        infoSupLbl.setForeground(new java.awt.Color(0, 0, 153));
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.shelby.carnet.CarnetApp.class).getContext().getResourceMap(InfosComptes.class);
        infoSupLbl.setText(resourceMap.getString("infoSupLbl.text")); // NOI18N
        infoSupLbl.setName("infoSupLbl"); // NOI18N
        add(infoSupLbl);
        infoSupLbl.setBounds(60, 160, 190, 20);

        compteInfoLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 16)); // NOI18N
        compteInfoLbl.setText(resourceMap.getString("compteInfoLbl.text")); // NOI18N
        compteInfoLbl.setName("compteInfoLbl"); // NOI18N
        add(compteInfoLbl);
        compteInfoLbl.setBounds(70, 180, 80, 30);

        comptesInfosLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 18)); // NOI18N
        comptesInfosLbl.setForeground(new java.awt.Color(0, 0, 204));
        comptesInfosLbl.setText(resourceMap.getString("comptesInfosLbl.text")); // NOI18N
        comptesInfosLbl.setName("comptesInfosLbl"); // NOI18N
        add(comptesInfosLbl);
        comptesInfosLbl.setBounds(160, 180, 230, 30);

        categorieLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 16)); // NOI18N
        categorieLbl.setText(resourceMap.getString("categorieLbl.text")); // NOI18N
        categorieLbl.setName("categorieLbl"); // NOI18N
        add(categorieLbl);
        categorieLbl.setBounds(70, 220, 70, 30);

        categorieInfosLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 18)); // NOI18N
        categorieInfosLbl.setForeground(new java.awt.Color(0, 0, 204));
        categorieInfosLbl.setText(resourceMap.getString("categorieInfosLbl.text")); // NOI18N
        categorieInfosLbl.setName("categorieInfosLbl"); // NOI18N
        add(categorieInfosLbl);
        categorieInfosLbl.setBounds(160, 220, 230, 30);

        courrielLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 16)); // NOI18N
        courrielLbl.setText(resourceMap.getString("courrielLbl.text")); // NOI18N
        courrielLbl.setName("courrielLbl"); // NOI18N
        add(courrielLbl);
        courrielLbl.setBounds(70, 250, 70, 30);

        adresseCourrielLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 18)); // NOI18N
        adresseCourrielLbl.setForeground(new java.awt.Color(0, 0, 204));
        adresseCourrielLbl.setText(resourceMap.getString("adresseCourrielLbl.text")); // NOI18N
        adresseCourrielLbl.setName("adresseCourrielLbl"); // NOI18N
        add(adresseCourrielLbl);
        adresseCourrielLbl.setBounds(160, 250, 230, 30);

        jSeparator2.setName("jSeparator2"); // NOI18N
        add(jSeparator2);
        jSeparator2.setBounds(110, 280, 230, 10);

        utilisateurLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 12)); // NOI18N
        utilisateurLbl.setForeground(new java.awt.Color(0, 0, 153));
        utilisateurLbl.setText(resourceMap.getString("utilisateurLbl.text")); // NOI18N
        utilisateurLbl.setName("utilisateurLbl"); // NOI18N
        add(utilisateurLbl);
        utilisateurLbl.setBounds(60, 290, 100, 30);

        loginLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 18)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 0, 204));
        loginLbl.setText(resourceMap.getString("loginLbl.text")); // NOI18N
        loginLbl.setName("loginLbl"); // NOI18N
        add(loginLbl);
        loginLbl.setBounds(150, 310, 250, 40);

        passwordLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 18)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(0, 0, 204));
        passwordLbl.setName("passwordLbl"); // NOI18N
        add(passwordLbl);
        passwordLbl.setBounds(150, 350, 250, 40);

        pwdLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 16)); // NOI18N
        pwdLbl.setForeground(resourceMap.getColor("pwdLbl.foreground")); // NOI18N
        pwdLbl.setText(resourceMap.getString("pwdLbl.text")); // NOI18N
        pwdLbl.setName("pwdLbl"); // NOI18N
        add(pwdLbl);
        pwdLbl.setBounds(70, 360, 80, 30);

        logLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 16)); // NOI18N
        logLbl.setForeground(new java.awt.Color(0, 0, 153));
        logLbl.setText(resourceMap.getString("logLbl.text")); // NOI18N
        logLbl.setName("logLbl"); // NOI18N
        add(logLbl);
        logLbl.setBounds(70, 320, 70, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresseCourrielLbl;
    private javax.swing.JLabel categorieInfosLbl;
    private javax.swing.JLabel categorieLbl;
    private javax.swing.JLabel compteInfoLbl;
    private javax.swing.JLabel comptesInfosLbl;
    private javax.swing.JLabel comptesLbl;
    private javax.swing.JLabel courrielLbl;
    private javax.swing.JLabel infoSupLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logLbl;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JLabel utilisateurLbl;
    // End of variables declaration//GEN-END:variables

    private void setComptes(String tmp) {
        comptesLbl.setText(tmp);
    }

    private void setCompteInfos(String tmp) {
        comptesInfosLbl.setText(tmp);
    }

    private void setPhoto(String tmp) {
        //Creer un icon
      ImageIcon iconPhotos = new ImageIcon(tmp);
      //Transformer l'icone en image
      Image  uneImage = iconPhotos.getImage();
      //reduire la taille de l'image de a 128 * 128
      uneImage = uneImage.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
      //transformer l'image en Icon
      iconPhotos.setImage(uneImage);
      photoLbl.setIcon(iconPhotos);
    }

    private void setCategorieInfos(String tmp) {
          categorieInfosLbl.setText(tmp);
    }

    private void setCourriel(String tmp) {
        adresseCourrielLbl.setText(tmp);
    }

    private void setLogin(String tmp) {
        loginLbl.setText(tmp);
    }

    private void setPassword(String tmp) {
        passwordLbl.setText(tmp);
    }
}
