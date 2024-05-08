import java.util.Scanner;

public class aula10_redigir {
    public static void main(String[] args) {   
        //Colocado quantas notas serão inseridas e quantos alunos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque quantas notas serão inseridas: ");
        int notas_inseridas = scanner.nextInt();
        System.out.println("Coloque quantos alunos: ");
        int alunos = scanner.nextInt();
        int reinserir = 0;

        //Solicitado o nome do aluno, colocado o valor e peso para cada nota, exibido a nota do aluno corrente
        do{
            for(int contador = 0; contador < notas_inseridas & contador < alunos; contador++){
                System.out.println("Coloque o nome do aluno: ");
                String nome = scanner.next();
                System.out.println("Coloque o valor: ");
                int valor = scanner.nextInt();
                System.out.println("Coloque o peso: ");
                int peso = scanner.nextInt();
                System.out.println("Está e a nota de " + nome + ": " + valor * peso);

                //Verificação de parâmetro de aprovação
                int nota = valor * peso;
                if(nota <= 2){
                    System.out.println("O aluno está reprovado.");
                }
                if(nota > 2 & nota <= 4.9){
                    System.out.println("O aluno precisa fazer a substitutiva.");
                }
                if(nota > 4.9){
                    System.out.println("O aluno está aprovado.");
                }
                System.out.println("Vai querer reinserir os dados? Digite 1 para sim e 2 para não.");
                reinserir = scanner.nextInt();
            }
        //Verificado se o usuario vai querer reinserir os dados
        } while (reinserir == 1);
        scanner.close();
    }
}