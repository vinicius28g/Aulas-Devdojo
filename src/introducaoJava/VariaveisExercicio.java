package aula_deve_dojo;
import java.util.Scanner;
import java.io.IOException;

public class VariaveisExercicio {
    public static void main(String[] args) throws IOException, InterruptedException{
        String name, street, district;
        int number;
        double wage;
        Scanner scanner = new Scanner(System.in);

        System.out.println("declaração de recibo de salario");
        System.out.print("informe seu nome: ");
        name= scanner. next();
        System.out.print("informe sua rua ");
        street= scanner. next();
        System.out.print("informe seu bairro: ");
        district= scanner. next();
        System.out.print("informe o numero da casa: ");
        number= scanner.nextInt();
        System.out.print("informe o seu salario: ");
        wage= scanner.nextDouble();

        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");


        System.out.println("Eu "+ name+ " morador da rua "+street+", bairro "+ district+
                ", e numero: "+ number+" confirmo que recebi o salario de "+ wage);



    }
}
