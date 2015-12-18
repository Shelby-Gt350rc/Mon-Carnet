/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.carnetUtils;

import carnet.DatabaseTxt;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shelby
 */
public class Download {
 private static boolean outExiste;
    private static String ficOut;
    private static FileReader in = null;
    private static FileWriter out = null;
    DatabaseTxt fichierConfig = new DatabaseTxt(); 
    private String dossier =fichierConfig.getUrlConfigFolder();
    
    public void copierImage(String urlImage){ 
      // Créer le dossier avec tous ses parents
            new File(dossier).mkdirs();
            //Creation du fichier.txt dans le dossier créer
            ficOut = dossier + "/" + "uploadImage.bat"; 
                try {
                    out = new FileWriter(ficOut);
                    out.write("@echo off\n" +
                                                            "rem +\n" +
                                                            "rem Transfert Image.cmd\n" +
                                                            "rem - \n" +
                                                            "echo By Patrick-Noah\n" +
                                                            "set  urlImageContacts="+urlImage+"\n" +
                                                            "copy %urlImageContacts% C:\\IceDatabase\\Carnetdb\\images\\\n" +
                                                            "exit"); // on le crée vide dans cet exemple
                } catch (IOException ioe2) {
                    
                }  
            
            if (out != null) {
                try {
                    out.close();
                     telechargerImage("uploadImage.bat"); //telechargement de l'image dans le repertoire
                } catch (IOException ioe) {
                    System.out.println("Erreur: " + ioe.toString());
                }
            } 
    }   
         public void telechargerImage(String monTransfert){
         Process p = null;
    try {
        p = Runtime.getRuntime().exec("cmd /c start C:/IceDatabase/Carnetdb/config/"+monTransfert);
    } catch (IOException ex) {
        Logger.getLogger(Configurations.class.getName()).log(Level.SEVERE, null, ex);
    }
    InputStream in = p.getInputStream();
    OutputStream out = p.getOutputStream(); 
    
    }
          
}
