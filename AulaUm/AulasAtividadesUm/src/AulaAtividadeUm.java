
import java.util.Scanner;

public class AulaAtividadeUm {
    public static void main(String[] args) {
        int ano;
        Scanner Texto = new Scanner(System.in);
        System.out.println("vamos ver em qual mes estamos");
        System.out.println("digite o numero do mes em que estamos");
        ano = Texto.nextInt();
        switch (ano)
        {
            case 1 :
                System.out.println(" mes de janeiro !!");
            break;

            case 2 :
                System.out.println(" mes de fevereiro !!");
            break;

            case 3 :
                System.out.println(" mes de março !!");
            break;

            case 4 :
                System.out.println(" mes de abril !!");
            break;

            case 5 :
                System.out.println(" mes de maio !!");
            break;

            case 6:
                System.out.println(" mes de junho !!");
            break;

            case 7:
                System.out.println(" mes de julho !!");
            break;

            case 8:
                System.out.println(" mes de agosto !!");
            break;

            case 9:
                System.out.println(" mes de setembro !!");
            break;

            case 10:
                System.out.println(" mes de outubro !!");
            break;

            case 11:
                System.out.println(" estemos em novembro !!");
            break;

            case 12:
                System.out.println(" estamos em dezembro !!");
            break;

        }

    }
}