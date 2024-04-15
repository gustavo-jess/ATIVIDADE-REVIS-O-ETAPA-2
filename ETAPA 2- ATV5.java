package Produtoo;

import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int qtdInicialEstoque;


    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.qtdInicialEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qtdInicialEstoque = 0;
    }


    public Produto(String nome, double preco, int qtdInicialEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdInicialEstoque = qtdInicialEstoque;
    }

    public void exibirCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade inicial em estoque: " + qtdInicialEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro produto:");
        String nomeProduto1 = scanner.nextLine();

        Produto produto1 = new Produto(nomeProduto1);
        System.out.println("Características do primeiro produto:");
        produto1.exibirCaracteristicas();


        System.out.println("Digite o nome do segundo produto:");
        String nomeProduto2 = scanner.nextLine();
        System.out.println("Digite o preço do segundo produto:");
        double precoProduto2 = scanner.nextDouble();

        Produto produto2 = new Produto(nomeProduto2, precoProduto2);
        System.out.println("Características do segundo produto:");
        produto2.exibirCaracteristicas();


        System.out.println("Digite o nome do terceiro produto:");
        scanner.nextLine();
        String nomeProduto3 = scanner.nextLine();
        System.out.println("Digite o preço do terceiro produto:");
        double precoProduto3 = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque do terceiro produto:");
        int quantidadeProduto3 = scanner.nextInt();


        Produto produto3 = new Produto(nomeProduto3, precoProduto3, quantidadeProduto3);
        System.out.println("Características do terceiro produto:");
        produto3.exibirCaracteristicas();

    }
}
