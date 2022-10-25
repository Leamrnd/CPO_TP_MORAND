/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_morand;

/**
 *
 * @author leamo
 */
public class TP2_Bieres_MORAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // creation de nouvelles BouteilleBiere et affichage de leurs caracteristiques + decapsuler certaines
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        autreBiere.lireEtiquette();
        autreBiere.Décapsuler();
        
        BouteilleBiere Biere3 = new BouteilleBiere ("Desperados", 9.0, "Sous les Tropiques");
        Biere3.lireEtiquette();
        
        BouteilleBiere Biere4 = new BouteilleBiere ("Unicorn", 5.5,"Foret Enchantée");
        Biere4.lireEtiquette();
        Biere4.Décapsuler();
        System.out.println(Biere4);
        
        BouteilleBiere Biere5 = new BouteilleBiere ("Guiness", 4.2, "Abbaye Guiness");
        Biere5.lireEtiquette();
        
        
    }

}

