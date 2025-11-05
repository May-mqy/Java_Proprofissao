//Escreva um programa que leia o raio de um círculo e calcule sua área e
// perímetro.

package lista_exerc_1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc2 {
    public static void main(String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o valor do raio do círculo");
        float raio = sc.nextInt();
        float pi = 3.14f;

        float area = pi*(raio*raio);
        float perimetro = 2*pi*raio;

        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);

        sc.close();
    }
}
