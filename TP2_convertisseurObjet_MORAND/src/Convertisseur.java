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

    public void CelciusVersKelvin (double C) {
         double K = C + 273.15;
         
    }
    
    public void KelvinVersCelcius (double K) {
        double C = K - 273.15;
        
    }
    
    public void FahrenheitVersCelcius (double F) {
        double C = (F - 32) * 5/9;
    }
    
    public void CelciusVersFahrenheit (double C) {
        double F = (C * 9/5) + 32;
    }
    
    public void FahrenheitVersKelvin (double F) {
         double K = (F - 32) * 5/9 + 273.15;
    }
    
    public void KelvinVersFahrenheit (double K) {
        double F = (K - 273.15) * 9/5 + 32;
    }
    
    @Override
    public toString() {
        return "nb de conversions" + nbConversions;
    }
}