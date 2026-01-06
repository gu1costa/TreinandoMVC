package consulta;

public class ConsultaService {
    public double calcularValor(Consulta consulta){
        consulta.setValor(120);
        return consulta.getValor();
    }

    public boolean realizarConsulta(Consulta consulta){
        consulta.setRealizada(true);
        return true;
    }

    public boolean foiRealizada(Consulta consulta){
        /*
        if(consulta.getRealizada()){
            return true;
        } else {
            return false;
        }
        */
        return consulta.getRealizada();
    }
}
