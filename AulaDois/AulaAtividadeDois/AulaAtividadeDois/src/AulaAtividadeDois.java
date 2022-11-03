import java.util.Scanner;

public class AulaAtividadeDois {
    public static void main(String[] args) {
      String letra = new String();
      Scanner texto = new Scanner(System.in);

      System.out.println(" vamos ver se a letra é vogal ou consoante");
      letra = texto.nextLine();

      switch (letra) {
          case "a" :
              System.out.println("a letra :" + letra +" é uma vogal");
          break;

          case "e" :
              System.out.println("a letra :" + letra +" é uma vogal");
          break;

          case "i" :
              System.out.println("a letra :" + letra +" é uma vogal");
          break;

          case "o" :
              System.out.println("a letra :" + letra +" é uma vogal");
          break;

          case "u" :
              System.out.println("a letra :" + letra +" é uma vogal");
          break;

          default:
              System.out.println("a letra :" + letra +" é uma consoante");
      }
    }
}