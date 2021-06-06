/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many people? ");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizza = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizza, slices * pizza);
        System.out.printf("Each person gets %d pieces of pizza.\n", (slices * pizza) / people);
        System.out.printf("There are %d leftover pieces.\n", (slices * pizza) % people);
    }
}
