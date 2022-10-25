/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_morand;

/**
 *
 * @author leamo
 */
public class TP2_relation_1_MORAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    Personne bob = new Personne("Bobby", "Sixkiller"); 
    Personne reno = new Personne("Reno", "Raines");
    System.out.println("liste des voitures disponibles "+ uneClio +
    "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

    bob.liste_voitures[0] = uneClio ;
    bob.nbVoitures = 1 ;
    uneClio.proprietaire = bob ;
    bob.liste_voitures[1] = uneMicra; //on donne une micra a Bob en 2eme voiture
    bob.nbVoitures += 1; // il a donc une voiture de plus dans nbVoitures
    uneMicra.proprietaire = bob; // on associe la voiture a son proprietaire : Bob
    
    une2008.proprietaire = reno; // meme chose pour Reno
    reno.nbVoitures += 1;
    reno.liste_voitures[0] = une2008;
    uneAutreClio.proprietaire = reno;
    reno.nbVoitures += 1;
    reno.liste_voitures[1] = uneAutreClio;
    
    
    
    System.out.println("la premiere voiture de Bob est " + 
    bob.liste_voitures[0] ) ; // affichage des differentes voitures des proprietaires respectifs
    System.out.println("la deuxieme voiture de Bob est " +
    bob.liste_voitures[1] ) ;
    System.out.println("la premiere voiture de Reno est " +
    reno.liste_voitures[0] ) ;
    System.out.println("la deuxieme voiture de Reno est " +
    reno.liste_voitures[1] ) ;
    
    

    }
    
}
