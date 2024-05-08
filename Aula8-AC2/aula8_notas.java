import java.util.Scanner;

public class aula8_notas {
    public static void main(String[] args) {   
        //Colocado quantas notas serão inseridas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque quantas notas serão inseridas. ");
        int notas_inseridas = scanner.nextInt();

        //Colocado o valor e peso para cada nota, exibido a nota do aluno corrente
        for(int contador = 0; contador < notas_inseridas; contador++){
            System.out.println("Coloque o valor: ");
            int valor = scanner.nextInt();
            System.out.println("Coloque o peso: ");
            int peso = scanner.nextInt();
            System.out.println("Está e a nota do aluno corrente: " + valor * peso);
        }
        scanner.close();
    }
}