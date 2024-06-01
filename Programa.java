import java.util.Scanner;

public class Programa{
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Qual o seu nome?\n");
        nome = leitor.nextLine();
        System.out.printf("Seja bem vindo %s\n", nome);

        leitor.close();
    }
}