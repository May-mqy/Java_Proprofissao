//Leia o nome um número do usuário um número N e escreva o nome dele na tela N
//vezes.

package lista_comandos_repeticao.Exerc4;
import java.util.*;

public class Exerc4_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um nome: ");
        String nome = scan.nextLine();

        System.out.print("Quantas vezes?");
        int num = scan.nextInt();
        int i = 1;

        while(i<=num){
            System.out.println(nome);
            i++;
        }

    }
}
