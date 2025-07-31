import java.time.LocalDate;

public class Transacao {
    private String descricao;
    private double valor;
    private LocalDate date;
    private String tipo;

    public Transacao(String descricao, double valor, LocalDate data, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.date = data;
        this.tipo = tipo.toLowerCase();
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return date + "|" + tipo.toLowerCase() + "|" + descricao + "| R$" + valor;
    }
}