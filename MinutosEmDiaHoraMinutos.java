/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.*/ 
import java.util.Scanner;

public class MinutosEmDiaHoraMinutos{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int valor, dia, hora, minuto;

        System.out.printf("Digite o total de minutos:\n");
        valor = leitor.nextInt();
        
        dia = valor/(24*60);
        hora = (valor%(24*60)) / 60;
        minuto = valor % 60;
        
        System.out.printf("%d minutos = %d dias, %d horas e %d minutos\n", valor, dia, hora, minuto);

        leitor.close();
    }
}