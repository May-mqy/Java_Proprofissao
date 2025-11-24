//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

package lista_comandos_repeticao.Exerc11;

import java.util.Scanner;

public class Exerc11_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, maiores=0;

        for(int i=1; i<=20;i++){
            System.out.print("Informe o " + i + "º número: ");
            num = scanner.nextInt();

            if(num>8){
                maiores++;
            }
        }

        System.out.println("Tem " + maiores + " números maiores que 8");
    }
}
