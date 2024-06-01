/*Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.*/
import java.util.Scanner;

public class PosicaoDoisPontos{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float x, y;

        System.out.printf("Informe o valores de X e Y:\n");
        x = leitor.nextFloat();
        y = leitor.nextFloat();

        if(x == y){
            System.out.printf("X e Y então no mesmo ponto!\n");
        }else if(x == 0 && y > 0){
            System.out.printf(" Y esta cima de X\n");
        }else if(x ==0 && y < 0){
            System.out.printf("Y esta abaixo de X\n");
        }else if(y == 0 && x > 0){
            System.out.printf("Y esta a esquerda de X\n");
        }else if(y == 0 && x < 0){
            System.out.printf("Y esta a direita de X\n");
        }else if(x < 0){
            System.out.printf("Y esta a direita");
            if(y > 0){
                System.out.printf(" e cima de X\n");
            }else if(y < 0){
                System.out.printf(" e abaixo de X\n");
            }
        }else if(x > 0){
            System.out.printf("Y esta a esquerda");
            if(y > 0){
                System.out.printf(" e cima de X\n");
            }else if(y < 0){
                System.out.printf(" e abaixo de X\n");
            }
        }else{
            if(y > 0){
                System.out.printf(" Y esta a cima de X\n");
            }else if(y < 0){
                System.out.printf(" Y esta abaixo de X\n");
            }
        }

        leitor.close();
    }
}
