package comandosrepeticao;
import java.sql.SQLOutput;
import java.util.*;

public class ContagemFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,impares=0,pares=0;


        for(int i=1; i<=10;i++){
            System.out.print("Informe um número: ");
            num = entrada.nextInt();

            if (num%2==0){
                pares++;
            }
            else{
                impares++;
            }
        }

        System.out.println("A quantidade de números pares: " + pares);
        System.out.println("A quantidade de números impares: " + impares);
    }
}
