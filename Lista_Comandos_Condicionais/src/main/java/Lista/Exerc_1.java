//1.Escreva um algoritmo em JAVA que leia um número einforme se ele é divisível
// por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.

package Lista;
import java.util.Scanner;

public class Exerc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 10 == 0) {
            System.out.println("O número é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println("O número é divisível por 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é divisível por 2.");
        } else {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }

        sc.close();
    }
}
