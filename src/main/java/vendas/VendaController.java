package vendas;

public class VendaController {
    private VendaService service;

    public VendaController(VendaService service) {
        this.service = service;
    }

    public double calcularTotal(Venda venda){
        return service.calcularTotal(venda);
    }

    public boolean finalizarVenda(Venda venda){
        return service.finalizarVenda(venda);
    }

    public boolean vendaValida(Venda venda){
        return service.vendaValida(venda);
    }
}
