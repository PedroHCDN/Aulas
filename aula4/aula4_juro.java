package aula4;
import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class aula4_juro {
    public static void main(String[] args) {             
    //Cálculo do Juros Simples
        System.out.println("Esse programa vai perguntar sobre seu capital, taxa de juro e tempo, para calcular seus juros.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o capital.");
        double capital = scanner.nextInt();

        System.out.print("Coloque a taxa de juro.");
        double taxa = scanner.nextInt();

        System.out.print("Coloque o tempo em meses.");
        int tempo = scanner.nextInt();

        double juros = (capital * taxa * tempo) / 100 + capital;
        double juros_final = juros / tempo;
        System.out.print("O seu juros é: " + juros_final);
        scanner.close();
    }
}
