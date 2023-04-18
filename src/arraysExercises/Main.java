package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int sum = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor na posição " + i + " do vetor: ");
            vet[i] = sc.nextInt();
            sum += vet[i];
        }

        System.out.println("Elementos na posição impar:");
        for (int i = 0; i < vet.length; i++) {
            if (i % 2 == 1) {
                System.out.print(vet[i] + " ");
            }
        }

        System.out.println("\nElementos pares: ");
        for (int j = 0; j < vet.length; j++) {
            if (vet[j] % 2 == 0)
                System.out.print(vet[j] + " ");
        }

        System.out.println("\nSoma: " + sum);
        System.out.println("Média: " + String.format("%.2f", (double) sum / vet.length));
        sc.close();
    }

    public static void seTemOuNaoNoVetor(Scanner sc) {

        int[] vet = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int num, pos = 0;
        String result = "";
        System.out.print("Digite o número que você deseja encontrar: ");
        num = sc.nextInt();

        for (int i = 0; i < vet.length; i++) if (vet[i] == num) pos = i;
        result = (Arrays.stream(vet).anyMatch(x -> x == num)) ? "O número " + num + " está localizado na posição: " + pos : "O número " + num + " não foi encontrado!";

        System.out.println(result);
    }
}