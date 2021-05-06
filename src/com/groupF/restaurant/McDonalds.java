package com.groupF.restaurant;

import com.groupF.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class McDonalds implements Order {
    public Scanner input;
    private double price;
    private int quantity;
    double weeklyCost = 0;

    @Override
    public void placeOrder() {
        for(int i = 1; i <=7; i++) {

            input = new Scanner(System.in);
            SimpleDateFormat orderDate = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println("===================== Day " + i + " =====================");
            System.out.println("             McDonalds Weekkly Menu");
            System.out.println("1: Big Mac Combo");
            System.out.println("2: Deluxe Crispy Chicken Combo");
            System.out.println("3: Fillet-O-Fish Combo");
            System.out.println("=================================================");
            System.out.println("Enter a Combo Number:");

            int orderItem = input.nextInt();
            price = 0;

            switch(orderItem) {
                case 1:
                    price = 9.49;
                    System.out.println("\nYour Order:(1) Big Mac Combo");
                    System.out.println("\nWhen would you like your order delivered? (MM-dd-yyyy)");
                    dateFormatter();
                    break;
                case 2:
                    price = 10.79;
                    System.out.println("\nYour Order:(2) Deluxe Crispy Chicken Combo");
                    System.out.println("\nWhen would you like your order delivered? (MM-dd-yyyy)");
                    dateFormatter();
                    break;
                case 3:
                    price = 8.99;
                    System.out.println("\nYour Order:(3) Fillet-O-Fish Combo");
                    System.out.println("\nWhen would you like your order delivered? (MM-dd-yyyy)");
                    dateFormatter();
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("\nChoose your quantity: ");
            quantity = input.nextInt();

            System.out.print("\nThe total cost of today's order: $");
            System.out.printf("%.2f", calculateCost());
            System.out.println("");
            weeklyCost += calculateCost();
        } // END of for loop
        System.out.print("Total weekly cost: $");
        System.out.printf("%.2f", weeklyCost);
    }

    public double calculateCost() {
        return quantity * price * 1.13;
    }

    public void dateFormatter() {
        String str = input.next();
        SimpleDateFormat orderDate = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date date = orderDate.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
