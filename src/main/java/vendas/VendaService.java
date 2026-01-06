package vendas;

public class VendaService {
    public double calcularTotal(Venda venda){
        venda.setValorTotal(venda.getValorUnitario() * venda.getQuantidade());
        return venda.getValorTotal();
    }

    public boolean finalizarVenda(Venda venda){
        venda.setFinalizada(true);
        return true;
    }

    public boolean vendaValida(Venda venda){
        return venda.getFinalizada();
    }
}
