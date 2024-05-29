import java.util.Scanner;

public class aula12_media_de_pesos {
    public static void main(String[] args) {   
        //Colocado quantas notas serão inseridas, os pesos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque quantas notas serão inseridas: ");
        int notas_inseridas = scanner.nextInt();
        System.out.println("Coloque o peso para a AC1: ");
        int peso_ac1 = scanner.nextInt();
        System.out.println("Coloque o peso para a AC2: ");
        int peso_ac2 = scanner.nextInt();
        System.out.println("Coloque o peso para a AF: ");
        int peso_af = scanner.nextInt();
        System.out.println("Coloque o peso para a AG: ");
        int peso_ag = scanner.nextInt();
        int[] notas = new int [notas_inseridas];
        int media = 0;
        int contador = 0;

        //Colocado os valores e armazenado a media dentro do vetor
        for(contador = 0; contador < notas_inseridas; contador++){
            System.out.println("Coloque o valor para AC1: ");
            int valor1 = scanner.nextInt();
            System.out.println("Coloque o valor para AC2: ");
            int valor2 = scanner.nextInt();
            System.out.println("Coloque o valor para AF: ");
            int valor3 = scanner.nextInt();
            System.out.println("Coloque o valor para AG: ");
            int valor4 = scanner.nextInt();
            media = (valor1 * peso_ac1) + (valor2 * peso_ac2) + (valor3 * peso_af) + (valor4 * peso_ag);
            notas[contador] = media;
        }
        //Calculado e mostrado a media das notas
        double media_final = media / contador;
        System.out.println("Essa é a média das notas: " + media_final);


        scanner.close();
    }
}