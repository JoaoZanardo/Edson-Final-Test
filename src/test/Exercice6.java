package test;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String name = sc.nextLine();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("Seja bem-vindo, " + name);

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
