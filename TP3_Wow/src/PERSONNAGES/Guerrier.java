/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSONNAGES;

/**
 *
 * @author leamo
 */
public class Guerrier extends Personnage{
    boolean cheval;
    
    public Guerrier(String n , int i, boolean c) {
        super(n,i);
        cheval = c;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        String rep;
        if (cheval == true) 
        rep = "Guerrier{" + nom + " " + PV + " a cheval";
        else {
          rep = "Guerrier{" + nom + " " + PV + " a pied  " ;
        }
        
        
        if (arme_en_main != null) rep = rep + this.arme_en_main +"}";
        
        else {
            rep += "}";
        }
       
        return rep;
    }
}
  
