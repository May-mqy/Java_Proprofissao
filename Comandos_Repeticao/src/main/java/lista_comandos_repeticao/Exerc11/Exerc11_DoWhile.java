//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
//maiores do que 8.

package lista_comandos_repeticao.Exerc11;

import java.util.Scanner;

public class Exerc11_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, maiores=0, i=1;

        do{
            System.out.print("Informe o " + i + "º número: ");
            num = scanner.nextInt();

            if(num>8){
                maiores++;
            }

            i++;
        }while(i<=20);

        System.out.println("Tem " + maiores + " números maiores que 8");
    }
}
