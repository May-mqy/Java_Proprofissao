//Escreva um algoritmo que calcule a soma dos números de 1 a 15.

package lista_comandos_repeticao.Exerc2;

public class Exerc2_For {
    public static void main(String[] args) {
        int calculo = 0;

        for(int i=1; i<=15;i++){
            calculo += i;
        }

        System.out.println(calculo);


    }
}
