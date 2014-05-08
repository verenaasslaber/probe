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
abstract class Saeugetier {

        private String name;
        private int alter;
        private String geschlecht;
        
        public abstract String  printAll();

        public Saeugetier(String name, int alter, String geschlecht) {
            this.name = name;
            this.alter = alter;
            this.geschlecht = geschlecht;
        
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
        
        
        
     }
     

    


