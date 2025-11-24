//Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
//números.

package lista_comandos_repeticao.Exerc5;

import java.util.Scanner;

public class Exerc5_For {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int soma = 0, numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i +"º numero: ");
            numero = scan.nextInt();
            soma +=numero;
        }

        System.out.println("A soma: " + soma);
    }
}
