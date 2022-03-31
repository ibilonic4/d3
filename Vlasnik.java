/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author Ivor
 */
public class Vlasnik extends Stvorenja{
    
    private String ime; 
    private int dob;
    private boolean lijep;
    private Zivotinja zivotinja;

    public Vlasnik() {
        
        this.zivotinja = new Zivotinja();
    }

    public Vlasnik(String ime, int dob, boolean lijep) {
        this.ime = ime;
        this.dob = dob;
        this.lijep = lijep;
    }

    
    
    
    
    
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public boolean isLijep() {
        return lijep;
    }

    public void setLijep(boolean lijep) {
        this.lijep = lijep;
    }

    public Zivotinja getZivotinja() {
        return zivotinja;
    }

    public void setZivotinja(Zivotinja zivotinja) {
        this.zivotinja = zivotinja;
    }

    
}
