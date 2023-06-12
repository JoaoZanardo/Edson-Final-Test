package test;
import java.util.Date;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) { 
        try {
            Scanner input = new Scanner(System.in); 

            System.out.println("Digite o valor da prestacao: ");
            double value = input.nextDouble(); 
            
            System.out.println("Digite o mes que a prestação venceu: ");
            int month = input.nextInt(); 
            
            if (month < 1 || month > 12) {
                System.out.println("Voce digitou um mês inválido !");
                input.close(); 
                return;
            }

            int currentMonth = new Date().getMonth() + 1; 
            double taxe = 1;
            int late = currentMonth - month; 
            
            if (late <= 0) {
                System.out.println("Sua prestacao esta em dia, pague antes que venca !");
                System.out.println("Valor a pagar: " + value);
                input.close(); 
                return;
            }
            
            taxe = late * taxe;
            value = value + (value * (taxe/100) * late);

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("A sua prestacao esta em atraso ha " + late + " meses !");
            taxe = (int) taxe;
            System.out.println("A taxa de juro e: " + taxe + "%");
            System.out.printf("Valor a pagar: R$ %.2f%n", value);
    
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}