import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        double x1, x2, y1, y2, dist;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o valor de x1\n");
        x1 = entrada.nextDouble();
        System.out.printf("Informe o valor de y1\n");
        y1 = entrada.nextDouble();
        System.out.printf("Informe o valor de x2\n");
        x2 = entrada.nextDouble();
        System.out.printf("Informe o valor de y2\n");
        y2 = entrada.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0));
        //Math.sqrt(dist);
        System.out.printf("A distancia entre (%g, %g) e (%g, %g) é %.2g\n", x1, y1, x2, y2, dist);

        entrada.close();
    }
}
