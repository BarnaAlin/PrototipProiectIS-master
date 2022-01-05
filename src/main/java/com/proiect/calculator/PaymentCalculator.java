/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proiect.calculator;

/**
 *
 * @author adrian
 */
public class PaymentCalculator {

    private int total;

    public String verify(int total, int money) {
        if (total == money) {
            return "egal";

        } else {
            return total > money ? "mare" : "mic";
        }
    }

    public void payment(int total, int money) {
        String stare;
        stare = verify(total, money);
        switch (stare) {
            case "egal":
                System.out.println("Tranzactia a fost efectutata cu succes");
                break;
            case "mare":
                int diferenta = total - money;
                System.out.println("Mai trebuie bani: " + diferenta);
                break;
            case "mic":
                int rest = money - total;
                System.out.println("Rest: " + rest);
                break;
        }
    }

}
