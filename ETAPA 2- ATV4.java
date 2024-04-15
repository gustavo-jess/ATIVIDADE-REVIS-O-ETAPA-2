package Circulo;

import java.util.Scanner;


public class Circulo{
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public void exibirCaracteristicas() {
        System.out.println("O Círculo tem um raio de " + raio + " e cor " + cor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a cor do círculo:");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);
        circulo.exibirCaracteristicas();

        scanner.close();
    }
}
