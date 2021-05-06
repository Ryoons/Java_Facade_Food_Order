package com.groupF;
import java.util.Scanner;

public class OrderClient {

    public static void main(String[] args) {

        Scanner input;
        OrderFacade order = new OrderFacade();
        input = new Scanner(System.in);

        System.out.println("Where would you like to order from?");
        System.out.println("1: McDonalds");
        System.out.println("2: Burger King");
        System.out.println("");
        System.out.println("Enter Here:");

        int userChoice = input.nextInt();

        if (userChoice == 1) {
            order.mcDonalds.placeOrder();
        } else if (userChoice == 2) {
            order.burgerKing.placeOrder();
        } else {
            System.out.println("Please Order Again.");
        }

    }
}
