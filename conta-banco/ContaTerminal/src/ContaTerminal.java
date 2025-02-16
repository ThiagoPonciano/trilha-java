import java.util.Scanner;

public class ContaTerminal {
    private int numeroAgencia;
    private String numeroConta;
    private String nomeCliente;
    private double saldoConta;

    private static Scanner scanner = new Scanner(System.in);

    public void criarConta() {
        System.out.print("Digite o número da agência: ");
        this.numeroAgencia = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldoConta = scanner.nextDouble();
        scanner.nextLine();
    }

    public void exibirDadosConta() {
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Titular: " + nomeCliente);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldoConta);
    }

    public double sacar(double saldoDaConta, double valorDoSaque) {
        return saldoDaConta - valorDoSaque;
    }

    public double depositar(double saldoDaConta, double valorDoDeposito) {
        return saldoDaConta + valorDoDeposito;
    }

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        
        System.out.println("Seja bem vindo ao Banco!");
        System.out.println("Já Possuí conta? (sim/nao)");
        String resposta = scanner.nextLine().toLowerCase();
        if (resposta.equals("nao")) {
            conta.criarConta();
            conta.exibirDadosConta();
        }
        else {
            System.out.print("Digite o saldo disponível: ");
            conta.saldoConta = scanner.nextDouble();
            System.out.println("Qual operação deseja realizar?");
            System.out.println("Digite 1 para Saque.");
            System.out.println("Digite 2 para depósito.");
            int respostaOperacao = scanner.nextInt();
            if (respostaOperacao == 1) {
                System.out.print("Informe o valor que deseja sacar: ");
                double valorSaque = scanner.nextDouble();
                conta.saldoConta = conta.sacar(conta.saldoConta, valorSaque);
                System.out.println("Resgate realizado com sucesso!");
                System.out.println("Seu saldo atual é de: R$" + conta.saldoConta);
            }
            else if (respostaOperacao == 2) {
                System.out.print("Informe o valor que deseja depositar: ");
                double valorDeposito = scanner.nextDouble();
                conta.saldoConta = conta.depositar(conta.saldoConta, valorDeposito);
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Seu saldo atual é de: R$" + conta.saldoConta);
            }
            else {
                System.err.println("Opção inválida!");
            }

        }

    }
    
    

}
