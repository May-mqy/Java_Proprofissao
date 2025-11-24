//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
package lista_comandos_repeticao.Exerc3;
import java.util.*;

public class Exerc3_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();

        int i = 1;
        while(i<=10){
            System.out.println(nome);
            i++;
        }

    }
}
