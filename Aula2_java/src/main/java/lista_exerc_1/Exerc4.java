//Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e
// calcule a média ponderada considerando pesos 2,3, e 5 para as notas, respectivamente.

package lista_exerc_1;
import java.util.Scanner;

public class Exerc4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primera nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Informe a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.print("Informe a terceira nota: ");
        int nota3 = sc.nextInt();

        float media = (nota1*2)+(nota2*3)+(nota3*5);
        float ponderada = media/10;

        System.out.printf("A média das 3 notas é: %.2f" , ponderada);

        sc.close();
    }
}
