package comandosrepeticao;
import java.util.*;

public class TabuadaDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informa um número para realizar a tabuda: ");
        int num = sc.nextInt();
        int calculo,i=1;

        do{
            calculo = num * i;
            System.out.println( num + " x " + i + " = " + calculo);
            i++;
        } while(i<=10);
    }
}
