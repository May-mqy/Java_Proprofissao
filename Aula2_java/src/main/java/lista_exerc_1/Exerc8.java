//Faça um programa que leia um número inteiro e exiba a sua tabuada de  multiplicação até o décimo valor

package lista_exerc_1;
import java.util.Scanner;

public class Exerc8 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um número inteiro para realizar a sua tabuada: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            int mul = num * i;
            System.out.println(num + " x " + i + " = " + mul);

        }

        sc.close();
    }
}
