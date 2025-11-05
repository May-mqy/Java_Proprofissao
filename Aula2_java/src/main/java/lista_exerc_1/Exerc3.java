//Crie um programa que leia a base e a altura de um triângulo e calcue sua área

package lista_exerc_1;
import java.util.Scanner;

public class Exerc3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura do triângulo: ");
        float altura = sc.nextFloat();

        System.out.println("Informe a base do triângulo: ");
        float base = sc.nextFloat();

        float area = (base*altura)/2;
        System.out.println("A área do triângulo é de: " + area + "metros quadrados");

        sc.close();
    }
}
