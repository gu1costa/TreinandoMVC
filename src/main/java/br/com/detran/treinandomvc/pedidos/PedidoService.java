package br.com.detran.treinandomvc.pedidos;

public class PedidoService {
    public double calcularTotal(Pedido pedido){
        return pedido.getValorUnitario() * pedido.getQuantidade();
    }

    public double aplicarDesconto(Pedido pedido){
        double total = calcularTotal(pedido);

        if(pedido.getQuantidade() >= 10){
            return total * 0.90;
        }
        return total;
    }

    public boolean estaPago(Pedido pedido, double valorPago){
        double valorFinal = aplicarDesconto(pedido);
        return valorPago >= valorFinal;
    }
}
