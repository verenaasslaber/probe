/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe2u3;

/**
 *
 * @author Aßlaber
 */
public class Mensch extends Saeugetier {

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    
    @Override
    public String printAll(){
        return getName()+"#"+getAlter()+"#"+getGeschlecht();
    }
 

    
    
}
