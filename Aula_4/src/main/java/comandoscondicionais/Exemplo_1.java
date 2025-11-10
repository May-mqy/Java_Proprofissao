package comandoscondicionais;
import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        float peso =  sc.nextFloat();

        System.out.println("Informe sua altura:");
        float altura =  sc.nextFloat();

        float IMC = peso/(altura*altura);
        //peso/Math.pow(altura,2)
        System.out.println("Seu IMC é de: " + IMC);

        if(IMC<18.5){
            System.out.println("Você está abaixo do peso!");
        }else if((IMC>=18.5) && (IMC<=24.9)){
            System.out.println("Você está no peso ideal");
        }else if((IMC>=25) && (IMC>=29.9)){
            System.out.println("Você está levemente acima do peso");
        }else if((IMC>=30) && (IMC<=34.9)){
            System.out.println("Você está na obesidade grau I");
        }
        else if((IMC>=35) && (IMC<=39.9)){
            System.out.println("Você está na obesidade grau II");
        }
        else{
            System.out.println("Você está na obesidade mobida");
        }

    }
}
