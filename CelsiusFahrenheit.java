/*Escreva um programa que receba uma temperatura em graus centígrados(celsius) e a apresente
em graus Fahrenheit.*/
import java.util.Scanner;

public class CelsiusFahrenheit{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Informe a temperatura em C°:\n");
        double celsius = leitor.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2fC° equivalem a %.2fF°\n", celsius, fahrenheit);
        leitor.close();
    }
}