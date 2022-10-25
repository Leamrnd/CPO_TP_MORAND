/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_morand;

/**
 *
 * @author leamo
 */
import java.util.Scanner;
public class TP2_convertisseurObjet_MORAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Convertisseur Conv1 = new Convertisseur(); // creation 1er convertisseur
    Conv1.CelciusVersFahrenheit(30);
    Conv1.KelvinVersCelcius(300);
    System.out.println(Conv1);
        
    Convertisseur Conv2 = new Convertisseur(); // creation 2eme convertisseur 
    Conv2.FahrenheitVersKelvin(70);
    Conv2.KelvinVersFahrenheit(170);
    Conv2.CelciusVersKelvin(25);
    System.out.println(Conv2);
        
 
    // création du menu

        Scanner sc = new Scanner(System.in);

        Convertisseur Conv3 = new Convertisseur();

              System.out.println("Entrez une valeur : ");

              double valeur = sc.nextDouble();

                           

              System.out.println("Choisissez la conversion souhaitée :\n"+"1) Celcius en Kelvin \n"+"2) Kelvin en Celcius \n"+"3) Fahrenheit en Celcius \n"+"4) Celcius en Farenheit \n"+"5) Kelvin en Farenheit \n"+"6) Farenheit en Kelvin");


                     

              int convUser = sc.nextInt();

              double answer;

                     

              if (convUser == 1) { //en fonction du choix utilisateur , on a 6 rep differentes possibles

                  answer = Conv3.CelciusVersKelvin(valeur); //converti lz valeur donnée par lutilisateur

                  System.out.println(valeur + " degrés Celcius donnne "+answer+" degrés Kelvin"); //renvoi la valeur converti à lutilisateur

              }

                    

              if (convUser == 2) { //pareil que pour les precedents 

                  answer = Conv3.KelvinVersCelcius(valeur);

                  System.out.println(valeur + " degrés Kelvin donne" +answer+" degrés Celcius");

              }

                     

              if (convUser == 3) {

                  answer = Conv3.FahrenheitVersCelcius(valeur);

                  System.out.println(valeur + " degrés Farenheit donne "+answer+" degrés Celcius");

              }

                     

              if (convUser == 4) {

                  answer = Conv3.CelciusVersFahrenheit(valeur);

                  System.out.println(valeur + " degrés Celcius donne "+answer+" degrés Farenheit");

              }

                     

              if (convUser == 5) {

                  answer = Conv3.KelvinVersFahrenheit(valeur);

                  System.out.println(valeur + " degrés Kelvin donne "+answer+" degrés Farenheit");

              }

                  

              if (convUser == 6) {

                  answer = Conv3.FahrenheitVersKelvin(valeur);

                  System.out.println(valeur + " degrés Farenheit donne "+answer+" degrés Kelvin");

              }

    }    
        
    }
    
