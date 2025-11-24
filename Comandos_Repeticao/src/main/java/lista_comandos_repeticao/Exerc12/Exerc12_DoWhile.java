//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares

package lista_comandos_repeticao.Exerc12;

import java.util.Scanner;

public class Exerc12_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, pares=0, i=1;

        do{
            System.out.print("Informe o " + i + "º número: ");
            num = scanner.nextInt();

            if(num%2==0){
                pares++;
            }

            i++;
        }while(i<=20);

        System.out.println("Tem " + pares + " números pares");
    }
}
