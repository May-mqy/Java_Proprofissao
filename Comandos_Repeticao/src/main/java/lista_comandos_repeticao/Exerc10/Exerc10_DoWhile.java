//Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

package lista_comandos_repeticao.Exerc10;

import java.util.Scanner;

public class Exerc10_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        int conta, i=1;

        do{
            conta = num * i;
            System.out.println(num + " X " + i + " = " + conta);
            i++;
        }while(i<=10);
    }
}
