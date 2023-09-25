package arrays;

public class Exercicio02 {

    /* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
    mesmo tipo e tamanho e com os elementos do vetor A multiplicados
    por 2, ou seja: B[i] = A[i] * 2 */
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] B = new int[8];

        System.out.print("Vetor A: ");
        for (int x = 0; x < A.length; x++) {
            System.out.print(A[x] + ", ");
        }

        System.out.println("");
        System.out.print("Vetor B: ");
        for (int x = 0; x < A.length; x++) {
            B[x] = A[x] * 2;
            System.out.print(B[x] + ", ");
        }
    }
}