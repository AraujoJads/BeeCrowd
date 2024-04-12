import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        while (br.ready()) {

            String[] linha = br.readLine().split(" ");
            int N = Integer.parseInt(linha[0]);
            int Q = Integer.parseInt(linha[1]);
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                notas.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(notas, new Comparador());
            for (int i = 0; i < Q; i++) {
                int consulta = notas.get(Integer.parseInt(br.readLine())-1);
                System.out.println(consulta);
            }
        }
    }

static class Comparador implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

}