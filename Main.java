import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir via PIX");
            System.out.println("5. Investir");
            System.out.println("6. Listar contas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String titular = scanner.nextLine();
                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    banco.adicionarConta(new Conta(titular, numero));
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    String contaDep = scanner.nextLine();
                    Conta cDep = banco.buscarContaPorNumero(contaDep);
                    if (cDep != null) {
                        System.out.print("Valor a depositar: ");
                        double valorDep = scanner.nextDouble();
                        cDep.depositar(valorDep);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Número da conta: ");
                    String contaSaq = scanner.nextLine();
                    Conta cSaq = banco.buscarContaPorNumero(contaSaq);
                    if (cSaq != null) {
                        System.out.print("Valor a sacar: ");
                        double valorSaq = scanner.nextDouble();
                        cSaq.sacar(valorSaq);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Conta origem: ");
                    String origem = scanner.nextLine();
                    Conta cOrigem = banco.buscarContaPorNumero(origem);
                    System.out.print("Conta destino: ");
                    String destino = scanner.nextLine();
                    Conta cDestino = banco.buscarContaPorNumero(destino);

                    if (cOrigem != null && cDestino != null) {
                        System.out.print("Valor a transferir: ");
                        double valorTransf = scanner.nextDouble();
                        cOrigem.transferir(cDestino, valorTransf);
                    } else {
                        System.out.println("Conta(s) não encontrada(s).");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    String contaInv = scanner.nextLine();
                    Conta cInv = banco.buscarContaPorNumero(contaInv);
                    if (cInv != null) {
                        System.out.print("Valor a investir: ");
                        double valorInv = scanner.nextDouble();
                        cInv.investir(valorInv);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 6:
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
