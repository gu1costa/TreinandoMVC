package consulta;

public class ConsultaController {
    private ConsultaService service;

    public ConsultaController(ConsultaService service){
        this.service = service;
    }

    public double calcularValor(Consulta consulta){
        return service.calcularValor(consulta);
    }

    public boolean realizarConsulta(Consulta consulta){
        return service.realizarConsulta(consulta);
    }

    public boolean foiRealizada(Consulta consulta){
        return service.foiRealizada(consulta);
    }
}
