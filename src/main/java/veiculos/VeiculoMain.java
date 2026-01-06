package veiculos;

public class VeiculoMain {
    public static void main(String[] args) {
        VeiculoService service = new VeiculoService();
        VeiculoController controller = new VeiculoController(service);

        Veiculo veiculo1 = new Veiculo("ABC1D23", "Mercedes", 5);

        controller.alugar(veiculo1);

        controller.devolver(veiculo1);

        System.out.println("Modelo do veículo: " + veiculo1.getModelo());
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Dias alugados: "  + veiculo1.getDiasAlugados());
        System.out.println("Valor total do aluguel: " + controller.calcularAluguel(veiculo1));
        System.out.println("Pode alugar? " + controller.podeAlugar(veiculo1));
    }
}
