//Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
//números.

package lista_comandos_repeticao.Exerc5;

import java.util.Scanner;

public class Exerc5_Whilw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int numero, i=1;

        while(i<=10){
            System.out.print("Informe um numero: ");
            numero = scan.nextInt();
            soma += numero;
            i++;
        }

        System.out.println("A soma: " + soma);
    }
}
