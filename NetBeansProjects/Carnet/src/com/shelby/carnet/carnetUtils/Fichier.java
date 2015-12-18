/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.carnetUtils;

import carnet.DatabaseTxt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author shelby
 */
public class Fichier {
   
 DatabaseTxt fichierConfig= new DatabaseTxt();//Classe ayant le fichier de configuration
 private   BufferedWriter fW;
 private   BufferedReader fR;
 private   String urlFichier;
 private String databaseUrl=fichierConfig.getUrlConfig();
 boolean valeur;
 private String loginTrouve;
private String pwdTrouve;


 public void setUrlFichier(String tmp){
      urlFichier = tmp;
 }
 // Ouvrir un fichier en lecture
 public boolean  ouvrirEnLecture(String nf) {
	try {
            setUrlFichier(nf);
            File f = new File(urlFichier);
	    fR  = new BufferedReader(new FileReader(f));
            fW = null;
            return true;
	}
	catch (IOException e)	{
                System.out.println(urlFichier+" : Erreur  à l'ouverture en lecture");
		return false;
	}
 }
 
 public boolean  ouvrirDbEnLecture(String nf) {
	try {
            setUrlFichier(nf);
            File f = new File(urlFichier);
	    fR  = new BufferedReader(new FileReader(f));
                           while(true){
                                String ligneLue = fR.readLine() ;
                                    if (ligneLue == null) break ;
                                    StringTokenizer token = new StringTokenizer (ligneLue, " ") ;
                                    int nbval = token.countTokens() ;
                                    String[] monToken = new String[nbval];
                                    for (int i = 1; i < monToken.length; i++) {
                                        String val =token.nextToken() ;
                                        monToken[i]=val;
                                        if(i==1){
                                            setLoginTrouve(monToken[i]);
                                            System.out.println ("Token n° "+i+" valeur "+monToken[i]) ;
                                        }
                                          if(i==2){
                                              setPwdTrouve(monToken[i]);
                                            System.out.println ("Token n° "+i+" valeur "+monToken[i]) ;
                                        }
                                    }
                           }
            fW = null;
            return true;
	}
	catch (IOException e)	{
                System.out.println(urlFichier+" : Erreur  à l'ouverture en lecture");
		return false;
	}
 }
 
 
 public String lire()  {
     try {
	String chaine = fR.readLine();
	return chaine;
        }
	catch (IOException err) { 
		System.out.println(urlFichier+" : Erreur  de lecture ");
                return null;
	}
 }


 public String [] extraireDonnees(String tmp)  {
    if (tmp != null) {
      StringTokenizer st = new StringTokenizer(tmp,";");
      int i=0;
      String mot[] = new String[st.countTokens()];
      while (st.hasMoreTokens()) {
         mot[i] = st.nextToken();
         i++;
       }
       return mot;
     }
     else return null;
 }


 public boolean fermer()  {
     try {
       if (fR != null) fR.close();
       else  if (fW != null) fW.close();
       return true;
     }
     catch (IOException err) {
	System.out.println(urlFichier+" : Erreur  à la fermeture ");
        return false;
     }
 }
  // Ouvrir un fichier en écriture
  public boolean  ouvrirEnEcriture(String nf) {
	try {
            setUrlFichier(nf);
            File f = new File(urlFichier);
	    fW = new BufferedWriter(new FileWriter(f));
            fR = null;
            return true;
	}
	catch (IOException e)	{
                System.out.println(urlFichier+" : Erreur  à l'ouverture en écriture ");
		return false;
	}
 }


 public boolean ecrire(String tmp) {
      try {
 	if (tmp != null)   {
		fW.write(tmp,0,tmp.length());
		fW.newLine();
	}
        return true;
        }
	catch (IOException err) {
		System.out.println(urlFichier+" : Erreur  d'écriture ");
                return false;
	}
   }
 
 
 
public boolean IsAdmin(String login, String mdp){
    ouvrirDbEnLecture(databaseUrl);
    if(login.equals(getLoginTrouve())  && (mdp.equals(getPwdTrouve()))){
     valeur = true;   
    }
    else{
        valeur = false;
    }
    fermer(); 
    System.out.println("valeur : "+valeur);
    return valeur;
}

public boolean IsAdmin(String mdp){
    ouvrirDbEnLecture(databaseUrl);
    if( mdp.equals(getPwdTrouve())){
     valeur = true;   
    }
    else{
        valeur = false;
    }
    fermer(); 
    System.out.println("valeur : "+valeur);
    return valeur;
}


public boolean  isVide(){
    boolean fichierVide = false;
    return fichierVide;
}








    public String getLoginTrouve() {
        return loginTrouve;
    }

    public void setLoginTrouve(String loginTrouve) {
        this.loginTrouve = loginTrouve;
    }

    public String getPwdTrouve() {
        return pwdTrouve;
    }

    public void setPwdTrouve(String pwdTrouve) {
        this.pwdTrouve = pwdTrouve;
    }
    
}
