//Escreva um algoritmo que leia uma sequência de números do usuário e realize a
//soma desses números. Encerre a execução quando um número negativo for digitado.

package lista_comandos_repeticao.Exerc15;

import java.util.Scanner;

public class Exerc15_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (;;) { // for infinito
            System.out.println("Digite um número (negativo para parar):");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
