//3.	A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. Fazer um algoritmo em JAVA que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.

package Lista;
import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe seu saldo médio: ");
        double saldo = sc.nextDouble();
        double percentual;
        double credito;
        double total;

        if (saldo<=500){
            System.out.println("Seu saldo é: R$" + saldo + " e você não tem direito a crédito");
        } else if(saldo>500 && saldo<=1000 ){
            percentual = 0.3;
            credito = saldo*percentual;
            total = credito + saldo;
            System.out.println("Seu saldo é R$" + saldo + " e você tem direito à + 30% do saldo que é: R$" + credito + "\nSeu saldo final = R$" + total);
        } else if(saldo>1000 && saldo<=3000 ){
            percentual = 0.4;
            credito = saldo*percentual;
            total = credito + saldo;
            System.out.println("Seu saldo é R$" + saldo + " e você tem direito à + 30% do saldo que é: R$" + credito + "\nSeu saldo final = R$" + total);
        }else{
            percentual = 0.5;
            credito = saldo*percentual;
            total = credito + saldo;
            System.out.println("Seu saldo é R$" + saldo + " e você tem direito à + 30% do saldo que é: R$" + credito + "\nSeu saldo final = R$" + total);
        }
        sc.close();
    }
}
