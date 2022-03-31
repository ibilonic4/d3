/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Start {
    
    public static void main(String[] args) {
        
 Vlasnik v = new Vlasnik();

 v.setIme(Pomocno.ucitajString("unesi ime"));
 v.setDob(Pomocno.ucitajBroj("unesi godine"));
 v.setLijep(Pomocno.ucitajBoolean("unesi true ili false"));
 v.getZivotinja().setIme(Pomocno.ucitajString("ime zivotinje"));
 v.getZivotinja().setVrsta(Pomocno.ucitajString("vrsta"));
 
        System.out.println(v.getIme() + " " + v.getDob() + " " + v.getZivotinja().getIme() + " " + v.getZivotinja().getVrsta());
    
    
   
        
    }
    
    
    
    
    
    
}
