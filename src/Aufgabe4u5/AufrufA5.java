/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4u5;

import static Aufgabe4u5.Auto.color.RED;
import static Aufgabe4u5.Auto.color.SILVER;

/**
 *
 * @author Aßlaber
 */
public class AufrufA5 {

    public static void main(String[] args) {
        Auto bmw = new Auto((short) 4, (short) 220, (short) 4, (short) 4);
        Auto audi = new Auto((short) 4, (short) 180, (short) 5, (short) 8);
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
    }
}
