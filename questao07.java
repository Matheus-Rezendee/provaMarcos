import java.util.Scanner;

public class questao07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][]array = new int[2][2];

        System.out.println(" |         Matriz         | ");
        System.out.println("  ________________________");
        System.out.println(" |          [][]          | ");
        System.out.println(" |          [][]          | ");
        System.out.println("  ------------------------");

        System.out.println("popule a matriz acima!");
        System.out.println("--------------------------");

        System.out.println("a matriz é populada da esquerda para a direita (começando no quadrado superior" +
                " esquerdo, e terimando no quadrado inferior direito)");
        System.out.println("------------------------------------------------------------------------------");


        System.out.println("digite os perspectivos valores ");

        System.out.println("-> ");
        array[0][0]= scan.nextInt();

        System.out.println("->");
        array[0][1]= scan.nextInt();

        System.out.println("->");
        array[1][0]= scan.nextInt();

        System.out.println("->");
        array[1][1]= scan.nextInt();


        int diagPrinc = array[0][0] * array[1][1];
        int diagSecund = array[0][1] * array[1][0];

        int determinante = diagPrinc - diagSecund;
        System.out.println(determinante);

    }
}
