import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var livro = new Produto("Livro", 45, 50);
        var gamesPS2 = new Produto("jogos", 10, 20);
        var blusa = new Produto("blusa", 60, 15);

        var listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(livro);
        listaDeProdutos.add(gamesPS2);
        listaDeProdutos.add(blusa);

        System.out.println("tamanho da lista: "+ listaDeProdutos.size());
        System.out.println("um item da lista: "+ listaDeProdutos.get(new Random().nextInt(3)));
        System.out.println(listaDeProdutos);

        var produtoPerecivel = new ProdutoPerecivel("Arroz", 32, 25, "06/05/2024");
        System.out.println(produtoPerecivel);
    }
}