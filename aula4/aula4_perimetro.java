package aula4;
import java.util.Scanner;

public class aula4_perimetro {
    public static void main(String[] args) {       
    //Calcular o perímetro de um retângulo qualquer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor da altura do retângulo.");
        int altura = scanner.nextInt();

        System.out.print("Coloque o valor da base do retângulo.");
        int base = scanner.nextInt();

        int perimetro = 2 * (base + altura);
        System.out.print("O perímetro do seu retângulo é " + perimetro);
        scanner.close();
    }
}