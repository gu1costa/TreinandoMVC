package consulta;

public class ConsultaMain {
    public static void main(String[] args) {
        ConsultaService service = new ConsultaService();
        ConsultaController controller = new ConsultaController(service);

        Consulta consulta1 = new Consulta("Guilherme");

        System.out.println("Nome do paciente: " + consulta1.getPaciente());
        System.out.println("Valor da consulta: R$" + controller.calcularValor(consulta1));
        controller.realizarConsulta(consulta1);
        System.out.println("A consulta foi realizada?" + controller.foiRealizada(consulta1));
    }
}
