public class questao06 {
    public static void main(String[] args) {
        String nome = "Matheus";
        System.out.println("palavra normal: " + nome);
        String invertido=  "";
        for (int i = nome.length() - 1;  0 <= i; i--) {
            invertido += nome.charAt(i);
        }
        System.out.println("palavra invertida: " + invertido);
    }
}
