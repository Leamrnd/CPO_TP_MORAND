/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARMES;

import ARMES.Armes;

/**
 *
 * @author leamo
 */
public class Baton extends Armes{
    int age;
    
    public Baton(String n, int i, int a) {
        super(n,i);
        age = a;
        if (age > 0) age = a;
        else {
            age = 0;
        }
        
    }
    
}
