/*Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A cidade A tem um crescimento 
populacional de 3,5% ao ano, enquanto a população da cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para
calcular a quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B. */
public class PopulaçãoAeB{
    
    public static void main(String[] args){
        double a = 7000, b = 20000;
        int anos = 0;

        while(a <= b){
            a += (3.5/100) * a;
            b += (1/100) * b;
            anos = anos + 1;
        }

        System.out.printf("\nA quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B é de %d anos.\n\n", anos);
    }
}

