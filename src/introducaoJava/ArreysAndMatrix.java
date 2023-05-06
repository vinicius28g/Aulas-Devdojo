package aula_deve_dojo;

import java.util.Scanner;

public class ArreysAndMatrix {
    public static void main(String[] args) {
        int[] idade = new int[3];
        Scanner ler = new Scanner(System.in);
        // int [] idade = {1,2,3,4,5};

        for (int i = 0; i < idade.length; i++) {
            idade[i] = ler.nextInt();
        }
        for (int i : idade) {// forma reduzida do for
            System.out.println("vetor antes de ser realocdo: " + i);
        }
//        idade= new int[4];
//        for (int i = 0; i < idade.length; i++) {
//            System.out.println("vetor depois de realocar: "+idade[i]);
//        }
        // preenchenddo uma matriz
        System.out.println("chegou aqui 1");
        int[][] matrix = new int[3][2];
        matrix[0][0] = 0;
        matrix[0][1] = 20;
        matrix[1][0] = 30;
        matrix[1][1] = 40;
        matrix[2][0] = 50;
        for (int i = 0; i < matrix.length; i++) { // para preencher com scanner tem ser dessa forma
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ler.nextInt();
            }
        }
        System.out.println("chegou aqu2");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        // outras formas de preencher um array
        int[][] intMatriz = new int[3][];
        int[] linha2 = {1, 2, 3};
        intMatriz[0] = new int[]{1, 2};
        intMatriz[1] = linha2;
        intMatriz[2] = new int[6];

        int[][] matriz2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        for (int[] i : intMatriz) {
            System.out.println("\n--------------");
            for (int j : i) {
                System.out.print("\t" + j + " |");
            }

        }

    }
}
