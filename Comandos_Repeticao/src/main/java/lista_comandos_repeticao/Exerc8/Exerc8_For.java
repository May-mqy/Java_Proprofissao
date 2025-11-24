//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade


package lista_comandos_repeticao.Exerc8;

import java.util.Scanner;

public class Exerc8_For {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int i, soma = 0, idade, maiores =0;

        for(i = 1; i<=20;i++){
            System.out.print("Informe o " + i +"º idade:");
            idade = sc.nextInt();
            soma += idade;
            i++;

            if(idade>=18){
                maiores++;
            }
        }
        System.out.println(maiores + " pessoas são maiores de idades");
    }
}
