/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_morand;

/**
 *
 * @author leamo
 */
public class BouteilleBiere { // creation d'une nouvelle classe BouteilleBiere et ses caract
    String Nom;
    Double degreAlcool;
    String brasserie;
    Boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { // utilisation d'un constructeur
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }

@Override
public String toString() { // methode toString pour simplifier l'affichage
    String chaine_a_retourner;
    chaine_a_retourner = Nom + "("+ degreAlcool + "degrés ) ouverte?";
    if (ouverte == true) chaine_a_retourner += "oui";
    else chaine_a_retourner += "non";
    return chaine_a_retourner;
}    
    
public void lireEtiquette() { // affiche les differentes caracteristiques de la biere 
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}

public void Décapsuler() { // decapsule la biere si pas deja ouverte et rend compte de son etat
    if (ouverte == false) {
        ouverte = true;
        System.out.println("Votre bouteille est ouverte :" + ouverte);
    }
    else {
        System.out.println("Erreur : la bière est déjà ouverte");
    }
}


}
