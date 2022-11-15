/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_wow;


import PERSONNAGES.Personnage;
import PERSONNAGES.Magicien;
import PERSONNAGES.Guerrier;
import ARMES.Epée;
import ARMES.Baton;
import ARMES.Armes;
import java.util.ArrayList;

/**
 *
 * @author leamo
 */
public class TP3_Wow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epée Excalibur = new Epée("Excalibur", 7,5);
        System.out.println(Excalibur);
        
        Epée Durandal = new Epée("Durandal", 4,7);
        System.out.println(Durandal);
        
        
        Baton Baton1 = new Baton("Chêne", 4,5);
        Baton Baton2 = new Baton("Charme", 5,6);
        System.out.println(Baton1);
        
        
        ArrayList<Armes> Inventaire = new ArrayList<Armes>();
    Inventaire.add(Excalibur);
    Inventaire.add(Durandal);
    Inventaire.add(Baton1);
    Inventaire.add(Baton2);
    
    Inventaire.get(0);
    System.out.println(Inventaire);
    
    Magicien Gandalf = new Magicien("Gandalf", 65, true);
    Magicien Garcimore = new Magicien("Garcimore", 44, false);
    
    System.out.println(Garcimore);
    
    Guerrier Conan = new Guerrier("Conan",78,false);
    Guerrier Lannister = new Guerrier("Lannister", 45, true);
    
    
    
    ArrayList<Personnage> Persos = new ArrayList<Personnage>();
    Persos.add(Gandalf);
    Persos.add(Garcimore);
    Persos.add(Conan);
    Persos.add(Lannister);
    
    System.out.println(Persos);
   
    
    
    Gandalf.ajouterArme(Baton2);
    Gandalf.choisirArme("Charme");
    
    System.out.print(Gandalf);

    Conan.ajouterArme(Excalibur);
    Conan.choisirArme("Excalibur");
    
System.out.println(Persos);
    
    }
    
}
