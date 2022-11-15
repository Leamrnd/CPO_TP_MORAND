/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSONNAGES;

/**
 *
 * @author leamo
 */
public class Magicien extends Personnage{
    boolean confirme;
    
    public Magicien(String n , int i, boolean c) {
        super(n,i);
        confirme = c;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        String rep;
        if (this.arme_en_main == null){
            if (confirme == true){
            return "Magicien{" + nom + " " + PV+ " confirme}";
            }
            else {
            return  "Magicien{" + nom + " " + PV+ " novice}"; 
            }
        }
        else {
            if (confirme == true){
            return "Magicien{" + nom + " " + PV+ " confirme " + arme_en_main + "}";
            }
            else {
            return  "Magicien{" + nom + " " + PV+ " novice " + arme_en_main + "}"; 
            }
        }
                
    }
}
    
    

