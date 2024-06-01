/*Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos.
Divulgue também seno, cosseno, tangente, cossecante, secante e
cotangente do ângulo.*/
import java.util.Scanner;

public class AnguloEmRadianos{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double graus = 0, radianos = 0, seno = 0, cosseno = 0, tangente = 0, cossecante = 0, secante = 0, cotangente = 0;

        System.out.printf("Informe o angulo em graus:\n");
        graus = entrada.nextDouble();
        radianos = Math.toRadians(graus);
        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        if(seno != 0){
            cossecante = 1/seno;
        }else{
            cossecante = Double.NaN;
        }
        if(cosseno != 0){
            secante = 1/cosseno;
        }else{
            secante = Double.NaN;
        }
        if(tangente != 0){
            cotangente = 1/ tangente;
        }else{
            cotangente = Double.NaN;
        }
        

        System.out.printf(
        "Ângulo em radianos: %.2g\n"+
        "Seno: %.2g\n"+
        "Cosseno: %.2g\n"+
        "Tangente: %.2g\n"+
        "Cossecante: %.2g\n"+
        "Secante: %.2g\n"+
        "Cotangente: %.2g\n"
        , radianos, seno, cosseno, tangente, cossecante, secante, cotangente);

        entrada.close();
    }
}