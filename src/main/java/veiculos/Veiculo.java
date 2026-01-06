package veiculos;

public class Veiculo {

    private String placa;
    private String modelo;
    private double diaria;
    private boolean alugado;
    private int diasAlugados;

    public Veiculo(){}

    public Veiculo(String placa, String modelo, int diasAlugados){
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = 0;
        this.alugado = false;
        this.diasAlugados = diasAlugados;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(int diasAlugados) {
        this.diasAlugados = diasAlugados;
    }
}
