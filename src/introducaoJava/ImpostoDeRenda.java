package aula_deve_dojo;
import java.util.Scanner;
public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double salario, faixa1= 9.70/100, faixa2= 37.35/100, faixa3= 49.5/100;
        double impostoPago = 0;
        System.out.println("inform your salary");
        salario= ler.nextDouble();

        if( salario >= 0 && salario <= 34712){
            impostoPago =  salario * faixa1;
        }else if (salario >= 34713 && salario <= 68507){
            impostoPago= salario * faixa2;
        }else if (salario > 68508){
            impostoPago= salario * faixa3;
        }else{
            System.out.println("salario enexistente");
        }
        System.out.println("imposto a pagar: "+ impostoPago);
    }
}
