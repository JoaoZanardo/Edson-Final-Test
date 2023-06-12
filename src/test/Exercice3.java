package test;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[20];
            int oddNumbersCount = 0;

            for (int i = 0; i < 19; i++) {
                System.out.println("Digite o " + i + "\u00BA" + " numero: ");
                numbers[i] = input.nextInt();

            }

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            for (int i = 0; i < 19; i++) {
                if ((numbers[i] % 2) != 0) {
                    oddNumbersCount++;
                    System.out.println("impar: " + numbers[i]);
                }
            }

            System.out.println("Voce digitou " + oddNumbersCount + " numeros impares");
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
