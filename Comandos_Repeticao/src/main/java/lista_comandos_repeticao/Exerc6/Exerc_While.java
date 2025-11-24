//Leia a idade de 20 pessoas e exiba a soma das idades.

package lista_comandos_repeticao.Exerc6;

import java.util.Scanner;

public class Exerc_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i=1, soma = 0, idade;

        while(i<=20){
            System.out.print("Informe o " + i +"º idade:");
            idade = sc.nextInt();
            soma += idade;
            i++;
        }

        System.out.println("A soma das idades é: " + soma);
    }
}
