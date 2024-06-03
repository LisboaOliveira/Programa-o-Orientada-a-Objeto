/* Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito
é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos:
6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */
public class NumeroPerfeito{
    public static boolean acharperfeito(int n){
        int soma = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                soma += i;
            }
        }
        return soma == n;
    }
    public static void main(String[] args){
        int n = 1, controle = 0;

        System.out.printf("Os 4 primeiros numeros perfeito são:\n");
        //lemprar de perguntar porquer n encontra mais de 4...
        while(controle < 4){
            if(acharperfeito(n)){
                System.out.printf("%d ", n);
                controle++;
            }
            n++;
        }

    }
}
