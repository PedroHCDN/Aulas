package aula4;
import java.util.Scanner;

public class aula4_celsius {
    public static void main(String[] args) {       
    //Converter celsius para Fahrenheit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque a temperatura a ser convertida em Fahrenheit.");
        int celsius = scanner.nextInt();

        int fah = (int) (celsius * 1.8) + 32;
        System.out.print("A temperatura foi de C" + celsius + " para F" + fah);
        scanner.close();
    }
}
