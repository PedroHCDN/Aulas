import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class aula13_armazena_tudo {
    public static void main(String[] args) {   
        //Colocado quantas notas serão inseridas, os pesos e quantos alunos
        Scanner scn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos alunos: ");
        String[] nomes = new String[scanner.nextInt()];
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
        String novamente = "";
        //int[][] matriz = new int[][];

        //Colocado os valores e armazenado a media dentro do vetor, armazenado o nome do aluno
        for(contador = 0; contador < notas_inseridas && contador < nomes.length; contador++){
            System.out.println("Digite o nome do aluno: ");
            nomes[contador] = scn.nextLine();
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
        //Calculado e mostrado a media das notas, perguntado sobre consulta de nota, caso o usuario dizer sim, pergunta o nome do aluno e tenta mostrar a nota dele, pergunta se vai querer consultar novamente 
        double media_final = media / contador;
        System.out.println("Essa é a média das notas: " + media_final);
        System.out.println("Vai querer consultar a nota de um aluno em específico?");
        String consulta = scn.nextLine();
        do{
            System.out.println("Digite o nome do aluno: ");
            String nome = scn.nextLine();
            List<String> nomes1 = Arrays.asList(nomes);
            System.out.println("A nota de " + nomes1.contains(nome) + "é: " + notas);
            System.out.println("Vai querer consultar novamente?");
            consulta = scn.nextLine();
            
        } while (consulta.equals("sim"));
        scanner.close();
        scn.close();
    }
}