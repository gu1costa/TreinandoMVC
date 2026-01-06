package carrinho;

public class CarrinhoController {
    private CarrinhoService service;

    public CarrinhoController(CarrinhoService service) {
        this.service = service;
    }

    public int adicionarItem(Carrinho carrinho){
        return service.adicionarItem(carrinho);
    }

    public int removerItem(Carrinho carrinho){
        return service.removerItem(carrinho);
    }

    public double calcularTotal(Carrinho carrinho){
        return service.calcularTotal(carrinho);
    }
}
