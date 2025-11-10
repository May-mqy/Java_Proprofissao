//7. Construa um algoritmo em JAVA que determine (imprima) se um dado número N
// inteiro (recebido através do teclado) é PAR ou ÍMPAR.

package Lista;
import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println( n + " é par");
        } else {
            System.out.println( n + " é impar");
        }

        sc.close();
    }
}
