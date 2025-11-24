//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
//100, quantos estão entre 101 e 200 e quantos são maiores de 200.
package lista_comandos_repeticao.Exerc14;

import java.util.Scanner;

public class Exerc14_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, entre1=0, entre2=0, entre3=0;

        for(int i=1; i<=20;i++){
            System.out.print("Informe o " + i + "º número: ");
            num = scanner.nextInt();

            if(num >=0 && num<=100){
                entre1++;
            } else if(num>=101 && num<=200){
                entre2++;
            } else if(num>=201){
                entre3++;
            } else{
                System.out.println("Digite um número positivo");
            }
        }

        System.out.println( entre1 + " números estão entre 0  a 100");
        System.out.println( entre2 + " números estão entre 101  a 200");
        System.out.println( entre3 + " números são maiores que 200");
    }
}
