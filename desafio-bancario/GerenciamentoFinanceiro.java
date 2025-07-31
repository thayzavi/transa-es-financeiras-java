import java.util.ArrayList;
import java.util.List;

public class GerenciamentoFinanceiro {
    private List<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
            return;
        }
        for (Transacao t : transacoes) {
            System.out.println(t);
        }
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo().equals("entrada")) {
                saldo += t.getValor();
            } else if (t.getTipo().equals("saida")) {
                saldo -= t.getValor();
            }
        }

        return saldo;
    }
}
