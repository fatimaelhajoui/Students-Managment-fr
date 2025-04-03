/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegraphiques;

/**
 *
 * @author marwa
 */
public class Etudiants {
    private String nom;
    private int num;
    private float note1,note2, note3, moyenne;

    public Etudiants(String nom, int num, float note1, float note2, float note3, float moyenne) {
        this.nom = nom;
        this.num = num;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getNote1() {
        return note1;
    }

    public void setNote1(float note1) {
        this.note1 = note1;
    }

    public float getNote2() {
        return note2;
    }

    public void setNote2(float note2) {
        this.note2 = note2;
    }

    public float getNote3() {
        return note3;
    }

    public void setNote3(float note3) {
        this.note3 = note3;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    
    
    
}
