package Produuto;

import java.util.Scanner;

public class Produuto {

    private String nomeProd;
    private double preco;
    private int qtdInicialEstoque;

    public Produuto(String nomeProd, double preco, int qtdInicialEstoque) {
        this.nomeProd = nomeProd;
        this.preco = preco;
        this.qtdInicialEstoque = qtdInicialEstoque;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdInicialEstoque() {
        return qtdInicialEstoque;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdInicialEstoque(int qtdInicialEstoque) {
        this.qtdInicialEstoque = qtdInicialEstoque;
    }

    public void exibeInfo() {
        System.out.println("Nome do Produto: " + nomeProd);
        System.out.println("Preço do Produto: " + preco);
        System.out.println("Estoque do Produto: " + qtdInicialEstoque);
    }

    public void adicionarEstoque(int quantidade) {
        qtdInicialEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque do produto ");
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdInicialEstoque) {
            qtdInicialEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque do produto ");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente. Nenhuma alteração feita no estoque.");
        }
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
            System.out.println("Preço atualizado para R$" + novoPreco);
        } else {
            System.out.println("Preço inválido. Nenhuma alteração feita.");
        }
    }

    public void atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.qtdInicialEstoque = novaQuantidade;
            System.out.println("Quantidade em estoque atualizada para " + novaQuantidade);
        } else {
            System.out.println("Quantidade inválida. Nenhuma alteração feita.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar?");
        int numProdutos = scanner.nextInt();

        Produuto[] produtos = new Produuto[numProdutos];

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nomeProd = scanner.next();

            System.out.println("Digite o preço do produto " + (i + 1) + ": R$");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade em estoque do produto " + (i + 1) + ": ");
            int qtdInicialEstoque = scanner.nextInt();

            produtos[i] = new Produuto(nomeProd, preco, qtdInicialEstoque);
        }

        for (int i = 0; i < numProdutos; i++) {
            System.out.println("-------- Informações do produto " + (i + 1) + " --------");
            produtos[i].exibeInfo();
            System.out.println();
        }

        System.out.println("Digite o número do produto que deseja atualizar: ");
        int numProdutoAtualizar = scanner.nextInt();

        if (numProdutoAtualizar > 0 && numProdutoAtualizar <= numProdutos) {
            Produuto produtoSelecionado = produtos[numProdutoAtualizar - 1];
            System.out.println("O que deseja atualizar para o produto " + numProdutoAtualizar + "?");
            System.out.println("1. Preço");
            System.out.println("2. Quantidade em estoque");
            int opcaoAtualizar = scanner.nextInt();

            switch (opcaoAtualizar) {
                case 1:
                    System.out.println("Digite o novo preço para o produto " + numProdutoAtualizar + ": R$");
                    double novoPreco = scanner.nextDouble();
                    produtoSelecionado.atualizarPreco(novoPreco);
                    break;
                case 2:
                    System.out.println("Digite a nova quantidade em estoque para o produto " + numProdutoAtualizar + ": ");
                    int novaQuantidade = scanner.nextInt();
                    produtoSelecionado.atualizarQuantidade(novaQuantidade);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Número de produto inválido.");

        }
        for (int i = 0; i < numProdutos; i++) {
            System.out.println("-------- Informações do produto " + (i + 1) + " --------");
            produtos[i].exibeInfo();
            System.out.println();
        }

    }

}
