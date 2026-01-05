package br.com.detran.treinandomvc.pedidos;

public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service){
        this.service = service;
    }

    public double calcularTotal(Pedido pedido){
        return service.calcularTotal(pedido);
    }

    public double aplicarDesconto(Pedido pedido){
        return service.aplicarDesconto(pedido);
    }

    public boolean estaPago(Pedido pedido, double valorPago){
        return service.estaPago(pedido, valorPago);
    }
}
