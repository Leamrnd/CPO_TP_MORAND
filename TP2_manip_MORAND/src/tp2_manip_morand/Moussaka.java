/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_morand;

/**
 *
 * @author leamo
 */
public class Moussaka {
    int nbCalories;
    
    public Moussaka (int nbCal) {
        nbCalories = nbCal;
    }
@Override
public String toString () {
 return ("Cette Moussaka comporte " +nbCalories +" calories");    
}
}
