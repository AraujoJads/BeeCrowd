import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner dado = new Scanner(System.in);
        Nota nota = new Nota();
        double media;
        double soma = 0;

        for (int i = 0;i < 2;i++) {

            try {
                double notas = dado.nextDouble();
                nota.validacaoNotas(notas);
                soma = soma + notas;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;

            }
        }
        media = soma / 2;
        System.out.printf("media = %.2f\n",media);
        dado.close();

    }
}
class Nota {
    public void validacaoNotas(double notas) throws Exception {
        if (notas < 0.0 || notas > 10.0) {
            throw new Exception("nota invalida");
        }

    }
    
}