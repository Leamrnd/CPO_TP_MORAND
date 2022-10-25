/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_morand;

/**
 *
 * @author leamo
 */
public class TP2_convertisseurObjet_MORAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Convertisseur Conv1 = new Convertisseur();
    Conv1.CelciusVersFahrenheit(30);
    Conv1.KelvinVersCelcius(300);
    System.out.println(Conv1);
        
    Convertisseur Conv2 = new Convertisseur();
    Conv2.FahrenheitVersKelvin(70);
    Conv2.KelvinVersFahrenheit(170);
    Conv2.CelciusVersKelvin(25);
    System.out.println(Conv2);
        
        
        
        
        
        
    }
    
}
