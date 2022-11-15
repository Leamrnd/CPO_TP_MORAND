/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSONNAGES;
import ARMES.*;
import ARMES.Armes;
import java.util.ArrayList;

/**
 *
 * @author leamo
 */
public class Personnage {
    String nom;
    int PV;
    ArrayList<Armes> InvPerso = new ArrayList<Armes>();
    Armes arme_en_main;
    
    public Personnage (String unNom, int nbPV) {
        nom = unNom;
        PV = nbPV;
        arme_en_main = null;
       
        
        if (PV < 0) PV = 0;
        
    }
    
    @Override 
    public String toString() {
      arme_en_main = null;
        String rep;
        rep = nom + PV + " PV" + arme_en_main;
        return rep;
    }
    


   
    public void ajouterArme(Armes a) {
        if (InvPerso.size() < 5) InvPerso.add(a);
    }

    public Armes getArme_en_main() {
        return arme_en_main;
    }
    
    
    public void choisirArme(String n) {
        for (int i = 0 ; i < 5; i++) {
            if (InvPerso.get(i).getNom().equals(n)) {
                arme_en_main = InvPerso.get(i);
                System.out.println(n + " a bien ete equipe");
            }
            }
        }
    }
    
    

