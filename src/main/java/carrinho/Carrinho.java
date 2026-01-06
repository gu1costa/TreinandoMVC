package carrinho;

public class Carrinho {

    private int id;
    private String produto;
    private double preco;
    private int quantidade;

    public Carrinho(){}

    public Carrinho(int id, String produto, double preco){
        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Carrinho(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getProduto() { return produto; }
    public void setProduto(String produto) { this.produto = produto; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
