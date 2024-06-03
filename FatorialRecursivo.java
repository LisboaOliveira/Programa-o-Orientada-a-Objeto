/*Escreva uma função que calcule o fatorial de forma recursiva. Para cada chamada recursiva, exiba as saídas em uma linha
separada e adicione um nível de recuo (tabulação). Faça o melhor que você puder para tornar a saída limpa, interessante e 
significativa. Seu objetivo aqui é projetar e implementar um formato de saída que facilite o entendimento da recursão.*/
import java.util.Scanner;

public class FatorialRecursivo{
    public static int fatorial(int n){
        if(n == 1){
            return n;
        }
        return n * fatorial(n-1);
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n, f;

        System.out.printf("Digite o valor de n:\n");
        n = leitor.nextInt();

        for(int i = 0; i <= n; i ++){
            if(i == 0){
                System.out.printf("0! = 1\n");
            }else{
            f = fatorial(i);
            System.out.printf("%d! = %d\n", i, f);
            }
            for(int j = 0; j <= i; j++){
                System.out.printf("\t");
            }   
        }

        leitor.close();   
    }
    
}
