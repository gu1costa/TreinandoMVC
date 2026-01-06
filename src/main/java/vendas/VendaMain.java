package vendas;

import aluno.AlunoService;

public class VendaMain {
    public static void main(String[] args) {
        VendaService service = new VendaService();
        VendaController controller = new VendaController(service);

        Venda venda1 = new Venda("Mouse", 50, 2);

        controller.calcularTotal(venda1);
        controller.finalizarVenda(venda1);

        System.out.println("Produto da venda: " + venda1.getProduto());
        System.out.println("Quantidade: " + venda1.getQuantidade());
        System.out.println("Valor total: " + venda1.getValorTotal());
        System.out.println("Finalizada: " + venda1.getFinalizada());
        System.out.println("A venda foi válida? " + controller.vendaValida(venda1));
    }
}
