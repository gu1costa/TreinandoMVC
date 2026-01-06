package carrinho;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CarrinhoMain {
    public static void main(String[] args) {
        CarrinhoService service = new CarrinhoService();
        CarrinhoController controller = new CarrinhoController(service);

        Carrinho carrinho1 = new Carrinho("Mouse", 30);

        System.out.println("Produto: " + carrinho1.getProduto());
        System.out.println("Quantidade: " + carrinho1.getQuantidade());
        System.out.println("Preco: " + controller.calcularTotal(carrinho1));

        System.out.println("Produto: " + carrinho1.getProduto());
        System.out.println("Quantidade: " + carrinho1.getQuantidade());
        controller.adicionarItem(carrinho1);
        System.out.println("Quantidade: " + carrinho1.getQuantidade());
        System.out.println("Preco: " + controller.calcularTotal(carrinho1));


    }
}
