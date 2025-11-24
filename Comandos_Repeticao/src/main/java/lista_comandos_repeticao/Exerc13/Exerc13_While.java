//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

package lista_comandos_repeticao.Exerc13;

import java.util.Scanner;

public class Exerc13_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, entre=0, i=1;

        while(i<=20){
            System.out.print("Informe o " + i + "º número: ");
            num = scanner.nextInt();

            if(num >=0 && num<=100){
                entre++;
            }

            i++;
        }

        System.out.println( entre + " números estão entre 0  a 100");
    }
}
