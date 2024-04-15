package Produto;

import java.util.Scanner;

public class Produto {



    private String nomeProd;
    private double preco;
    private int qtdInicialEstoque;

    public Produto(String nomeProd, double preco, int qtdInicialEstoque) {
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

    public int getqtdInicialEstoque() {
        return qtdInicialEstoque;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;

    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQtdInicialEstoque(int qtdInicialEstoque) {
        this.qtdInicialEstoque = qtdInicialEstoque;
    }

    public void exibeInfo(){
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
            System.out.println(quantidade + " unidades removidas do estoque do produto " );
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente. Nenhuma alteração feita no estoque.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String nomeProd = scanner.nextLine();


        System.out.println("Digite o preço do produto: R$");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto: ");
        int qtdInicialEstoque = scanner.nextInt();

        Produto produto = new Produto(nomeProd, preco, qtdInicialEstoque);

        System.out.println("-------- Infor  mações do produto --------");

        System.out.println("Nome do produto: " + produto.getNomeProd());
        System.out.println("Preço do porduto: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque inicial do produto: " + produto.getqtdInicialEstoque());

        System.out.println("");

        System.out.println("Digite quantos produtods você deseja adicionar no estoque: ");
        int qtdAdicionada = scanner.nextInt();
        produto.adicionarEstoque(qtdAdicionada);
        System.out.println("Quantidade de estoque após adicionar: " + produto.getqtdInicialEstoque());

        System.out.println("Digite a quantidade de estoque que foi removida: ");
        int qtdRemovida = scanner.nextInt();
        produto.removerEstoque(qtdRemovida);
        System.out.println("Quantidade de estoque apos a remoção: " + produto.getqtdInicialEstoque());

    }
}
