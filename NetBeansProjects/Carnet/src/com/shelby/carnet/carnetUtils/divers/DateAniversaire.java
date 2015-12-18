/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.carnetUtils.divers;

import java.util.Calendar;

/**
 *
 * @author shelby
 */
public class DateAniversaire {
   private Calendar aujourdhui = Calendar.getInstance();
      private Calendar calendrier = Calendar.getInstance();
      private int jour = calendrier.get(Calendar.DAY_OF_MONTH);
      private int mois;
      private String leMois;
      private int année;
      private int premierJourDuMois;
      private int nombreJour;
      private String jourActuel;
      private String tabMois[]= {"Janvier", "Fevrier", "Mars", "Avril", "Mai","Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Decembre"};
       private String tabJours[]= {"Dimanche","Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi","Samedi"};//pour doe la precision a une semaine de l'aniv

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }
      
       
      public void init(){
           mois = calendrier.get(Calendar.MONTH);
           leMois= tabMois[mois];
         année = calendrier.get(Calendar.YEAR);
         Calendar calcul = calendrier;
         calcul.set(Calendar.DAY_OF_MONTH, 1);
         premierJourDuMois = calcul.get(Calendar.DAY_OF_WEEK);    
         nombreJour = calendrier.getActualMaximum(Calendar.DAY_OF_MONTH); 
         for (int i=1; i<=nombreJour; i++) { 
            if (i==jour && mois==aujourdhui.get(Calendar.MONTH) && année==aujourdhui.get(Calendar.YEAR)){
                jourActuel =tabJours[premierJourDuMois-1];
                
            }
         }
      }

      public int bientotAniv(int votreJour){
          int totalRestant = votreJour-jour;
          return totalRestant;
      }
      
      
      public boolean  anivEstPasse(int votreJour){
          boolean anivPasse ;
         if( votreJour-jour<0){
             anivPasse = true;
         }
         else anivPasse=false;
          return anivPasse;
      }

    public String getLeMois() {
        return leMois;
    }

    public void setLeMois(String leMois) {
        this.leMois = leMois;
    }
      
  
      
}
