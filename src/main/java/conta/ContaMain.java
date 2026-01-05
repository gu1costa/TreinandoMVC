package conta;

public class ContaMain {
    public static void main(String[] args) {
        ContaService service = new ContaService();
        ContaController controller = new ContaController(service);

        Conta conta1 = new Conta(1, "Guilherme", 475.50);

        controller.depositar(conta1, 100);
        controller.sacar(conta1, 50);

        System.out.println("Número da conta: " + conta1.getNumero());
        System.out.println("Titular da conta: " + conta1.getTitular());
        System.out.println("Saldo da conta: " + conta1.getSaldo());
        System.out.println("Após o depósito: " + controller.depositar(conta1, 100));
        System.out.println("Após o saque: " + controller.sacar(conta1, 50));
    }
}
