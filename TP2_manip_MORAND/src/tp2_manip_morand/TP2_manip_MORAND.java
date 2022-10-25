/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_morand;

/**
 *
 * @author leamo
 */
public class TP2_manip_MORAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Tartiflette assiette1 = new Tartiflette(500) ;
       Tartiflette assiette2 = new Tartiflette(600) ;
       Tartiflette assiette3 = assiette2 ;
       assiette2 = assiette1;
       assiette1 = assiette3;
       
       
       /* on en a créé 2, car il y a 2 new dans le code, on a associé assiette3 a l'espace memoire assiette2, qui a donc ecrasé ce qu'il y abait precedemment; c'est donc la meme tartiflette
       
       */
 System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
 System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
 
   /* Moussaka assiette666 = assiette1 ;
    Moussaka assiette667 = new Tartiflette() ; 
 ces lignes sont toutes les deux fausses et une reference objet de peut pas changer une fois definie = propre a une classe*/ 
        
     
    Moussaka [] tab = new Moussaka [10]; //creation dun tableau de 10 Moussaka (rempli manuellememnt)
    tab[0] = new Moussaka(300);
    tab[1] = new Moussaka (450);
    tab[2] = new Moussaka (500);
    tab[3] = new Moussaka (370);
    tab[4] = new Moussaka (480);
    tab[5] = new Moussaka (560);
    tab[6] = new Moussaka (280);
    tab[7] = new Moussaka (440);
    tab[8] = new Moussaka (600);
    tab[9] = new Moussaka (520);
    
 for (int i=0; i<10; i++) { // utilisation d'une boucle for pour generer des moussaka automatiquement dans le tableau
     tab[i] = new Moussaka(100*(i+1));
     System.out.println(tab[i]);
     
}
}
}
