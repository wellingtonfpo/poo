import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de produtos que serão cadastrados? ");
        int totalProdutos = sc.nextInt();

        Produto[] produtos = new Produto[totalProdutos];

        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome do Produto %d: ", i + 1);
            String nome = sc.nextLine();

            System.out.printf("Digite o preço do Produto %d: ", i + 1);
            double preco = sc.nextDouble();

            System.out.printf("Digite a quantidade do Produto %d: ", i + 1);
            int quantidade = sc.nextInt();

            produtos[i] = new Produto(nome, preco, quantidade);
        }

        System.out.println("**Relatório de Produto Cadastrados**");
        System.out.println();
        System.out.println("*-----------------------------------------------------*");

        for (Produto p : produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("*-----------------------------------------------------*");
        }

        sc.close();
    }
}
