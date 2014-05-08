/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe4u5;

/**
 *
 * @author Aßlaber
 */
public class Fahrzeug {
    private short reifen, ps, tueren, geschwindigkeit;

    private boolean gestartet;
    public static int anzahl;
    
    public enum color {
        SILVER,RED;
    }
    
    public void starten()
    {
        gestartet = true;
    }
    
    public void stoppen()
    {
        gestartet = false;
    }
    
    public void beschleunigen(short g)
    {
        if(gestartet)
        {
            geschwindigkeit += g;
            if(geschwindigkeit > 250)
            {
                geschwindigkeit = 250;
            }
        }
    }
    
    public void bremsen(short g)
    {
        if(gestartet)
        {
            geschwindigkeit -= g;
            if(geschwindigkeit < 0)
            {
                geschwindigkeit = 0;
            }
        }
    }

    public Fahrzeug(short reifen, short ps, short tueren) {
        this.reifen = reifen;
        this.ps = ps;
        this.tueren = tueren;
        this.geschwindigkeit = 0;
  
        this.gestartet = false;
        anzahl++;
    }
    
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }


    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
    }
