package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
            List<String> tools = new ArrayList<>();
            tools.add("papier");
            tools.add("kamien");
            tools.add("nozyce");
            String papier = "papier";
            String kamien = "kamien";
            String nozyce = "nozyce";

            System.out.println("1, 2, 3: ");
            System.out.println("Do your choice: ");
            String my = scanner.nextLine();
            System.out.println("You choosed " + my);

            String computer = tools.get(random.nextInt(3));
            System.out.println("Computer choosed " + computer);
            switch (computer) {
                case ("kamien"):
                    if (my.equals(papier)) {
                        System.out.println("You won");
                        break;
                    } else if (my.equals(nozyce)) {
                        System.out.println("You lose");
                        break;
                    } else if (my.equals(kamien)) {
                        System.out.println("Draw");
                        break;
                    }
                case ("papier"):
                    if (my.equals(papier)) {
                        System.out.println("Draw");
                        break;
                    } else if (my.equals(nozyce)) {
                        System.out.println("You won");
                        break;
                    } else if (my.equals(kamien)) {
                        System.out.println("You lose");
                        break;
                    }
                case ("nozyce"):
                    if (my.equals(papier)) {
                        System.out.println("You lose");
                        break;
                    } else if (my.equals(nozyce)) {
                        System.out.println("Draw");
                        break;
                    } else if (my.equals(kamien)) {
                        System.out.println("You won");
                        break;
                    }
            }
        }
    }