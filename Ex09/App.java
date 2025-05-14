package Faculdade_POO.Ex9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[3];

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Digite um número: ");
            numeros[x] = scanner.nextDouble();
        }

        while (true) {
            System.out.println("Digite 0 para encerrar o programa");
            System.out.println("Digite 1 para ver os números");
            System.out.println("Digite 2 para ver os números na ordem inversa");
            System.out.println("Digite 3 para ver a soma dos números");
            System.out.println("Digite 4 para ver o dobro dos números");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                for (int x = 0; x < numeros.length; x++) {
                    System.out.printf("%.2f ", numeros[x]);
                }
                System.out.println();
            } else if (opcao == 2) {
                for (int x = 2; x >= 0; x--) {
                    System.out.printf("%.2f ", numeros[x]);
                }
                System.out.println();
            } else if (opcao == 3) {
                double soma = 0;
                for (int x = 0; x < numeros.length; x++) {
                    soma += numeros[x];
                }
                System.out.println(soma);
            } else if (opcao == 4) {
                for (int x = 0; x < numeros.length; x++) {
                    System.out.printf("%.2f ", numeros[x] * 2);
                }
                System.out.println();
            } else {
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
