import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int lim = entrada.nextInt();

        for(int i = 0; i < lim; i++) {
            Competidor c = new Competidor();
            c.setNome(entrada.next());
            c.setDificuldade(entrada.nextDouble());
            for(int j = 0; j < 7; j++) {
                c.adicionarNota(entrada.nextDouble());
            }

            System.out.print(c.getNome() + " ");
            System.out.printf("%.2f\n",Competição.notaSalto(c));
        }
        entrada.close();
    }

}

class Competidor {

    public String nome;
    public Double dificuldade;
    ArrayList<Double> notas = new ArrayList<>();

    public void adicionarNota(Double n) {
        notas.add(n);
        Collections.sort(notas);
    }
    public void setDificuldade(Double n) {
        dificuldade = n;
    }
    public Double getDificuldade(){
        return dificuldade;
    }
    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }
}

 class Competição {

    public static Double notaSalto(Competidor c) {
        Double nota = 0.0;
        for(int i = 1; i < c.notas.size() - 1; i++) {
            nota += c.notas.get(i);
        }
        return nota* c.getDificuldade();
    }

}