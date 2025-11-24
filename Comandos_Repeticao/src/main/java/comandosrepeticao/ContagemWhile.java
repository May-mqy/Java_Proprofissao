package comandosrepeticao;
import java.util.*;

public class ContagemWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int pares = 0;
        int impares =0;
        int n = 1;

        while(n<=10){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if(num%2==0){
                pares++;
            } else{
                impares++;
            }
            n++;
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);
    }
}
