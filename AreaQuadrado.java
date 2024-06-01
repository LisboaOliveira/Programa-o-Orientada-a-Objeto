import java.util.Scanner;

public class AreaQuadrado{

    public static double calcularArea(double lado){
        return lado * lado;
    }

    public static void main(String[] args){
        Scanner  leitor = new Scanner(System.in);
        double lado=0, area=0;

        System.out.printf("Informe o valor do lado do quadrado:\n");
        lado = leitor.nextDouble();

        area = calcularArea(lado);

        System.out.printf("A area do quadrado é: %.2g", area);
        
        leitor.close();
    }
}