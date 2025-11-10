//2. Construa um algoritmo de JAVA para determinar se o indivíduo esta com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo.

package Lista;
import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso/Math.pow(altura,2);

        if (IMC<20){
            System.out.println("Abaixo do peso");
        } else if (IMC>20 && IMC<=25) {
            System.out.println("Peso Normal");
        } else if (IMC>25 && IMC<=30) {
            System.out.println("Sobrepeso");
        } else if (IMC>30 && IMC<=40) {
            System.out.println("Obeso");
        }else{
            System.out.println("Obeso Mórbido");
        }

        sc.close();
    }
}
