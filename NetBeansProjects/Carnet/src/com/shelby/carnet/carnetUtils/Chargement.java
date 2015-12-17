/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.carnetUtils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author shelby
 */
public class Chargement extends JDialog {
    	/**
    	 * 
    	 */
    	private static final long serialVersionUID = 1L;
    	static   JProgressBar dpb;
                     static   EndInstall terminerInstallation = new EndInstall();
    	public Chargement(JFrame parentFrame){
                                            
    		super(parentFrame," ",true);
                                               setTitle("Installation");
    		dpb = new JProgressBar(0, 500);
    		dpb.setIndeterminate(true);
    		this.add(BorderLayout.CENTER, dpb);
                setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        dpb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                
    		this.add(BorderLayout.NORTH, new JLabel("Procédure d'installation est configuration..."));
    		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); 
                                             Toolkit kit= Toolkit.getDefaultToolkit();
                                              Dimension dimensionEcran = kit.getScreenSize();
                                                int largeur  = dimensionEcran.width;
                                                int hauteur = dimensionEcran.height;
                                                setBounds((largeur- 350)/2,(hauteur-75)/2, 350, 75); 
                                                setResizable(false);
                                                this.setLocationRelativeTo(parentFrame);
     
    	}
     
    	public static void lcmt(final Chargement barProg){
    		Thread t;
                t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // on force l'appel sur l'EDT, sans que le thread courant ne soit bloqué (le setVisible(true) va bloquer l'appel, puisque le dialogue est modal)
                        SwingUtilities.invokeLater(new Runnable() {
                            
                            @Override
                            public void run() {
                                barProg.setVisible(true); // on affiche le dialogue (comme il est modale, ça bloque le thread courant)
                            }
                            
                        });
                        // la boucle d'attente est faite en dehors de l'EDT pour ne pas bloquer l'affichage (et éventuellement d'autres composants SWING dont on voudrait pouvoir se servir pendant la progression)
                        try {
                            Thread.sleep(8000);
                        } catch (InterruptedException e) {
                        }
                        // on ferme le dialogue sur l'EDT, ce qui garanti qu'il soit bien fermé après avoir été ouvert (enfin normalement ça devrait être le cas, même si on l'exécutait dans le thread courant, puisqu'il y a peu de risque que SWING rame pendant 5 secondes avant d'afficher le dialogue, mais on ne sait jamais)
                        SwingUtilities.invokeLater(new Runnable() {
                            
                            @Override
                            public void run() {
                                barProg.setVisible(false); // on ferme (on cache) le dialogue
                                barProg.dispose(); // si on ne sert plus du dialogue, autant libérer les ressources associées
                                terminerInstallation.setVisible(true);
                            }
                            
                        });
                    }
                });
    		t.start(); // lance le thread, qui affiche le dialogue, qui attend 5 s avant de refermer le dialogue
    	}
    } 