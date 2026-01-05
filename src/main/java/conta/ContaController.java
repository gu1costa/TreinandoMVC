package conta;

public class ContaController {

    private ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    public boolean depositar(Conta conta, double valor){
        return service.depositar(conta, valor);
    }

    public boolean sacar(Conta conta, double valor){
        return service.sacar(conta, valor);
    }
}
