/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4u5;

import Aufgabe4u5.Auto.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aßlaber
 */
public class AufrufA4 {

    public static void main(String[] args) {
        Auto bmw = new Auto((short) 4, (short) 220, (short) 4, (short) 4, color.SILVER);
        Auto audi = new Auto((short) 8, (short) 180, (short) 5, (short) 8, color.RED);
        Auto honda = new Auto((short) 4, (short) 250, (short) 5, (short) 5, color.BLACK);
        Auto vw = new Auto((short) 4, (short) 90, (short) 3, (short) 5, color.BLUE);
        Auto toyota = new Auto((short) 4, (short) 300, (short) 3, (short) 5, color.WHITE);

        List<Auto> liste = new ArrayList<Auto>();
        liste.add(vw);
        liste.add(honda);
        liste.add(bmw);
        liste.add(audi);
        liste.add(toyota);
        Collections.sort(liste);
        for (Auto a : liste) {
            System.out.println(a.getPs());
        }
    }
}
