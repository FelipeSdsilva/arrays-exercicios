package matrixExercises;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
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
                if (i == j) {
                    diagoPrin[i] = matrix[i][j];
                } else if (i + j == 2) {
                    diagoSec[i] = matrix[i][j];
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
        double sum1 = 0;
        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite as notas do " + (i + 1) + " aluno refente a avaliação " + (j + 1) + "? ");
                notas[i][j] = sc.nextDouble();
                sum1 += notas[i][j];
            }
            medias[i] = sum1 / 4;
            sum1 = 0;

        }

        System.out.println("Media dos alunos: ");
        for (double i : medias) {
            System.out.print(String.format(" %.1f", i) + " ");
        }


    }
}
