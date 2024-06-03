/* Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna base^expoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.*/
import java.util.Scanner;

public class PotenciaRecursiva{
    public static int potencia(int base, int expoente){
        if(expoente == 1){
            return base;
        }
        return base * potencia(base, expoente - 1);
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int base, expoente, i;

        System.out.printf("Digite a basa e o expoente:\n");
        base = leitor.nextInt();
        expoente = leitor.nextInt();
        i = potencia(base, expoente);
        System.out.printf("%d elevado a %d é %d\n", base, expoente, i);
        leitor.close();
    }
}
