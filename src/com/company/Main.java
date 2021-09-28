package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Scanner = "";
        System.out.println("Indiquer votre Nom et prénom");
        java.util.Scanner sc;
        sc = new Scanner(System.in);
        String i = sc.nextLine();


        System.out.println("Hello " + i);
    }
}
