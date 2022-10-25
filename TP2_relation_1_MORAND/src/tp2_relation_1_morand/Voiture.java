package tp2_relation_1_morand;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    
    public Voiture(String unModele, String uneMarque , int unePuissanceCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
        proprietaire = null;
        
}
@Override
public String toString() {
    return (Modele + " de la marque " + Marque + " d'une puissance de " + PuissanceCV);
}
}

