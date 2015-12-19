/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.config.database;

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
    
    private BufferedReader fR;
    private BufferedWriter fW;
    private String urlFichier;
    
    public void setUrlFichier(String tmp){
        urlFichier = tmp;
    }
    
    //Ouverture d'un fichier en lecture
    public  boolean ouvrirEnLecture(String nf){
        try {
            setUrlFichier(nf);
            File leFichier = new File(urlFichier);
            fR  = new BufferedReader(new FileReader(leFichier));
            fW = null;
            return  true;
        } catch (IOException e) {
            System.out.println(urlFichier+" : Erreur à l'ouverture en lecture du fichier");
            return false;
        }
    }
    
    
    
/*
 *La méthode lire nous permet de lire une chaine de caractere
 */
    public String lire(){
        try {
            String chaine = fR.readLine();
            return chaine;
       } catch (IOException e) {
            System.out.println(urlFichier+" :  Erreur de lecture ");
            return null;
        }
    }
    
/*
 *La méthode extraireDonnees  permet l'extaction des données et prend en parrametre 
    une chaine de caractère qui correspondra a la chaine lu dans le fichier 
 */
    public  String[] extraireDonnees(String tmp){
        if(tmp != null){
            //creation d'un objet stoken de type StringTokenizer pour effectuer le decoupage 
            //en Java avec (;)comme séparateu de champs
            StringTokenizer stoken = new StringTokenizer(tmp,";");
            int i =0;
            String mot[] = new String[stoken.countTokens()];
            while (stoken.hasMoreTokens()) {                
                mot[i] = stoken.nextToken();
                i++;
            }
            return  mot;
        }else{
            return  null;
        }
    }
    
    
    public  boolean  fermer(){
        try {
            if(fR != null){
                fR.close();
            }else{
                if(fW != null){
                    fW.close();
                }
            }
            return true;
        } catch (IOException e) {
            System.out.println(urlFichier+" : Erreur a la fermeture");
            return false;
        }
    }
    
    
    
    //Ouvrir un fichier en écriture
    
    public boolean  ouvrirEnEcriture(String nf){
        try {
            setUrlFichier(nf);
            File leFifchier = new File(urlFichier);
            fW = new BufferedWriter(new FileWriter(leFifchier));
            fR  = null;
            return  true;
        } catch (IOException e) {
            System.out.println(urlFichier+" : Erreur à l'écriture ");
            return  false;
        }
    }
    
    public boolean  ecrire(String tmp){
        try {
            if(tmp != null){
                fW.write(tmp,0,tmp.length());
                fW.newLine();
            }
            return true;
        } catch (Exception e) {
            System.out.println(urlFichier+" : Erreur d'écriture ");
            return false;
        }
    }
    
}
