import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente;
        int contaCliente;
        String agencia;
        double saldoConta;

        System.out.println("Para abertura de conta, por gentileza preencha os campos conforme solicitado.");

        System.out.println("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        contaCliente = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência correspondente: ");
        agencia = scanner.nextLine();
             
        System.out.println("Digite o valor do valor a ser depositado: ");
        saldoConta = scanner.nextDouble();

        String conclusao = "Olá " + nomeCliente + ",\n" +
        "Obrigado por criar uma conta em nosso banco! " +
        "Sua agência é " + agencia + ", conta " + contaCliente + "\n" +
        "Seu saldo inicial de R$" + saldoConta + " já está disponível para saque.";

        System.out.println("\n" + conclusao); 
    }
    

}
