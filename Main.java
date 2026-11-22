import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite a quantidade de alunos: ");
    int quantidade = scanner.nextInt();

    for (int i = 1; i <= quantidade; i++) {
        System.out.println("Digite o nome do aluno " + i + ": ");
        String nome = scanner.next();

        System.out.println("Média de " + nome + ": ");
        double media = scanner.nextDouble();

     
    if (media >= 7) {
        System.out.println("Aprovado");
    } else if (media >= 5) {
        System.out.println("Recuperação");
    } else {
        System.out.println("Reprovado");
         }
      }
    scanner.close();
  } 
}