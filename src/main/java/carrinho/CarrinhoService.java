package carrinho;

public class CarrinhoService {
    public int adicionarItem(Carrinho carrinho) {
        carrinho.setQuantidade(carrinho.getQuantidade() + 1);
        return carrinho.getQuantidade();
    }

    public int removerItem(Carrinho carrinho) {
        if(carrinho.getQuantidade() > 0) {
            carrinho.setQuantidade(carrinho.getQuantidade() - 1);
            return carrinho.getQuantidade();
        } else {
            return 0;
        }
    }

    public double calcularTotal(Carrinho carrinho){
        return carrinho.getPreco() * carrinho.getQuantidade();
    }
}
