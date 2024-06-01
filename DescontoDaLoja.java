/*Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores:
• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.
• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40% de desconto, 
peças que custam entre R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/
import java.util.Scanner;

public class DescontoDaLoja{
    public static void desconto111(double valor){
            if(valor > 100){
                System.out.printf("O valor com desconto fica %.2f\n", valor - (valor*40)/100);
            }else if(valor < 100 && valor > 50){
                System.out.printf("O valor com desconto fica %.2f\n", valor - (valor*20)/100);
            }else if(valor < 50){
                System.out.printf("O valor com desconto fica %.2f\n", valor - (valor*10)/100);
            }else{
                System.out.printf("Protudo n possui desconto...\n");
            }
    }
    public static void desconto222(double valor){
        if(valor > 500){
            System.out.printf("O valor com desconto fica %.2f\n", valor - (valor*10)/100);
        }else{
            System.out.printf("Protudo n possui desconto...\n");
        }

    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int codigo;
        double valor;

        do{
        System.out.printf("informe o codigo:\n");
        codigo = leitor.nextInt();

            switch(codigo){
                case 111:
                    System.out.printf("Digite o valor:\n");
                    valor = leitor.nextDouble();
                    desconto111 (valor);
                    break;
                case 222:
                    System.out.printf("Digite o valor:\n");
                    valor = leitor.nextDouble();
                    desconto222 (valor);
                    break;
                default:
                    System.out.printf("codigo invalido!!!\n");
                    break;
            }
        }while(codigo != 111 && codigo != 222);

        leitor.close();
    }
}
