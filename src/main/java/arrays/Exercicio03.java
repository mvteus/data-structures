package arrays;

public class Exercicio03 {

    /* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
    ser o quadrado do respectivo elemento de A, ou seja:
    B[i] = A[i] * A[I] */

    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] B = new int[15];

        System.out.print("Vetor A: ");
        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x] + ", ");
        }

        System.out.println("");
        System.out.print("Vetor B: ");
        for (int x = 0; x < A.length; x++) {
            B[x] = A[x] * A[x];
            System.out.print(B[x] + ", ");
        }
    }
}
