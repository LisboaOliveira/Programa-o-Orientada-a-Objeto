/*/*Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma
que n > 0.*/ 
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n, primeiro = 0, segundo = 1, novo;
        int merda = 1;//variavel para fazer a quebra de linha no for incluindo o 0 na primeira linha
        System.out.printf("Digite a quantidade de termos desejada:\n");
        n = leitor.nextInt();

        if(n > 0){
            System.out.printf("A série de Fibonacci ate o %dº termo é:\n", n);    
            for(int i = 0; i < n; i++){
                System.out.printf("%10d ", primeiro);//formatação q exibe ate 47º termo
                novo = primeiro + segundo;
                primeiro = segundo;
                segundo = novo;
                if(merda % 10 == 0){
                    System.out.printf("\n");
                }
                merda++;
            }
        }else{
            System.out.printf("Valor invalido!!!");
        }

        leitor.close();
    }
}
