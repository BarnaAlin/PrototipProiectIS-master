/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proiect.controller;

import com.proiect.calculator.PaymentCalculator;
import com.proiect.products.Product;
import java.util.List;

/**
 *
 * @author adrian
 */
public class ProductsController {
    List<Product> produse;
    PaymentCalculator pc;
    
    public ProductsController(List<Product> produse) {
        this.produse = produse;
    }
    
    public void View (){
        for (Product p : produse){
            System.out.println(p.toString());
        }
    
    }
    
}
