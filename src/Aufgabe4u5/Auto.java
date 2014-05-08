/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4u5;

import java.lang.Comparable;

/**
 *
 * @author Aßlaber
 */
public class Auto extends Fahrzeug implements Comparable<Auto> {

    private boolean klimaanlage;
    private short airbags;
    private color farbe;

    public enum color {

        SILVER, RED, BLACK, BLUE, WHITE;
    }
    //Rot als Standardfarbe
    public Auto(short reifen, short ps, short tueren, short airbags) {
        super(reifen, ps, tueren);
        farbe = color.RED;
        klimaanlage = false;
        this.airbags = airbags;
    }
    //Farbe selber eingeben (color)
    public Auto(short reifen, short ps, short tueren, short airbags, color f) {
        super(reifen, ps, tueren);
        klimaanlage = false;

        this.airbags = airbags;
        farbe = f;
    }

    public void klimaanlageAn() {
        if (!klimaanlage) {
            klimaanlage = true;
        } else {
            System.err.println("Klimaanlage läuft bereits!");
        }
    }

    @Override
    public String toString() {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " + this.getGeschwindigkeit() + " km/h und hat die Farbe " + farbe;
    }

    public void klimaanlageAus() {
        if (klimaanlage) {
            klimaanlage = false;
        } else {
            System.err.println("Klimaanlage ist bereits aus!");
        }
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
   //http://www.java-blog-buch.de/d-objekte-sortieren-comparator-und-comparable/
    /*
     positiver Rückgabewert: Der erste Parameter ist untergeordnet
     0 als Rückgabewert: Beide Parameter werden gleich eingeordnet
     negativer Rückgabewert: Der erste Parameter ist übergeordnet
     */
    @Override
    public int compareTo(Auto a) {
        if (this.getPs() > a.getPs()) {
            return -1;
        } else if (this.getPs() < a.getPs()) {
            return 1;
        } else {
            return 0;
        }
    }
}
