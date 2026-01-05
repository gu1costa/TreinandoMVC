package br.com.detran.treinandomvc.pedidos;

public class Pedido {
    private int id;
    private String cliente;
    private double valorUnitario;
    private int quantidade;

    public Pedido(){}

    public Pedido(int id, String cliente, double valorUnitario, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
