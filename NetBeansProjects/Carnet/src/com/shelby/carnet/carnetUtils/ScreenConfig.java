/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.carnetUtils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author shelby
 */
public class ScreenConfig extends JFrame{
    String title;
 /**
 *La procedure centerEcran() permet de centrer toutes les
 * interfaces.
 * 
     * @param title
 */
      public void centerEcran(String title) {
          this.title = title;
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimensionEcran = kit.getScreenSize();
        int largeur = dimensionEcran.width;
        int hauteur = dimensionEcran.height;
        setTitle(title);
        setBounds((largeur-440)/2,(hauteur-310)/2, 440,310);
        setResizable(false);
    }
      
 
}
