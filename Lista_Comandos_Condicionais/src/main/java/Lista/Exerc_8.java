//8.	Dados três valores A, B e C, construa um algoritmo em JAVA, que imprima os valores de forma descendente (do maior para o menor).

package Lista;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[3];
        //Integer é uma classe que “embrulha” o valor do tipo int, transformando-o em um objeto.

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Ordena do maior para o menor
        Arrays.sort(numeros, Collections.reverseOrder());


        System.out.println("\nNúmeros em ordem decrescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        sc.close();
    }
}
