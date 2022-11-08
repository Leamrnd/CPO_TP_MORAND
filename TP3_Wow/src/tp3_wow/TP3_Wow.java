/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_wow;

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
    }
    
}
