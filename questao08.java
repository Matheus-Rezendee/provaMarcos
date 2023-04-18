
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] word = new String[5];

        String concatena = "";


        for (int i =0; i < word.length; i++){
            System.out.println("digite uma palavra: ");
            word[i] = scan.nextLine();
             concatena = concatena.concat(word[i] + " ");

        }
        System.out.println( "frase com todas as palavras concatenadas: " + concatena);

        //usei o concatena recebendo ele mesmo + o .concat da palavra na posição i para ir concatenando as palavras
    }
}
