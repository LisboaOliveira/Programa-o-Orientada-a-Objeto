/*Escreva um programa que lê três números e determina qual número é o menor.*/
import java.util.Scanner;

public class MenorDeTres{
    public static void menor(double n1, double n2, double n3){
        double menor = n1;
        if(n2 < menor){
            menor = n2;
        }
        if(n3 < menor){
            menor = n3;
        }
        System.out.printf("O menor valor informado foi %.2f\n", menor);
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3;

        System.out.printf("Digite os valores a serem verificados:\n");
        n1 = leitor.nextDouble();
        n2 = leitor.nextDouble();
        n3 = leitor.nextDouble();

        menor(n1, n2, n3);

        leitor.close();
    }
}