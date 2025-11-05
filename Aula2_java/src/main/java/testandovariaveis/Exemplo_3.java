package testandovariaveis;
import java.util.Scanner;

public class Exemplo_3 {
    public static void main(String [] args) {

        float nota1;
        float nota2;
        float nota3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        System.out.printf("A média das 3 notas é: %.2f" , media);
    }
}
