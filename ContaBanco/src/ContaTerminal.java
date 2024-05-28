import java.util.Scanner;

        /* int conta = 1021;
        String agencia = "067-8";
        String nomeCliente = "SAMIR MELO";
        double saldo = 237.48;
        */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
        int conta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Bem vindo ao Banco DIO, Por favor, informe o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o número da sua conta: ");
        conta = input.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = input.next();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " +  agencia +", conta: " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque." );
        

        input.close();
    }
}
