//Leia a idade de 20 pessoas e exiba a média das idades.

package lista_comandos_repeticao.Exerc7;

import java.util.Scanner;

public class Exerc7_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, soma = 0, idade, media;


        for(i = 1; i<=20;i++){
            System.out.print("Informe o " + i +"º idade:");
            idade = sc.nextInt();
            soma += idade;
            i++;
        }
        media = soma/20;
        System.out.println("A media das idades é: " + media);
    }
}
