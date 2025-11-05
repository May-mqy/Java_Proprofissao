//Escreva um porgrama que leia dois números inteiros e troque os seus valores, ou seja, o primeiro
// deve ficar com o valor do segundo e vice-versa

package lista_exerc_1;
import java.util.Scanner;

public class Exerc6 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Os números na ordem trocada: " + num1 + " e " + num2);

        sc.close();
    }
}
