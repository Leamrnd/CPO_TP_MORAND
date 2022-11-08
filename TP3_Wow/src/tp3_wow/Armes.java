/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_wow;

/**
 *
 * @author leamo
 */
public class Arme {
    String nom;
    int NivAtt;
    
    public Arme(String unNom, int unNivAtt) {
        nom = unNom;
        NivAtt = unNivAtt;
        if (NivAtt< 0) {
            NivAtt = 0;
        }
        elif (NivAtt > 100) {
        NivAtt = 100;
    }
        
    }
    
}
