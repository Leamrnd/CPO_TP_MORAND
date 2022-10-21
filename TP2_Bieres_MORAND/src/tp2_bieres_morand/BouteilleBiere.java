/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_morand;

/**
 *
 * @author leamo
 */
public class BouteilleBiere {
    String Nom;
    Double degreAlcool;
    String brasserie;
    Boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }

@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = Nom + "("+ degreAlcool + "degrés ) ouverte?";
    if (ouverte == true) chaine_a_retourner += "oui";
    else chaine_a_retourner += "non";
    return chaine_a_retourner;
}    
    
public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}

public void Décapsuler() {
    if (ouverte == false) {
        ouverte = true;
        System.out.println("Votre bouteille est ouverte :" + ouverte);
    }
    else {
        System.out.println("Erreur : la bière est déjà ouverte");
    }
}


}
