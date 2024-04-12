import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        Fase n1 = new Fase();

        int P = dado.nextInt();    // tamanhho do pulo 
        int N = dado.nextInt();    // numero de canos
        int alturas[] = new int[N];

        for(int i = 0; i < N; i++) {
            alturas[i] = dado.nextInt();
        }

        n1.setPulo(P);
        n1.addAlturas(alturas);
        System.out.println(n1.verificaAlturas());
        dado.close();
    }
}

class Fase {

    private int pulo;

    List<Integer> lista = new ArrayList();

    public Fase() {

    }


    public void setPulo(int pulo) {
        this.pulo = pulo;
    }


    public void addAlturas(int[] alturas) {

        for (int i = 0; i < alturas.length; i++) {
            this.lista.add(alturas[i]);
        }
    }

    public String verificaAlturas() {

        for(int i = 1; i < this.lista.size(); i++) {

            if (Math.abs((this.lista.get(i) - (this.lista.get(i - 1)))) > this.pulo) {
                return "GAME OVER";
            }
        }
        return "YOU WIN";
    }
}
