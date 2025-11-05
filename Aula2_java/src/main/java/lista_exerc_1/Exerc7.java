//Crie um progama que leia o valor de depósito mensal e em uma poupança e a taxa de
// juros mensal, e calcule o montante após 12 meses.

package lista_exerc_1;
import java.util.Scanner;

public class Exerc7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: R$ ");
        double depositoMensal = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJuros = sc.nextDouble() / 100;

        double montante = 0;

        for (int i = 1; i <= 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJuros);
        }

        System.out.printf("O montante após 12 meses será de: R$ %.2f%n", montante);

        sc.close();
    }
}
