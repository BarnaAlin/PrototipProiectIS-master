/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proiect.cashier;

import java.util.List;

/**
 *
 * @author adrian
 */
public class Autentification {

    
    static public String Verificare(String nume, String parola,List<Cashier> c2) {
        String numeParola = nume + " " + parola;
        for (Cashier c : c2) {
            if (numeParola.compareTo(c.toStringLogin()) == 0) {
                return "Welcome " + c.getNume();
            }

    }
              return "Numele sau parola este gresita!";
    }
}