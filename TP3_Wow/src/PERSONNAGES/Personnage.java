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
    


   
    public void ajouterArme(Armes a) {
        if (InvPerso.size() < 5) InvPerso.add(a);
        System.out.println(a + " a bien ete ajoute a " + nom);
    }

    public Armes getArme_en_main() {
        return arme_en_main;
    }
    
    
    public void choisirArme(String n) {
        for (int i = 0 ; i <InvPerso.size() ; i++) {
            if (InvPerso.get(i).getNom().equals(n)) {
                arme_en_main = InvPerso.get(i);
                System.out.println(n + " a bien ete equipe a " + nom);
            }
            }
        }
    
    
        @Override 
    public String toString() {
        String rep;
        rep = nom + PV + " PV";
        return rep;
    }
    
    
    
    
    
    
    
    
    
    
    
    }

    
    

