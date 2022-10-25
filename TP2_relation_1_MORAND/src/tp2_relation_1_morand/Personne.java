package tp2_relation_1_morand;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Personne {
    String Nom;
    String Prenom;
    int nbVoitures;
    Voiture [] liste_voitures; // on definit le tableau 
            
            
    public Personne(String unNom, String unPrenom) {
        Nom =unNom;
        Prenom = unPrenom;
        liste_voitures = new Voiture [3]; // on cree le tableau avec les espaces associes 
        nbVoitures = 0; // on initialise les nb de voitures a 0
        
    }
    
@Override
public String toString() {
    return(Nom + " " + Prenom);
}
}
