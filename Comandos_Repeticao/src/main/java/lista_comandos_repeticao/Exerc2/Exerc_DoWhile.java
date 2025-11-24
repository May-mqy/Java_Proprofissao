//Escreva um algoritmo que calcule a soma dos números de 1 a 15.

package lista_comandos_repeticao.Exerc2;

public class Exerc_DoWhile {
    public static void main(String[] args) {
        int n =1,soma = 0;

        do{
            soma += n;
            n++;
        }while (n<=15);

        System.out.println("A soma é igual: " + soma);
    }
}
