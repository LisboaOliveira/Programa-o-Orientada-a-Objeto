/*Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena
(somente com os números, respeitando o número de linhas e a distribuição dos números
nas linhas).*/
//cartão da mega = 3 matrizes 6x10
import java.util.Random;

public class CartaoDaMega{
    public static void main(String[] args){
    Random gerador = new Random();
        int [][]matriz = new int[6][10];
        int controle = 0;
     
        do{
            for(int i=0; i < 6; i++){
                for(int j =0; j < 10; j++){
                    matriz[i][j] = gerador.nextInt(60) + 1;
                    System.out.printf("[%2d] ", matriz[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
            controle++;
        }while(controle != 3); 
    }
}