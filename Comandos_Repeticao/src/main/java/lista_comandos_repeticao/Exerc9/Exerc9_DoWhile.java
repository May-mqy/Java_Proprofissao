//Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

package lista_comandos_repeticao.Exerc9;

import java.util.Scanner;

public class Exerc9_DoWhile {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int idade,maisnova = 0,i=2;
            String nome, Nomenova;

            System.out.print("Informe a 1º idade: ");
            maisnova = sc.nextInt(); sc.nextLine();
            System.out.print("Informe o 1º nome: ");
            Nomenova = sc.nextLine();


            do{
                System.out.print("Informe a "+ i +"º idade: ");
                idade = sc.nextInt(); sc.nextLine();
                System.out.print("Informe o "+ i +"º nome: ");
                nome = sc.nextLine();

                if(idade<maisnova){
                    maisnova = idade;
                    Nomenova = nome;
                }

                i++;

            }while(i<=10);

        System.out.println("A pessoa mais nova é a(o) " + Nomenova + " com " + maisnova + " anos");
    }
}
