package consulta;

public class Consulta {
    private int id;
    private String paciente;
    private double valor;
    private boolean realizada;

    public Consulta(){}

    public Consulta(String paciente){
        this.id = id;
        this.paciente = paciente;
        this.valor = 0;
        this.realizada = false;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean getRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
}
