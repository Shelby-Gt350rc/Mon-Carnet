/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ComptesInfos.java
 *
 */

package carnet;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Patrick-Noah
 */
public final class ComptesInfos extends javax.swing.JPanel { 
    private String id;
    private int indice;
    /** Creates new form ComptesInfos
     * @param nl */
    public ComptesInfos(String []  nl) {
        setVisible(true);
        initComponents();
        setComptes( nl[0]);  
        setCompteInfos( nl[1]);
        setPhoto( nl[2]);
        setCategorieInfos( nl[3]);
        setCourriel( nl[4]); 
        setVersion(nl[5]); 
        setSgbd(nl[6]);
        setLogin( nl[7]);
        setPassword( nl[8]); 
        
    }
 
    public void setComptes(String tmp){
        comptesLbl.setText(tmp);
    }
    public void setPhoto(String tmp){
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
    public void setCompteInfos(String tmp){
        comptesInfosLbl.setText(tmp);
    }
    public void setCategorieInfos(String tmp){
        categorieInfosLbl.setText(tmp);
    }
    public void setCourriel(String tmp){
        adresseCourrielLbl.setText(tmp);
    }
    public void setLogin(String tmp){
        loginLbl.setText(tmp);
    }
     public void setPassword(String tmp){
         passwordLbl.setText(tmp);
    }
    public void setVersion(String tmp){
         versionLbl.setText(tmp);
    }
    public void setSgbd(String tmp){
         sgbdInfoLbl.setText(tmp);
    } 
 
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        sgbdLbl = new javax.swing.JLabel();
        sgbdInfoLbl = new javax.swing.JLabel();
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
        laversionLbl = new javax.swing.JLabel();
        versionLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(300, 500));
        setLayout(null);
        add(photoLbl);
        photoLbl.setBounds(10, 10, 150, 130);

        comptesLbl.setFont(new java.awt.Font("Palatino Linotype", 1, 27)); // NOI18N
        comptesLbl.setForeground(new java.awt.Color(0, 0, 204));
        add(comptesLbl);
        comptesLbl.setBounds(160, 20, 220, 60);
        add(jSeparator1);
        jSeparator1.setBounds(130, 150, 178, 10);

        infoSupLbl.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        infoSupLbl.setText("INFOS SUPPLEMENTAIRE ");
        add(infoSupLbl);
        infoSupLbl.setBounds(60, 170, 190, 20);

        compteInfoLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        compteInfoLbl.setText("Comptes");
        add(compteInfoLbl);
        compteInfoLbl.setBounds(70, 200, 80, 20);

        comptesInfosLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        comptesInfosLbl.setForeground(new java.awt.Color(0, 0, 204));
        comptesInfosLbl.setText("                       ");
        add(comptesInfosLbl);
        comptesInfosLbl.setBounds(160, 200, 200, 20);

        sgbdLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        sgbdLbl.setText("Sgbd");
        add(sgbdLbl);
        sgbdLbl.setBounds(70, 250, 40, 20);

        sgbdInfoLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        sgbdInfoLbl.setForeground(new java.awt.Color(0, 0, 204));
        add(sgbdInfoLbl);
        sgbdInfoLbl.setBounds(160, 250, 220, 20);

        categorieLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        categorieLbl.setText("Catégorie");
        add(categorieLbl);
        categorieLbl.setBounds(70, 280, 70, 20);

        categorieInfosLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        categorieInfosLbl.setForeground(new java.awt.Color(0, 0, 204));
        categorieInfosLbl.setText("                           ");
        add(categorieInfosLbl);
        categorieInfosLbl.setBounds(160, 280, 200, 20);

        courrielLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        courrielLbl.setText("Url");
        add(courrielLbl);
        courrielLbl.setBounds(70, 310, 70, 20);

        adresseCourrielLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        adresseCourrielLbl.setForeground(new java.awt.Color(0, 0, 204));
        adresseCourrielLbl.setText("                                     ");
        add(adresseCourrielLbl);
        adresseCourrielLbl.setBounds(160, 310, 200, 20);
        add(jSeparator2);
        jSeparator2.setBounds(110, 340, 230, 10);

        utilisateurLbl.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        utilisateurLbl.setText("UTILISATEUR");
        add(utilisateurLbl);
        utilisateurLbl.setBounds(60, 350, 100, 30);

        loginLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(0, 0, 204));
        loginLbl.setText("                                             ");
        add(loginLbl);
        loginLbl.setBounds(150, 390, 220, 20);

        passwordLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(0, 0, 204));
        passwordLbl.setText("                                                  ");
        add(passwordLbl);
        passwordLbl.setBounds(150, 430, 220, 20);

        pwdLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        pwdLbl.setText("Password");
        add(pwdLbl);
        pwdLbl.setBounds(70, 430, 80, 20);

        logLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        logLbl.setText("Login");
        add(logLbl);
        logLbl.setBounds(70, 390, 70, 20);

        laversionLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        laversionLbl.setText("Vesions");
        add(laversionLbl);
        laversionLbl.setBounds(70, 220, 50, 20);

        versionLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        versionLbl.setForeground(new java.awt.Color(0, 0, 204));
        add(versionLbl);
        versionLbl.setBounds(160, 220, 200, 20);
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
    private javax.swing.JLabel laversionLbl;
    private javax.swing.JLabel logLbl;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JLabel sgbdInfoLbl;
    private javax.swing.JLabel sgbdLbl;
    private javax.swing.JLabel utilisateurLbl;
    private javax.swing.JLabel versionLbl;
    // End of variables declaration//GEN-END:variables

  

}
