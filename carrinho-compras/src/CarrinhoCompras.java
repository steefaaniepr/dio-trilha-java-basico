import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens;

    public CarrinhoCompras(List<Item> itens) {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.nome.equals(nome));
    }

    public double calcularValorTotal() {
        double total = 0; 
        for (Item item : itens) { 
            total += item.preco * item.quantidade;
        }
        return total;
    }   

    public void exibirItens() {
        for (Item item : itens) { 
            System.out.println("Nome: " + item.nome + ", Preço: " + item.preco + ", Quantidade: " + item.quantidade);
        }
    }           

}
