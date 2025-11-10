//5. Criar um algoritmo em JAVA que informe a quantidade total de calorias de uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida (veja a tabela a seguir).

package Lista;
import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prato, sobremesa, bebida;
        int caloriasPrato = 0, caloriasSobremesa = 0, caloriasBebida = 0;

        System.out.println("Opções Prato:");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        System.out.print("Escolha: ");
        prato = sc.nextInt();

        switch (prato) {
            case 1: caloriasPrato = 180; break;
            case 2: caloriasPrato = 230; break;
            case 3: caloriasPrato = 250; break;
            case 4: caloriasPrato = 350; break;
            default: System.out.println("Opção inválida de prato!");
        }

        System.out.println("Opções Sobremesa:");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mouse diet");
        System.out.println("4 - Mouse chocolate");
        System.out.print("Escolha: ");
        sobremesa = sc.nextInt();

        switch (sobremesa) {
            case 1: caloriasSobremesa = 75; break;
            case 2: caloriasSobremesa = 110; break;
            case 3: caloriasSobremesa = 170; break;
            case 4: caloriasSobremesa = 200; break;
            default: System.out.println("Opção inválida de Sobremesa!");
        }

        System.out.println("Opções Bebida:");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        System.out.print("Escolha: ");
        bebida = sc.nextInt();

        switch (bebida) {
            case 1: caloriasBebida = 20; break;
            case 2: caloriasBebida = 70; break;
            case 3: caloriasBebida = 100; break;
            case 4: caloriasBebida = 65; break;
            default: System.out.println("Opção inválida de prato!");
        }

        int calorias = caloriasPrato + caloriasBebida + caloriasSobremesa;
        System.out.println("O seu prato tem o total de " + calorias + " calorias");
        sc.close();
    }
}
