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
public class Kind {
    String vorname;
    String nachname;
    int alter;

    public Kind(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    public String Status(){
        return "Es handelt sich um einen Menschen. "+vorname+" "+nachname+" "+alter;
    }
}
