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
public class Student extends Kind{
    int matrikelnummer;
    String studiengang;

    public Student(int matrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public String Status() {
       return "Es handelt sich um einen Studenten. "+matrikelnummer+" "+studiengang+" "+vorname+" "+nachname+" "+alter;
    }
  public static void main(String[] args){
      Kind a = new Kind ("Verena","Aßlaber",20);
      System.out.println(a.Status());
      Student b = new Student(1310653661,"Web-Business & Technology","Verena","Aßlaber",20);
      System.out.println(b.Status());
  }
}
