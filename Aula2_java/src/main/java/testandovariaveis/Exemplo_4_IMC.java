package testandovariaveis;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo_4_IMC {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        float peso =  sc.nextFloat();

        System.out.println("Informe sua altura:");
        float altura =  sc.nextFloat();

        float IMC = peso/(altura*altura);
        System.out.println("Seu IMC é de: " + IMC);



    }
}
