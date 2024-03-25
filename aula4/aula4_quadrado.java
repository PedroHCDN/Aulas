package aula4;
import java.util.Scanner;

public class aula4_quadrado {
    public static void main(String[] args) {       
    //Calcular o perímetro de um quadrado qualquer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor do lado do quadrado.");
        int lado = scanner.nextInt();

        int perimetro = 2 * lado;
        System.out.print("O perímetro do seu quadrado é " + perimetro);
        scanner.close();
    }
}
