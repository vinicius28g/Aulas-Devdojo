package aula_deve_dojo;

public class ExercicoLacosRepeticoes {
    public static void main(String[] args) {
       final int TAM_VET = 10;
        int vetor[]=new int[TAM_VET];
        int numbersalve = 0;

        for (int i = 0; i< vetor.length; i++){
            vetor[i]= i;
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]==8) {
                numbersalve= vetor[i];
                break;
            }
        }
        System.out.println("numero achado: "+ numbersalve);
        for (int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
