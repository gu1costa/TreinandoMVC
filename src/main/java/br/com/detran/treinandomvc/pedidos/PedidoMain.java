package br.com.detran.treinandomvc.pedidos;

public class PedidoMain {
    public static void main(String[] args) {
        PedidoService service = new PedidoService();
        PedidoController controller = new PedidoController(service);

        Pedido pedido1 = new Pedido(1, "Guilherme", 55.20, 10);
        controller.calcularTotal(pedido1);
        controller.aplicarDesconto(pedido1);

        System.out.println("Nome do cliente: " + pedido1.getCliente());
        System.out.println("Valor da unidade: " + pedido1.getValorUnitario());
        System.out.println("Quantidade: " + pedido1.getQuantidade());
        System.out.println("Total do pedido: " + controller.calcularTotal(pedido1));
        System.out.println("Desconto aplicado: " + controller.aplicarDesconto(pedido1));
        System.out.println("Está pago? " + controller.estaPago(pedido1, 400));
    }
}
