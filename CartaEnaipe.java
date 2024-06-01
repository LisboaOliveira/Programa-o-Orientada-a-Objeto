/* Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso.*/
import java.util.Scanner;

public class CartaEnaipe{
    public static String descobriCarta(int numeroDaCarta){
        switch(numeroDaCarta){
            case 1:
                return "As";
            case 11:
                return "Valete";
            case 12:
                return "Rainha";
            case 13:
                return "Rei";
            default:
                return String.valueOf(numeroDaCarta);
        }
    }
    public static String descobriNaipe(int numeroDoNaipe){
        switch(numeroDoNaipe){
            case 1:
                return "ouros";
            case 2:
                return "paus";
            case 3:
                return "copas";
            case 4:
                return "espadas";
            default:
                return "naipe invalido!";//esse return é só para pode compilar pois a verificação é feita na chamada da função
        }
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numeroDaCarta, numeroDoNaipe;
        String carta = "", naipe = "";
          
        do{
            System.out.printf("Informe o numero da carta (1 a 13):\n");
            numeroDaCarta = leitor.nextInt();

            if(numeroDaCarta >= 1 && numeroDaCarta <= 13){
                carta = descobriCarta(numeroDaCarta);
            }else{
                System.out.printf("valor invalido!\n");
            }
        }while(numeroDaCarta < 1 || numeroDaCarta > 13);

        do{
        System.out.printf("Informe o numero para o naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas):\n");
            numeroDoNaipe = leitor.nextInt();

            if(numeroDoNaipe >= 1 && numeroDoNaipe <= 4){
                naipe = descobriNaipe(numeroDoNaipe);
            }else{
                System.out.printf("valor invalido!\n");
            }
        }while(numeroDoNaipe < 1 || numeroDoNaipe > 4);

        System.out.printf("A carta é um %s de %s\n", carta, naipe);
        leitor.close();
    }
}