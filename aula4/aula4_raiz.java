package aula4;
import java.util.Scanner;
import java.lang.Math;

public class aula4_raiz {
    public static void main(String[] args) {
        //Calcular a raiz cúbica de um número qualquer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque um número para ser calculado sua raiz cúbica.");
        int numero = scanner.nextInt();

        int resultado = (int) Math.cbrt(numero);
        System.out.print("A raiz cúbica de " + numero +  " é " + resultado);
        scanner.close();
    }
}


