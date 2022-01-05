/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proiect.cashier;

/**
 *
 * @author adrian
 */
public class Cashier {
    private String nume;
    private int id;
    private int parola;

    public Cashier(String nume, int id, int parola) {
        this.nume = nume;
        this.id = id;
        this.parola = parola;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParola() {
        return parola;
    }

    public void setParola(int parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "Cashier{" + "nume=" + nume + ", id=" + id + ", parola=" + parola + '}';
    }
    
    public String toStringLogin(){
        return nume + " " + parola;
    }
}
