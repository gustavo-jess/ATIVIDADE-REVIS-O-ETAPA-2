package carro;


public class carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;


    public carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {

        carro carro1 = new carro("Volkswagen ", "Golf GTI", 2024, "Black Piano");
        carro carro2 = new carro("Chevrolet", "Opala Diplomata", 1992, "Preto");


        System.out.println("Informações do carro 1: ");
        carro1.exibirInfo();

        System.out.println("Informações do crro 2: ");
        carro2.exibirInfo();


        carro1.setModelo("Camaro");
        carro1.setAno(2019);
        carro1.setCor("Amarelo");


        System.out.println("Informações atualizadas do carro 1: ");
        carro1.exibirInfo();


        carro2.setModelo("Jetta");
        carro2.setAno(2023);
        carro2.setCor("Preto");

        System.out.println("Informações atualizadas do carro 2: ");
        carro2.exibirInfo();
    }
}
