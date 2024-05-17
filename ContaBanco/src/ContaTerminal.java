import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 

            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;

            System.out.println("Bem-vindo ao ContaBanco");
            System.out.println("Digite seu nome completo:");
              nomeCliente = sc.nextLine();

            System.out.println("Digite o número da sua agencia:");
              agencia = sc.next();

            System.out.println("Por favor, digite o numero da sua conta:");
              numeroConta = sc.nextInt();

            System.out.println("Digite seu saldo inicial:");
              saldo = sc.nextDouble();

            System.out.println("\n Conta criada com sucesso!");
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " o seu saldo R$ " + saldo + " ja esta disponivel para saque.");
        }
    }
}
