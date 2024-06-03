/*Escreva um programa que determine quais são todos os números de 2 algarismos cuja
soma dos cubos de seus algarismos sejam iguais ao próprio número.
• Exemplo: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27.*/
public class CuboAlgarismos{
    public static boolean acharsomadoscubos(int i){
        int centena = i / 100;
        int dezena = (i / 10) % 10;
        int unidade = i % 10;
        int conferi = (int) (Math.pow(centena, 3) +  Math.pow(dezena, 3) + Math.pow(unidade, 3));
        return  conferi == i;
    }

    public static void main(String[] args){
        for(int i = 100; i < 1000; i++){
            if(acharsomadoscubos(i)){
                System.out.printf("%d\n", i);
            }
        }
    }
}
