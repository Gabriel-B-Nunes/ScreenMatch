import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme");
            avaliacao += leitura.nextDouble();
        }

        mediaAvaliacao = avaliacao / 3;
        System.out.println(mediaAvaliacao);

        leitura.close();
    }
}
