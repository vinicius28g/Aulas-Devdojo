package aula_deve_dojo;
import java.util.Scanner;
public class SwitchExercicio {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int  diaSemana= 5;
        String dia;
        // forma bem resumida
    /*    dia= diaSemana>=2 && diaSemana<=6?"dia util":"dia não util";
        System.out.println(dia);*/
/*        boolean resultado;
        System.out.println("report a day of the week");
        diaSemana= ler.nextInt();
        switch (diaSemana){
            case 1:
                resultado= false;
                break;
            case 2:
                resultado = true;
                break;
            case 3:
                resultado = true;
                break;
            case 4:
                resultado = true;
                break;
            case 5:
                resultado = true;
                break;
            case 6:
                resultado = true;
                break;
            case 7:
                resultado = false;
                break;
            default:
                resultado= false;
                System.out.println("invalid day");
                break;
        }

        dia= resultado== true?"dia util":"dia não util";
        System.out.println(dia);
 */ /*                                          outra forma
        if(diaSemana>=2 && diaSemana<=7){
            System.out.println("dia util");
        } else if (diaSemana== 1 || diaSemana==6) {
            System.out.println("dia não util");
        }else{
            System.out.println("dia invalido");
       }
 */
        //outra forma

        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("dia não util");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("dia invalido");
        }
    }
}
