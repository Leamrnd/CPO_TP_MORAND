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
        
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) { // si l'attribut proprietaire n'est pas nul , la voiture est déjà à quelqu'un
            System.out.println("La voiture " + voiture_a_ajouter + " appartient déjà à " + voiture_a_ajouter.proprietaire +" (le vol, c'est mal)");
            return false;
        }
        
        if (this.nbVoitures > 2) { // si nb de voitures plus grand que 2, this en possede 3 donc ne peut pas en rajouter une autre
    System.out.println(this + " possède déjà 3 voitures, donc " + voiture_a_ajouter + " n'a pas été ajoutée");
    return false;
    
            
        }
        else { // on fait mtn le cas ou on peut ajouter une voiture 
            voiture_a_ajouter.proprietaire = this;
            this.liste_voitures[this.nbVoitures] = voiture_a_ajouter; // on cherche l'emplacement dans la liste de voitures
            this.nbVoitures += 1; // on incremente le nb de voitures
            voiture_a_ajouter.proprietaire = this; // on attribue le proprietaire
            System.out.println("La voiture " + voiture_a_ajouter + " appartient désormais à " + this + " Féliciations!");
            return true;
        }
    }     
        
        
         
    
 
    @Override
    public String toString() {
        return(Nom + " " + Prenom);
    }
}
