package test;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int valor;

            System.out.println("digite um valor: ");
            valor = input.nextInt();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            if (valor >= 20 && valor <= 90) {
                System.out.println("O valor esta entre 20 e 90");
            } else {
                System.out.println("O valor nao esta entre 20 e 90");
            }

            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
