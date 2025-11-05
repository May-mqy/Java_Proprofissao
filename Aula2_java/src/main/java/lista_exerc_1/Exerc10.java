//Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%

package lista_exerc_1;
import java.util.Scanner;

public class Exerc10 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário base: ");
        double salario = sc.nextInt();
        float comissao = 0.15f;

        double calculo = salario * comissao;
        double liquido = salario + calculo;

        System.out.printf("O salário líquido será de: %.2f", liquido);

        sc.close();
    }
}
