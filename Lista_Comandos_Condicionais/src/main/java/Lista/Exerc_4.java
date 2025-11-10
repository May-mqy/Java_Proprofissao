//4.	Crie um algoritmo em JAVA que leia a idade de uma pessoa e informe a sua classe eleitoral:
//•	não eleitor (abaixo de 16 anos);
//•	eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
//•	eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).

package Lista;
import java.util.Scanner;

public class Exerc_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe uma idade");
        int idade = sc.nextInt();

        if(idade>0 && idade<16){
            System.out.println("Não eleitor");
        } else if (idade>18 && idade<65){
            System.out.println("Eleitor obrigatório");
        } else if (idade>=16 && idade<18 || idade>65 && idade<100) {
            System.out.println("Eleitor Facultativo");
        } else{
            System.out.println("Infome uma idade válida.");
        }
        sc.close();
    }
}
