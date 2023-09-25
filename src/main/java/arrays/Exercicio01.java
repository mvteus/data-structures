package arrays;

public class Exercicio01 {

    /* Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
    seja, B[i] = A[i] */
    public static void main(String[] args) {

        int[] A = {0, 1, 2, 3, 4};
        int[] B = new int[5];

        for (int x = 0; x < A.length; x++) {
            B[x] = A[x];
            System.out.println("Valores do vetor A: " + A[x]);
        }

        for (int x = 0; x < 50; x++) {
            System.out.print("_");
        }

        System.out.println("\n");

        for (int x = 0; x < B.length; x++) {
            System.out.println("Valores do vetor B: " + B[x]);
        }
    }
}
