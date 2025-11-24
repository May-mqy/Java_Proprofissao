//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
package lista_comandos_repeticao.Exerc3;
import java.util.*;

public class Exerc3_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = sc.nextLine();

        for(int i=1; i<=10;i++){
            System.out.println(nome);
        }
    }

}
