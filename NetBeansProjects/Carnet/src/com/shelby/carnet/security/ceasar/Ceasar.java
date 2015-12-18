/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.security.ceasar;

/**
 *
 * @author shelby
 */
public class Ceasar {
    String  pwdAchiffrer;
    String  pwdChiffrer;
    
    public void crytperPwd(String pwd, int clef){
        this.pwdAchiffrer = pwd;
        System.out.println(" Je suis crypter et ma clef est : "+clef);
    }
}
