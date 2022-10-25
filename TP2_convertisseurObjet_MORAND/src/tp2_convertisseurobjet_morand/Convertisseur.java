package tp2_convertisseurobjet_morand;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Convertisseur {
    static Scanner sc = new Scanner(System.in);
    int nbConversions;
    
    public Convertisseur () {
        nbConversions = 0;
    }

    public double CelciusVersKelvin (double C) {
         double K = C + 273.15;
         nbConversions += 1;
         return K;
         
    }
    
    public double KelvinVersCelcius (double K) {
        double C = K - 273.15;
        nbConversions += 1;
        return C;
        
    }
    
    public double FahrenheitVersCelcius (double F) {
        double C = (F - 32) * 5/9;
        nbConversions += 1;
        return C;
    }
    
    public double CelciusVersFahrenheit (double C) {
        double F = (C * 9/5) + 32;
        nbConversions += 1;
        return F;
    }
    
    public double FahrenheitVersKelvin (double F) {
         double K = (F - 32) * 5/9 + 273.15;
         nbConversions += 1;
         return K;
    }
    
    public double KelvinVersFahrenheit (double K) {
        double F = (K - 273.15) * 9/5 + 32;
        nbConversions += 1;
        return F;
    }
    
    @Override
    public String toString() {
    return "nb de conversions " + nbConversions;
        }
    
// Method to read the value of temperature given by the user
  static double input(String word){
    System.out.println("Enter "+word+" value:");
    double val = sc.nextDouble();
    return val;
  }
  
// Method to print converted value of temperature
  static void output(double val, String word){
    System.out.printf("%s value: %.2f",word,val);
  }
    
    
    
    
    
  // Driver Method
  public static void main(String args[]){
    System.out.println("1. Celcius en Fahrenheit\\n2. Celcius en Kelvin\\n\"+\n" +
"              \"3. Fahrenheit en Celcius\\n4. Fahrenheit en Kelvin\\n\"+\n" +
"              \"5. Kelvin en Celcius\\n6. Kelvin en Fahrenheit\\n7. Exit")
    do {
        System.out.printnln("\nEntrez votre choix: ");
        
    }
   
