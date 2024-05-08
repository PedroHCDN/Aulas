import java.util.Scanner;

public class aula6_nota_minima {
    public static void main(String[] args) {   
        //Colocado a nota mínima
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque a nota minima.");
        double nota_minima = scanner.nextInt();
        
        //Colocado as notas do usuario
        System.out.print("Coloque a nota da AC1.");
        double ac1 = scanner.nextInt();

        System.out.print("Coloque a nota da AC2.");
        double ac2 = scanner.nextInt();

        System.out.print("Coloque a nota da AG.");
        double ag = scanner.nextInt();

        System.out.print("Coloque a nota da AF.");
        double af = scanner.nextInt();

        //Calculado a media final, usando o peso da Facens
        double media_final = (ac1 * 0.15 ) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        System.out.print("A sua média final é: " + media_final + ".  ");

        //Mostrado as notas menor que a nota mínima
        if(ac1 < nota_minima){
            System.out.print("A AC1 ficou com a nota menor que a nota mínima: " + ac1);
        }
        if(ac2 < nota_minima){
            System.out.print("A AC2 ficou com a nota menor que a nota mínima: " + ac2);
        }
        if(ag < nota_minima){
            System.out.print("A AG ficou com a nota menor que a nota mínima: " + ag);
        }
        if(af < nota_minima){
            System.out.print("A AF ficou com a nota menor que a nota mínima: " + af);
        }
        scanner.close();
    }
}