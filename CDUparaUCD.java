/*Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
ser reescrito como 312.*/
import java.util.Scanner;

public class CDUparaUCD{
    public static void troca(int numero){
        int centena = numero/100;
        int dezena = (numero/10) % 10;
        int unidade = numero % 10;
        System.out.printf("%d%d%d\n", unidade, centena, dezena);
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um numero com 3 casas decimais:\n");
        numero = leitor.nextInt();
        if(numero > 100 || numero < 999){
            troca(numero);   
        }else{
            System.out.printf("Numero invalido!\n");
        }
        leitor.close();
    }
}