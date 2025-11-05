//Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido,
// considerando que o fundionário recebe 5% de comissão sobre o salário base.

package lista_exerc_1;
import java.util.Scanner;

public class Exerc5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário base: ");
        double salario = sc.nextInt();
        float comissao = 0.05f;

        double calculo = salario * comissao;
        double liquido = salario + calculo;

        System.out.printf("O salário líquido será de: %.2f", liquido);

        sc.close();
    }
}
