/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet;
import com.shelby.carnet.config.database.Fichier;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author shelby
 */
public class SaisieComptes extends javax.swing.JDialog {
  private String compte;
  private String infoComptes; 
  private String categorie;
  private String lienHttp; 
  private String login;
  private String passWord;
  private String thePass;
  private String algoDeSecurite;
  private String decalage;
   int clic=0;
 int clicSecurite=0; 
 private String logoComptesUrl="../../database/logoGmail.png";
    private int indice=0;
    private String urlPhoto= logoComptesUrl;
    private boolean testSaisie;
    private final String databaseComptesUrl="../../database/listeComptes.txt"; 
     ArrayList listeComptes = new  ArrayList();
  ArrayList historiqueComptes = new ArrayList();
  
  String[] confirmation = {"Valider", "Annuler","Fermer"}; 
  String[] confirmationRec = {"Reprendre","Quitter"}; 
   int rang;
   
   
private  String pwdSaisie ;
private static final int TAILLE_ALPHABET = 26;
private String texte; 
private String encodeSms;

    /**
     * Creates new form SaisieComptes
     */
    public SaisieComptes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
    public String getCompte() {
        return compte;
    }
    public void setCompte(String compte) {
        this.compte = compte;
    }
    public String getInfoComptes() {
        return infoComptes;
    }
    public void setInfoComptes(String infoComptes) {
        this.infoComptes = infoComptes;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public String getLienHttp() {
        return lienHttp;
    }
    public void setLienHttp(String lienHttp) {
        this.lienHttp = lienHttp;
    }  
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getThePass() {
        return thePass;
    }
    public void setThePass(String thePass) { 
        this.thePass = thePass;
    }
    
     public String getAlgoDeSecurite() {
        return algoDeSecurite;
    }

    public void setAlgoDeSecurite(String algoDeSecurite) {
        this.algoDeSecurite = algoDeSecurite;
    }

    public String getDecalage() {
        return decalage;
    }

    public void setDecalage(String decalage) {
        this.decalage = decalage;
    }

    public int getIndice(){
        return indice;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
    
    
    public String password(){ 
        char[] pwdTab = pwdTfld.getPassword();
        pwdSaisie = String.copyValueOf(pwdTab);
        return pwdSaisie.toString(); 
    }
    
     public void setUrlPhoto(String url) {
        this.urlPhoto = url;
    }
    public String getUrlPhoto(){
        return urlPhoto;
    }
    
    public void testSaisiePrioritaire(){
        String nonCompte =compteTfld.getText();
        String leLogin = loginTfld.getText();
        char[] mdpasse = pwdTfld.getPassword(); 
        String typeSecurite = (String)securiteCBox.getSelectedItem();
        if("".equals(nonCompte) || "".equals(leLogin) || "".equals(mdpasse)||"? - ?".equals(typeSecurite) )
        {   testSaisie=false;
        rang = JOptionPane.showOptionDialog(null, "Oubps !!!  veillez renseigner les informations réquise: celles avec une *, ou verifiez le type de sécurité", "Enregistrement !",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,  confirmationRec, confirmationRec[1]);
        String selectionner=confirmationRec[rang];
        if("Quitter".equals(selectionner)){
            dispose();
        }
        }else{
            testSaisie=true;
        }
    }
    
    
    private void ecrireLeComptes(String tmp){
     //lire le fichier listecontact.txt et le memoriser son contenu dans une liste
     lireLesComptes();
     //Enregistrer le neo contact en fin de la liste 
     listeComptes.add(tmp);
     //Ecrire l'integralite de la liste dans le fichier listecontact.txt
     ecrireLesComptes();
 }
 public void supprimer(int tmp){
     //lire le fichier listecontact.txt et le memoriser son contenu dans une liste
     lireLesComptes();
     //Supprimer le contact positionner à l'indice tmp
     listeComptes.remove(tmp);
     //Ecrire l'integralite de la liste dans le fichier listecontact.txt
     ecrireLesComptes();
 }
 private void lireLesComptes(){
     listeComptes = new ArrayList();
     Fichier leFichier = new  Fichier();
     leFichier.ouvrirEnLecture(databaseComptesUrl);
     String chaine ="";
     do{
         chaine = leFichier.lire();
         if (chaine != null) {
             listeComptes.add(chaine);
         }
     }while(chaine != null);
     leFichier.fermer();
 }
 private void ecrireLesComptes(){
     Fichier leFichier = new Fichier();
     leFichier.ouvrirEnEcriture(databaseComptesUrl);
     for(Object e: listeComptes){
         leFichier.ecrire((String) e);
     }
     leFichier.fermer();
 }
 
 
 
 
 

 
 
 
 
    
    
  //Recupére les does mise ajour dans la boite de dialogue
 public boolean  getDonnees(){
     return true;
 }
   private void setDonnees(){
        setCompte(compteTfld.getText());
        setInfoComptes((String)laMessagerieCBox.getSelectedItem()); 
        setCategorie((String)categorieCBox.getSelectedItem());
        setLienHttp(lienTfld.getText()); 
        setLogin(loginTfld.getText()); 
        setThePass(password());
        setPassWord(getEncodeSms());//recoit le pwd encodé
        setAlgoDeSecurite((String)securiteCBox.getSelectedItem());
        setDecalage((String)decalageCesarCBox.getSelectedItem());
        setIndice(totalIndice());
        
    }    
  
   
   
   
//changer la couleur du composant apres validation du click
    private void changerCouleur(JCheckBox tmp) {
    tmp.setForeground(new java.awt.Color(0, 153, 51));
      tmp.setOpaque(true); }
    //reinitialise la couleur du composant apres validation du click
    private void resetCouleur(JCheckBox tmp) {
    tmp.setForeground(Color.red);
      tmp.setOpaque(true); }
    
     private void changerCouleur(JLabel  tmp) {
      tmp.setForeground(new java.awt.Color(0, 153, 51));
      tmp.setOpaque(true);
     }
 private void resetCouleur(JLabel tmp){
     tmp.setForeground(Color.red);
     tmp.setOpaque(true);
 }

    private void resetComptes() { 
    compteTfld.setText("");
    categorieCBox.setSelectedIndex(0);
    laMessagerieCBox.setSelectedIndex(0);
    lienTfld.setText(""); 
    loginTfld.setText("");
    pwdTfld.setText("");
    visuelPwdJcBox.setSelected(false);
    visuelPwdLbl.setText("le mot de passe");
    visuelPwdLbl.setEnabled(false);
    securiteJcBox.setSelected(false);
    securiteCBox.setSelectedIndex(0);
    securiteCBox.setEnabled(false);
    encodageInfoLbl.setEnabled(false);
    encryptPasseLbl.setVisible(false);
    encryptePwdLbl.setVisible(false);
    resetCouleur(securiteJcBox);
    resetCouleur(securiteLbl);
    pwdTfld.setEnabled(true);
    }

public String Encodage(int decalage,String sms) {
        this.texte=sms;
        StringBuilder sb = new StringBuilder(texte.length());
        for (char c : texte.toCharArray()) {
            if (c >='a' && c <= 'z') {
                sb.append(decaleVar(c, decalage, 'a'));
            } else if (c > 'A' && c < 'Z') {
                sb.append(decaleVar(c, decalage, 'A'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

 private char decaleVar(char caractere, int decalage, char caractereBase) {
        int base = (int) caractereBase;
        if (decalage < 0) {
            base += TAILLE_ALPHABET - 1;
        }
        return (char) ((((int) caractere) - base + decalage) % TAILLE_ALPHABET + base);
    }

    public String getEncodeSms() {
        return encodeSms;
    }

    public void setEncodeSms(String encodeSms) {
        this.encodeSms = encodeSms;
    }

    //Totatl des indice pour affecter a chaque compte un indice unique
    private int totalIndice(){
        String chaine;
    	Fichier fic = new Fichier(); 
//        fic.ouvrirEnLecture(fichierConfig.getHistoDatabaseComptesUrl());
    	int i = 0;
    	do{
    		chaine = fic.lire();
    		if (chaine != null) { 
    			i++;
    		}
    	} while (chaine != null);
                       indice=i; 
    	fic.fermer();
        return i;
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
        infoBuleLbl = new javax.swing.JLabel();
        comptesLbl = new javax.swing.JLabel();
        compteTfld = new javax.swing.JTextField();
        infoRequiseLbl2 = new javax.swing.JLabel();
        categorieLbl = new javax.swing.JLabel();
        categorieCBox = new javax.swing.JComboBox();
        blocA = new javax.swing.JSeparator();
        InformationSup = new javax.swing.JLabel();
        decalageCesarCBox = new javax.swing.JComboBox();
        decalageCesarLbl = new javax.swing.JLabel();
        visuelPwdJcBox = new javax.swing.JCheckBox();
        securiteLbl = new javax.swing.JLabel();
        securiteJcBox = new javax.swing.JCheckBox();
        pwdLb = new javax.swing.JLabel();
        utilisateurLbl = new javax.swing.JLabel();
        securiteCBox = new javax.swing.JComboBox();
        infoRequiseLbl3 = new javax.swing.JLabel();
        laMessagerieCBox = new javax.swing.JComboBox();
        loginLbl = new javax.swing.JLabel();
        infoRequiseLbl4 = new javax.swing.JLabel();
        encodageInfoLbl = new javax.swing.JLabel();
        laMessagerieLbl = new javax.swing.JLabel();
        encryptePwdLbl = new javax.swing.JLabel();
        pwdTfld = new javax.swing.JPasswordField();
        loginTfld = new javax.swing.JTextField();
        validerCptBtn = new javax.swing.JButton();
        encryptPasseLbl = new javax.swing.JLabel();
        blocB = new javax.swing.JSeparator();
        lienLbl = new javax.swing.JLabel();
        annulerCptBtn = new javax.swing.JButton();
        lienTfld = new javax.swing.JTextField();
        visuelPwdLbl = new javax.swing.JLabel();
        infoRequiseLbl5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        photoLbl.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        photoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/shelby/carnet/resources/mesComptes.png"))); // NOI18N
        photoLbl.setName("photoLbl"); // NOI18N
        photoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                photoLblMouseReleased(evt);
            }
        });

        infoBuleLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 12)); // NOI18N
        infoBuleLbl.setText("cliquez sur cette icone"); // NOI18N
        infoBuleLbl.setEnabled(false);
        infoBuleLbl.setName("infoBuleLbl"); // NOI18N

        comptesLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        comptesLbl.setText("Compte"); // NOI18N
        comptesLbl.setName("comptesLbl"); // NOI18N

        compteTfld.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 20)); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.shelby.carnet.CarnetApp.class).getContext().getResourceMap(SaisieComptes.class);
        compteTfld.setText(resourceMap.getString("compteTfld.text")); // NOI18N
        compteTfld.setName("compteTfld"); // NOI18N

        infoRequiseLbl2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        infoRequiseLbl2.setForeground(new java.awt.Color(255, 0, 0));
        infoRequiseLbl2.setText("*"); // NOI18N
        infoRequiseLbl2.setName("infoRequiseLbl2"); // NOI18N

        categorieLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        categorieLbl.setText("Catégorie"); // NOI18N
        categorieLbl.setName("categorieLbl"); // NOI18N

        categorieCBox.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 18)); // NOI18N
        categorieCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Messagerie", "Réseau social", "SGBD", "Site web", "Système d'exploitation" }));
        categorieCBox.setName("categorieCBox"); // NOI18N
        categorieCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieCBoxActionPerformed(evt);
            }
        });

        blocA.setName("blocA"); // NOI18N

        InformationSup.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        InformationSup.setText("INFOS SUPPLEMENTAIRE"); // NOI18N
        InformationSup.setName("InformationSup"); // NOI18N

        decalageCesarCBox.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        decalageCesarCBox.setForeground(new java.awt.Color(0, 0, 204));
        decalageCesarCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        decalageCesarCBox.setEnabled(false);
        decalageCesarCBox.setName("decalageCesarCBox"); // NOI18N
        decalageCesarCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decalageCesarCBoxActionPerformed(evt);
            }
        });

        decalageCesarLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        decalageCesarLbl.setForeground(new java.awt.Color(0, 0, 204));
        decalageCesarLbl.setText("décalage"); // NOI18N
        decalageCesarLbl.setEnabled(false);
        decalageCesarLbl.setName("decalageCesarLbl"); // NOI18N

        visuelPwdJcBox.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 15)); // NOI18N
        visuelPwdJcBox.setForeground(new java.awt.Color(0, 0, 204));
        visuelPwdJcBox.setText("affiché/caché:"); // NOI18N
        visuelPwdJcBox.setName("visuelPwdJcBox"); // NOI18N
        visuelPwdJcBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visuelPwdJcBoxMouseClicked(evt);
            }
        });

        securiteLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        securiteLbl.setForeground(new java.awt.Color(255, 0, 0));
        securiteLbl.setText("sécurité:"); // NOI18N
        securiteLbl.setName("securiteLbl"); // NOI18N

        securiteJcBox.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        securiteJcBox.setForeground(new java.awt.Color(255, 0, 0));
        securiteJcBox.setText("on/off"); // NOI18N
        securiteJcBox.setName("securiteJcBox"); // NOI18N
        securiteJcBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securiteJcBoxMouseClicked(evt);
            }
        });

        pwdLb.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        pwdLb.setText("Password"); // NOI18N
        pwdLb.setName("pwdLb"); // NOI18N

        utilisateurLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        utilisateurLbl.setText("UTILISATEUR"); // NOI18N
        utilisateurLbl.setName("utilisateurLbl"); // NOI18N

        securiteCBox.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        securiteCBox.setForeground(new java.awt.Color(0, 0, 204));
        securiteCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "? - ?", "Binaire", "Cesar", "Playfair", "Vigenaire" }));
        securiteCBox.setEnabled(false);
        securiteCBox.setName("securiteCBox"); // NOI18N
        securiteCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securiteCBoxActionPerformed(evt);
            }
        });

        infoRequiseLbl3.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        infoRequiseLbl3.setForeground(new java.awt.Color(255, 0, 0));
        infoRequiseLbl3.setText("*"); // NOI18N
        infoRequiseLbl3.setName("infoRequiseLbl3"); // NOI18N

        laMessagerieCBox.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        laMessagerieCBox.setForeground(new java.awt.Color(0, 0, 204));
        laMessagerieCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "? - ?", "Yahoo-mail", "Yahoo - messenger", "Google - mail", "Google plus", "Skype", "Nimbuzz!" }));
        laMessagerieCBox.setName("laMessagerieCBox"); // NOI18N

        loginLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        loginLbl.setText("Login"); // NOI18N
        loginLbl.setName("loginLbl"); // NOI18N

        infoRequiseLbl4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        infoRequiseLbl4.setForeground(new java.awt.Color(255, 0, 0));
        infoRequiseLbl4.setText("*"); // NOI18N
        infoRequiseLbl4.setName("infoRequiseLbl4"); // NOI18N

        encodageInfoLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 2, 15)); // NOI18N
        encodageInfoLbl.setForeground(new java.awt.Color(51, 153, 0));
        encodageInfoLbl.setText("type d'encodage"); // NOI18N
        encodageInfoLbl.setEnabled(false);
        encodageInfoLbl.setName("encodageInfoLbl"); // NOI18N

        laMessagerieLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        laMessagerieLbl.setText("Messageries"); // NOI18N
        laMessagerieLbl.setName("laMessagerieLbl"); // NOI18N

        encryptePwdLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 15)); // NOI18N
        encryptePwdLbl.setForeground(new java.awt.Color(0, 153, 0));
        encryptePwdLbl.setText("encryt pass "); // NOI18N
        encryptePwdLbl.setName("encryptePwdLbl"); // NOI18N

        pwdTfld.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        pwdTfld.setForeground(new java.awt.Color(0, 0, 204));
        pwdTfld.setName("pwdTfld"); // NOI18N

        loginTfld.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        loginTfld.setForeground(new java.awt.Color(0, 0, 204));
        loginTfld.setName("loginTfld"); // NOI18N

        validerCptBtn.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 18)); // NOI18N
        validerCptBtn.setText("Valider"); // NOI18N
        validerCptBtn.setName("validerCptBtn"); // NOI18N
        validerCptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerCptBtnActionPerformed(evt);
            }
        });

        encryptPasseLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 15)); // NOI18N
        encryptPasseLbl.setForeground(new java.awt.Color(0, 0, 204));
        encryptPasseLbl.setText("Encryt passe"); // NOI18N
        encryptPasseLbl.setName("encryptPasseLbl"); // NOI18N

        blocB.setName("blocB"); // NOI18N

        lienLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 14)); // NOI18N
        lienLbl.setText("Http://"); // NOI18N
        lienLbl.setName("lienLbl"); // NOI18N

        annulerCptBtn.setFont(new java.awt.Font("LM Roman Dunhill 10", 1, 18)); // NOI18N
        annulerCptBtn.setText("Annuler"); // NOI18N
        annulerCptBtn.setName("annulerCptBtn"); // NOI18N
        annulerCptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerCptBtnActionPerformed(evt);
            }
        });

        lienTfld.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lienTfld.setName("lienTfld"); // NOI18N

        visuelPwdLbl.setFont(new java.awt.Font("LM Roman Dunhill 10", 0, 15)); // NOI18N
        visuelPwdLbl.setForeground(new java.awt.Color(0, 153, 51));
        visuelPwdLbl.setText(resourceMap.getString("visuelPwdLbl.text")); // NOI18N
        visuelPwdLbl.setEnabled(false);
        visuelPwdLbl.setName("visuelPwdLbl"); // NOI18N

        infoRequiseLbl5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        infoRequiseLbl5.setForeground(new java.awt.Color(255, 0, 0));
        infoRequiseLbl5.setText("*"); // NOI18N
        infoRequiseLbl5.setName("infoRequiseLbl5"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoBuleLbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comptesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categorieLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categorieCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compteTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(infoRequiseLbl2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blocA, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(laMessagerieLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(laMessagerieCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lienLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                        .addComponent(lienTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(InformationSup))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(utilisateurLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(pwdLb)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pwdTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(infoRequiseLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(loginTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(infoRequiseLbl3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(visuelPwdJcBox)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(visuelPwdLbl))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(encryptPasseLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(encryptePwdLbl)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(blocB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(securiteLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securiteJcBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securiteCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decalageCesarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decalageCesarCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encodageInfoLbl)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(validerCptBtn)
                .addGap(7, 7, 7)
                .addComponent(annulerCptBtn))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(401, 401, 401)
                    .addComponent(infoRequiseLbl4)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comptesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(compteTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(infoRequiseLbl2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categorieLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categorieCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoBuleLbl)
                            .addComponent(blocA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(photoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InformationSup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(laMessagerieLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laMessagerieCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lienLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lienTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blocB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(utilisateurLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoRequiseLbl3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdLb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdTfld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoRequiseLbl5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visuelPwdJcBox)
                    .addComponent(visuelPwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptPasseLbl)
                    .addComponent(encryptePwdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securiteLbl)
                    .addComponent(securiteCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securiteJcBox)
                    .addComponent(encodageInfoLbl)
                    .addComponent(decalageCesarCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decalageCesarLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerCptBtn)
                    .addComponent(annulerCptBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(infoRequiseLbl4)
                    .addContainerGap(411, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void photoLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoLblMouseReleased
        infoBuleLbl.setText("Faite une mise à jours");
        infoBuleLbl.setEnabled(true);
        File fichierPhoto;
        JFileChooser fichierArechercher = new JFileChooser();
        int etatRetour = fichierArechercher.showOpenDialog(SaisieComptes.this);
        if(etatRetour == JFileChooser.APPROVE_OPTION){
            fichierPhoto = fichierArechercher.getSelectedFile();
            logoComptesUrl = fichierPhoto.toString();
            setUrlPhoto(logoComptesUrl);//prise en compte de l'url de l'image
            setPhoto(logoComptesUrl);
        }
    }//GEN-LAST:event_photoLblMouseReleased

    private void categorieCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieCBoxActionPerformed
        
    }//GEN-LAST:event_categorieCBoxActionPerformed

    private void decalageCesarCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decalageCesarCBoxActionPerformed
         
    }//GEN-LAST:event_decalageCesarCBoxActionPerformed

    private void visuelPwdJcBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visuelPwdJcBoxMouseClicked
       
    }//GEN-LAST:event_visuelPwdJcBoxMouseClicked

    private void securiteJcBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securiteJcBoxMouseClicked
         
    }//GEN-LAST:event_securiteJcBoxMouseClicked

    private void securiteCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securiteCBoxActionPerformed
         
    }//GEN-LAST:event_securiteCBoxActionPerformed

    private void validerCptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerCptBtnActionPerformed
        rang = JOptionPane.showOptionDialog(null, "Veuillez confirmer cet enregistrement !", "Enregistrement !",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null,  confirmation, confirmation[2]);
        String selectionner=confirmation[rang];
        if("Valider".equals(selectionner)){
            setDonnees();
            testSaisiePrioritaire();
            if(testSaisie== true) {
//                fichierTelch.copierImage(urlPhoto);
                String informations = compte+";"+ infoComptes +";" +logoComptesUrl+ ";" +categorie+ "; "+lienHttp+ ";"+ login+";"+passWord+";"+algoDeSecurite+";"+decalage+";"+indice+";"+thePass;
                ecrireLeComptes(informations);
                dispose();
            }

        }
        else if("Annuler".equals(selectionner)){
            resetComptes();
        }
        else{
            dispose();
        }
    }//GEN-LAST:event_validerCptBtnActionPerformed

    private void annulerCptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerCptBtnActionPerformed
    
    }//GEN-LAST:event_annulerCptBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SaisieComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaisieComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaisieComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaisieComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SaisieComptes dialog = new SaisieComptes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InformationSup;
    private javax.swing.JButton annulerCptBtn;
    private javax.swing.JSeparator blocA;
    private javax.swing.JSeparator blocB;
    private javax.swing.JComboBox categorieCBox;
    private javax.swing.JLabel categorieLbl;
    private javax.swing.JTextField compteTfld;
    private javax.swing.JLabel comptesLbl;
    private javax.swing.JComboBox decalageCesarCBox;
    private javax.swing.JLabel decalageCesarLbl;
    private javax.swing.JLabel encodageInfoLbl;
    private javax.swing.JLabel encryptPasseLbl;
    private javax.swing.JLabel encryptePwdLbl;
    private javax.swing.JLabel infoBuleLbl;
    private javax.swing.JLabel infoRequiseLbl2;
    private javax.swing.JLabel infoRequiseLbl3;
    private javax.swing.JLabel infoRequiseLbl4;
    private javax.swing.JLabel infoRequiseLbl5;
    private javax.swing.JComboBox laMessagerieCBox;
    private javax.swing.JLabel laMessagerieLbl;
    private javax.swing.JLabel lienLbl;
    private javax.swing.JTextField lienTfld;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JTextField loginTfld;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JLabel pwdLb;
    private javax.swing.JPasswordField pwdTfld;
    private javax.swing.JComboBox securiteCBox;
    private javax.swing.JCheckBox securiteJcBox;
    private javax.swing.JLabel securiteLbl;
    private javax.swing.JLabel utilisateurLbl;
    private javax.swing.JButton validerCptBtn;
    private javax.swing.JCheckBox visuelPwdJcBox;
    private javax.swing.JLabel visuelPwdLbl;
    // End of variables declaration//GEN-END:variables
}
