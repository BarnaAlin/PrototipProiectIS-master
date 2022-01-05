/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package com.proiect.prototipproiectis;
import com.proiect.cashier.Autentification;
import com.proiect.cashier.Cashier;
import com.proiect.products.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Cashier> cashiers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        //initializare caserite
        cashiers.add(new Cashier("Mariana", 1, 123));
        cashiers.add(new Cashier("Apor", 2 , 1234));
        
        //intializare produse
        products.add(new Product("Paine cu secara", 12));
        products.add(new Product("Salam de Aiud", 25));
        products.add(new Product("Cascaval", 20));
        products.add(new Product("Unt",8));
        
        String nume;
        String parola;
        System.out.println("Autentificare: ");
        System.out.println("Nume: ");
        nume = sc.nextLine();
        System.out.print("Parola: \n");
        parola = sc.nextLine();
        
        System.out.println(Autentification.Verificare(nume, parola, cashiers));
        
        System.out.println("\n\n Initializeaza Tranzactie");
        boolean scanning = true;
        while(scanning == true){
            String variabila = sc.nextLine();
            
            if(variabila.compareTo("End")==0){
                scanning=false;
            }else 
            {
                System.out.println(products.equals(variabila));
            
            }
            
            
        }
        
    }
    
}
