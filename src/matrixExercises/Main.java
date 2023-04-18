package matrixExercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        notasDeAlunos(sc);

        sc.close();
    }

    public static void matriz3Por3Diagonais(Scanner sc) {
        int[][] matrix = new int[3][3];
        int[] diagoPrin = new int[3], diagoSec = new int[3];
        int sumP = 0, sumS = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor na posição " + i + " na coluna " + j + ": ");
                matrix[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    diagoPrin[0] = matrix[i][j];
                } else if (i == 1 && j == 1) {
                    diagoPrin[1] = matrix[i][j];
                    diagoSec[1] = matrix[i][j];
                } else if (i == 2 && j == 2) {
                    diagoPrin[2] = matrix[i][j];     // 1  2  3
                } else if (i == 0 && j == 2) {       // 4  5  6
                    diagoSec[0] = matrix[i][j];      // 7  8  9
                } else if (i == 2 && j == 0) {
                    diagoSec[2] = matrix[i][j];
                }
            }
        }
        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < diagoPrin.length; i++) {
            sumP += diagoPrin[i];
            System.out.print(diagoPrin[i] + " ");
        }
        System.out.println();
        System.out.println("Elementos da diagonal secundaria: ");
        for (int i = 0; i < diagoSec.length; i++) {
            sumS += diagoSec[i];
            System.out.print(diagoSec[i] + " ");
        }

        System.out.println("\nSoma dos elementos da diagonal principal: " + sumP + "\nSoma dos elementos da diagonal secundaria: " + sumS);
    }

    public static void notasDeAlunos(Scanner sc) {

        double[][] notas = new double[10][4];
        double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0, sum10 = 0;
        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite as notas do " + (i + 1) + " aluno refente a avaliação " + (j + 1) + "? ");
                notas[i][j] = sc.nextDouble();
                if (i == 0 && j <= 3) {
                    sum1 += notas[i][j];
                    medias[0] = Math.round(sum1 / 4);
                } else if (i == 1 && j <= 3) {
                    sum2 += notas[i][j];
                    medias[1] = Math.round(sum2 / 4);
                } else if (i == 2 && j <= 3) {
                    sum3 += notas[i][j];
                    medias[2] = Math.round(sum3 / 4);
                } else if (i == 3 && j <= 3) {
                    sum4 += notas[i][j];
                    medias[3] = Math.round(sum4 / 4);
                } else if (i == 4 && j <= 3) {
                    sum5 += notas[i][j];
                    medias[4] = Math.round(sum5 / 4);
                } else if (i == 5 && j <= 3) {
                    sum6 += notas[i][j];
                    medias[5] = Math.round(sum6 / 4);
                } else if (i == 6 && j <= 3) {
                    sum7 += notas[i][j];
                    medias[6] = Math.round(sum7 / 4);
                } else if (i == 7 && j <= 3) {
                    sum8 += notas[i][j];
                    medias[7] = Math.round(sum8 / 4);
                } else if (i == 8 && j <= 3) {
                    sum9 += notas[i][j];
                    medias[8] = Math.round(sum9 / 4);
                } else if (i == 9 && j <= 3) {
                    sum10 += notas[i][j];
                    medias[9] = Math.round(sum10 / 4);
                }
            }
        }

        System.out.println("Media dos alunos: ");
        for (int i = 0; i < medias.length; i++) {
            System.out.print(medias[i] + " ");
        }

    }
}
