import java.util.Scanner;

public class AulaAtividadeTres {
    public static void main(String[] args) {
        String letra = new String();
        Scanner texto = new Scanner(System.in);

        System.out.println(" insira o tamanho da blusa");
        letra = texto.nextLine();

        switch (letra) {
                case "p" :
                System.out.println(" o tamanho " + letra +" é 0.46 X 0.55");
                break;

                case "m" :
                System.out.println(" o tamanho " + letra +" é 0.51 X 0.56");
                break;

                case "g" :
                System.out.println(" o tamanho " + letra +" é  0.52 X 0.58");
                break;

                default:
                System.out.println(" fora de padrão");
        }
    }
}