package veiculos;

public class VeiculoService {
    public boolean podeAlugar(Veiculo veiculo){
        if(veiculo.getAlugado()){
            return false;
        } else {
            return true;
        }
    }

    public boolean alugar(Veiculo veiculo){
        if(podeAlugar(veiculo)){
            veiculo.setAlugado(true);
            return true;
        } else {
            return false;
        }
    }

    public double calcularAluguel(Veiculo veiculo){
        double diaria = 120;
        return diaria * veiculo.getDiasAlugados();
    }


    public boolean devolver(Veiculo veiculo){
        if(veiculo.getAlugado()){
            veiculo.setAlugado(false);
            return true;
        } else {
            return false;
        }
    }
}
