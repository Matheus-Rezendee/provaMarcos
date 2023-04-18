import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase qualquer: ");
        String frase = scan.nextLine();
        System.out.println("Digite uma a palavra que deseja verificar se é existente na frase digitada: ");
        String verifica = scan.nextLine();

        System.out.println(frase.contains(verifica));


        //usei o contains, pois ele verifica se existe ou nao X palavra dentro da String
        //se a palavra se encontrar na String, ele retorna true, caso contrário, false.
    }
}
