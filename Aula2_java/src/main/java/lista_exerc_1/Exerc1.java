//Faça um programa que solicite dois números inteiros e exiba a soma, subtração,
// multiplicação e divisão entre eles.

package lista_exerc_1;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        float div = num1/num2;

        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + sub);
        System.out.println("Multiplicação: " + num1 + " x " + num2 + " = " + mul);
        System.out.println("Divisão:" + num1 + " / " + num2 + " = " + div);

        sc.close();
    }
}
