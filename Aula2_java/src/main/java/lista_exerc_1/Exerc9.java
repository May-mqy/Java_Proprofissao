//Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dia
// de vida ela tem.

package lista_exerc_1;
import java.util.Scanner;

public class Exerc9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        int anos = sc.nextInt();

        System.out.println("Quantos meses?");
        int meses = sc.nextInt();

        System.out.println("E quantos dias?");
        int dias = sc.nextInt();

        int dias_anos= anos * 365;
        int dias_mes= meses*30;

        int dias_vida = dias_anos + dias_mes + dias;
        System.out.println("Você tem " + dias_vida + " dias de vida");

        sc.close();
    }
}
