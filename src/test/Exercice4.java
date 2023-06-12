package test;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int number1;
            int number2;

            System.out.println("digite um numero: ");
            number1 = input.nextInt();

            System.out.println("digite outro numero: ");
            number2 = input.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            if (number1 > number2) {
                System.out.println("o numero " + number1 + " e o maior");
            } else {
                System.out.println("o numero " + number2 + " e o maior");
            }

            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
