package aula_deve_dojo;
/**  comentario de <b> javadoc </b> <br>
 *   o byte so armazena <b> -128> x <127 </b> <br>
 *   short so armzena <b>interiro de 2 bytes</b>*/
public class OlaDevDojo {

    public static void main(String[] args){
        char caracter= '@';
        long longo= 1234554321;
        double decimalGrande= 156322345677654444433.345456776543234567865432345;
        int a= (int) 2.4F; // estou obrigando a variavel a recerber um valor float
        byte bim = 127;
        System.out.println("o seu ki é: "+ caracter);
        System.out.println("o seu ki é: "+ longo);
        System.out.println("o seu ki é: "+ decimalGrande);
        System.out.println("o seu ki é: "+ a);
    }
}
