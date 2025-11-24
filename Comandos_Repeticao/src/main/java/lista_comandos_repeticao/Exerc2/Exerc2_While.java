//Escreva um algoritmo que calcule a soma dos números de 1 a 15.

package lista_comandos_repeticao.Exerc2;

public class Exerc2_While {
    public static void main(String[] args) {
        int n=1, soma = 0;

        while(n<=15){
            soma += n;
            n++;
        }

        System.out.println("A soma dos números de 1 a 15 é " + soma);
    }
}
