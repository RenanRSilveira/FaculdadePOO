package Faculdade_POO.Ex7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] nome = new String[2];
        String[] disciplina = new String[2];
        double[][] notas = new double[2][2];
        double[] medias = new double[2];
        double somaMedias = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Nome: ");
            nome[i] = scan.nextLine();

            System.out.print("Disciplina: ");
            disciplina[i] = scan.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.printf("Nota %d: ", j + 1);
                notas[i][j] = scan.nextDouble();
            }
            scan.nextLine();

            medias[i] = (notas[i][0] + notas[i][1]) / 2;

            somaMedias += medias[i];
        }

        System.out.println("\nRelatório dos alunos:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Disciplina: " + disciplina[i]);
            System.out.println("Notas: " + notas[i][0] + ", " + notas[i][1]);
            System.out.println("Média: " + medias[i]);
            System.out.println("------------------------------");
        }

        // Média geral da turma
        double mediaGeral = somaMedias / 2;
        System.out.println("Média geral da turma: " + mediaGeral);

        scan.close();

    }
}
