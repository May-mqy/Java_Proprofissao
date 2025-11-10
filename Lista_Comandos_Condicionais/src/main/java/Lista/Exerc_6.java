//6. Criar um algoritmo em JAVA que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.

package Lista;
import java.util.Scanner;

public class Exerc_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe um número entre 1 e 7");
        int num = sc.nextInt();
        String dia;

        switch (num){
            case 1: dia = "Domingo"; break;
            case 2: dia = "Segunda"; break;
            case 3: dia = "Terça"; break;
            case 4: dia = "Quarta"; break;
            case 5: dia = "Quinta"; break;
            case 6: dia = "Sexta"; break;
            case 7: dia = "Sabado"; break;
            default: System.out.println("Dia Inválido!");
            return;
        }

        System.out.println("O dia da semana " + num + " é equivalente á " + dia);
        sc.close();
    }
}
