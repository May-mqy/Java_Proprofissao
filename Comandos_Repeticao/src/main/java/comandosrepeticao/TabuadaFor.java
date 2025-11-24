package comandosrepeticao;
import java.util.*;

public class TabuadaFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        System.out.println("A Tabuada do " + n + " é igual à: ");
        for(int i=1; i<=10;i++){
            int calculo = n * i;
            System.out.println(n + " x " + i + " = " + calculo);
        }
    }
}
