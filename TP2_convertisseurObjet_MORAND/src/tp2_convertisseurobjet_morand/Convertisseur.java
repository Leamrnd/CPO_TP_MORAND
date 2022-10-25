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
}