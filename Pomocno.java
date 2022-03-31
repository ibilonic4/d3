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
public class Pomocno {
    
    
    static int ucitajBroj(String s){
    while(true){
    try{return Integer.parseInt(JOptionPane.showInputDialog(s));}
    catch(Exception e){JOptionPane.showMessageDialog(null, "moraš unjeti broj");}
    
    }
    
    }
    
    
    static String ucitajString(String poruka){
    
    while(true){
    
    String s = JOptionPane.showInputDialog(poruka);
    if(s.trim().length()==0){JOptionPane.showMessageDialog(null, "unesi to što trebas");}
    else{return s;}
    
    }
    
    
    
    }
    
 static boolean ucitajBoolean(String s){
while(true){
    try{return Boolean.parseBoolean(JOptionPane.showInputDialog(s));}
    catch(Exception e){JOptionPane.showMessageDialog(null, "moraš unjeti true ili false");}

}
}
}