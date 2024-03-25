package aula4;
import java.util.Scanner;

public class aula4_area {
    public static void main(String[] args) {       
    //Calcular a área de um quadrado qualquer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor do lado do quadrado.");
        int lado = scanner.nextInt();

        int area = lado * lado;
        System.out.print("A área do seu quadrado é " + area);
        scanner.close();
    }
}
