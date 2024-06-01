import java.util.Scanner;

public class MediaDeTres {
    public static float calcularMedia (float nota1, float nota2, float nota3){
    return (nota1+nota2+nota3)/3;
    }

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        float nota1=0, nota2=0, nota3=0, media=0;

        System.out.printf("Informe a nota 1:\n");
        nota1 = leitor.nextFloat();
        System.out.printf("Informe a nota 2:\n");
        nota2 = leitor.nextFloat();
        System.out.printf("Informe a nota 3:\n");
        nota3 = leitor.nextFloat();

        media = calcularMedia(nota1, nota2, nota3);
        System.out.printf("A media é %.2f\n", media);

        leitor.close();
    }
}
