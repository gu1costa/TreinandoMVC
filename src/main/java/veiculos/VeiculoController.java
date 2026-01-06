package veiculos;

public class VeiculoController {
    private VeiculoService service;

    public VeiculoController(VeiculoService service){
        this.service = service;
    }

    public boolean podeAlugar(Veiculo veiculo){
        return service.podeAlugar(veiculo);
    }

    public boolean alugar(Veiculo veiculo){
        return service.alugar(veiculo);
    }

    public double calcularAluguel(Veiculo veiculo){
        return service.calcularAluguel(veiculo);
    }

    public boolean devolver(Veiculo veiculo){
        return service.devolver(veiculo);
    }
}
