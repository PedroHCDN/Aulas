import java.util.Scanner;

public class aula5_facens_media {
    public static void main(String[] args) {       
        //Colocado as notas do usuario
            Scanner scanner = new Scanner(System.in);
            System.out.print("Coloque a nota da AC1.");
            double ac1 = scanner.nextInt();

            System.out.print("Coloque a nota da AC2.");
            double ac2 = scanner.nextInt();

            System.out.print("Coloque a nota da AG.");
            double ag = scanner.nextInt();

            System.out.print("Coloque a nota da AF.");
            double af = scanner.nextInt();

        //Calculado a media final, usando o peso da facens
            double media_final = (ac1 * 0.15 ) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
            System.out.print("A sua média final é: " + media_final);
            scanner.close();
    }
}
