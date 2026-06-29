import java.util.ArrayList;
import java.util.List;

public class ExArrayList {
    public static void main(String[] args) {
        System.out.println("=== MINHA LISTA DE COMPRAS ===");

        // Cria uma lista vazia modular (Começa com tamanho ZERO)
        List<String> compras = new ArrayList<>();

        //.add() - adiciona itens
        compras.add("Arroz");
        compras.add("Feijao");
        compras.add("Cafe");
        compras.add("Leite");

        // .size() - Mostra o tamanho da lista
        System.out.println("Quantidade de itens: " + compras.size());
        System.out.println();

        // .remove - Remove itens
        compras.remove("Cafe");

        // .contains - Verifica se ha um item na lista. Tendo é true, não tendo é false.
        boolean contemitem = compras.contains("Arroz");
        System.out.println(contemitem);
        // Usado sem variavel
        if (compras.contains("Leite")) {
            System.out.println("O Leite está na lista!");
            System.out.println();
        }

        // .indexOf - volta a posição de um item da lista
        int posicao = compras.indexOf("Arroz");
        // .set - subistitue um item da lista
        compras.set(posicao, "Arroz Integral");
        // Sem Variavel
        compras.set(2,"Leite Integral");

        // Repare no ":", isso é For-Earch, ele Percorre a lista item por item
        System.out.println("--- Itens no Carrinho ---");
        for (String item : compras) {
            System.out.println("Item: " + item);
        }

        // .get() - Pega um item da lista
        System.out.println();
        // uso sem variavel
        System.out.println("Primeiro item : " + compras.get(0));
        // uso com variavel
        int ultimoIndice = compras.size() - 1;
        String ultimoItem = compras.get(ultimoIndice);
        System.out.println("Ultimo item   : " + ultimoItem);
        System.out.println();

        // .clear() -  limpa à lista.
        compras.clear();
        // .isEmpty() - verifica se a lista esta vazia.
        if (compras.isEmpty()) {
            System.out.println("Sua lista está vazia!");
        }
    }
}