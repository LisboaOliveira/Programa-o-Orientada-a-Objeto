/*O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira*/
import java.util.Scanner;

public class DiaDeFevereiro{
    public static void main(String[] asgr){
        Scanner leitor = new Scanner(System.in);
        int dia, diaDsemana;

        System.out.printf("Digite o dia do mês de fevereiro de 2015 (um valor entre 1 e 28):\n");
        dia = leitor.nextInt();

        if (dia >= 1 && dia <= 28){
            diaDsemana = dia % 7;
            switch(diaDsemana){
                case 1:
                    System.out.printf("O dia %d será uma domingo\n", dia);
                    break;
                case 2:
                    System.out.printf("O dia %d será uma segunda-feira\n", dia);
                    break;
                case 3:
                    System.out.printf("O dia %d será uma terça-feira\n", dia);
                    break;
                case 4:
                    System.out.printf("O dia %d será uma quarta-feira\n", dia);
                    break;
                case 5:
                    System.out.printf("O dia %d será uma quinta-feira\n", dia);
                    break;
                case 6:
                    System.out.printf("O dia %d será uma sexta-feira\n", dia);
                    break;
                case 0:
                    System.out.printf("O dia %d será um sábado\n", dia);
                    break;            
            }

        }else{
            System.out.printf("Valor invalido!!!\n");
        }
        leitor.close();
    }

}