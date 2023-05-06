package aula_deve_dojo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ExercicioBreak {
    public static void main(String[] args) {
        double carValue = 30000;
        double lowerInstallmentValue = 1000; //menor valor da parcela
        double installmentValue = 0;  // valor da parcela
        //continui(carValue, lowerInstallmentValue);
        DecimalFormat df = new DecimalFormat("#.##"); // define o modelo do numero
        df.setRoundingMode(RoundingMode.UP); // diz que quer arrendondar pro maior mais proximo;

        for (int parcela = 1; parcela < carValue; parcela++) {
            installmentValue = carValue / parcela;
            if (installmentValue < lowerInstallmentValue) {
                break;
            }
            System.out.println(parcela + " parcela de " + df.format(installmentValue));
        }
    }
/** o <b>continue</b> faz o cursor voltar para o for <br>
 * nesse caso enquanto a parcela for menor que mil <br>
 * ele n vai imprimir o valor da parcela**/
    public static void continui(double valorCarro, double menorparcela) {

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorparcela = valorCarro / parcela;
            if (valorparcela < menorparcela) {
                continue;
            }
            System.out.println(parcela + " parcela de " + valorparcela);
        }

    }
}
