package rotinabancaria;
import java.util.*;


public class Conta {

    int numero_conta;
    String titular_conta;
    double saldo;

    Scanner entrada = new Scanner(System.in);

    public Conta (String nome_titular, double saldo_inicial){ //metodo
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        this.numero_conta = gerador_numero.nextInt(1000);
    }

    public void VerSaldo(){
        System.out.println("O número da conta: " + numero_conta);
        System.out.println("O títulor da conta: " + titular_conta);
        System.out.println("O saldo atual da conta: " + saldo);
    }

    public void Saque(double valor_saque){
        if(saldo >= valor_saque){
            saldo = saldo - valor_saque;
            System.out.println("O saldo atual é: " + saldo);
        }else{
            System.out.println("Seu saldo é insuficiente!");
        }
    }

    public void Deposito(double valor_deposito){
        if(valor_deposito <=0){
            System.out.println("Valor de depósito inválido!");
        }else{
            saldo = saldo + valor_deposito;
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public void Emprestimo(double valor_emprestimo){
        if(saldo < 5000){
            System.out.println("Você não pode solicitar um emprestimo");
        }else{
            saldo += valor_emprestimo;
            System.out.println("Emprestimo Realizado! Seu saldo atual: " + saldo);
        }
    }

    public void CartaoCredito (){
        if(saldo>= 2500){
            System.out.println("Cartão de crédito liberado! Em breve chegara na sua casa");
        }else{
            System.out.println("Pedido de Cartão de Crédito negado devido a saldo insuficiente!");
        }
    }

    public void Iniciar (){
        int opcao;

        do{
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        }while(opcao!=6);
    }


    public void Exibir_menu(){
        System.out.println("");
        System.out.println("Bem-vinde ao Banco Proa Bank! ");
        System.out.println("Escolha a operação desejada: ");
        System.out.println(" 1 - Ver Saldo ");
        System.out.println(" 2 - Sacar ");
        System.out.println(" 3 - Depositar ");
        System.out.println(" 4 - Emprestimo");
        System.out.println(" 5 - Solicitar Cartão de Credito");
        System.out.println(" 6 - Finalizar ");
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;
        double emprestimo;

        switch (opcao){
            case 1:VerSaldo();
            break;
            case 2:
                System.out.print("Informe o valor a ser sacado: ");
                saque = entrada.nextDouble();
                Saque(saque);
            break;
            case 3:
                System.out.print("Informe o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
            break;
            case 4:
                System.out.print("Informe o valor a ser solicitado de emprestimo: ");
                emprestimo = entrada.nextDouble();
                Emprestimo(emprestimo);
            break;
            case 5:CartaoCredito();
            break;
            case 6:
                System.out.println("Operação Finalizada! Obrigado por confiar no Proa Bank!");
                break;
            default:
                System.out.println("Opção Invalida, Informe um número de 1 a 5");
        }
    }

}
