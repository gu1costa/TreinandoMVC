package conta;

public class ContaService {
    public boolean depositar(Conta conta, double valor) {
        if (valor > 0){
            conta.setSaldo(conta.getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(Conta conta, double valor) {
        if(valor <= conta.getSaldo()){
            conta.setSaldo(conta.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
}
