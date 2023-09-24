public class Arrays {
    public static void main(String[] args) {
        double[] temperatura = new double[365];
        temperatura[0] = 31;
        temperatura[1] = 32.4;
        temperatura[2] = 31.5;
        temperatura[3] = 29.1;
        temperatura[4] = 25.9;

        System.out.println("O valor da temperatura do dia 3 é: " + temperatura[2]);

        /* Tamanho do vector com o propriedade .length */
        System.out.println("O tamanho do vector é: " + temperatura.length);

        System.out.println("Ponteiro do vector na memória é: " + temperatura);

        /* Percorrendo o vector com o for */
        for (int x = 0; x < temperatura.length; x++) {
            System.out.println("O valor da temperatura do dia " + (x + 1) + " é: " + temperatura[x]);
        }

        /* Percorrendo com o for each  introduzido na versão Java 5 */
        for (double var : temperatura
        ) {
            System.out.println("O valor da temperatura é: " + var);
        }
    }
}