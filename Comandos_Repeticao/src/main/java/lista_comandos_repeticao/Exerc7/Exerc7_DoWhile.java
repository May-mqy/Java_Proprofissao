//Leia a idade de 20 pessoas e exiba a média das idades.


package lista_comandos_repeticao.Exerc7;

import java.util.Scanner;

public class Exerc7_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i=1, soma = 0, idade, media;

        do{
            System.out.print("Informe o " + i +"º idade:");
            idade = sc.nextInt();
            soma += idade;
            i++;
        }while(i<=20);

        media = soma/20;
        System.out.println("A media das idades é: " + media);
    }
}
