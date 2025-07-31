import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoFinanceiro sistema = new GerenciamentoFinanceiro();
        int opcao;

        do {
            System.out.println("\n--- Controle Financeiro ---");
            System.out.println("1. Adicionar transações");
            System.out.println("2. Listar transações");
            System.out.println("3. Ver saldo");
            System.out.println("0. Sair");
            System.out.println(" Escolha:");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.println("Valor: ");
                    double valor = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.println("Tipo (entrada/saida)");
                    String tipo = scanner.nextLine();

                    Transacao nova = new Transacao(descricao, valor, LocalDate.now(), tipo);
                    sistema.adicionarTransacao(nova);
                    System.out.println("Transação adicionada com sucesso!");
                    break;

                case 2:
                    sistema.listarTransacoes();
                    break;

                case 3:
                    double saldo = sistema.calcularSaldo();
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 0:
                    System.out.println("Encerrando");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        } while (opcao != 0);

        scanner.close();
    }
}
