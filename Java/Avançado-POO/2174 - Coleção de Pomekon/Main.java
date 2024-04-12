import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Treinador g = new Treinador();

        int l = entrada.nextInt();

        for(int i = 0; i < l ; i++) {
            String j = entrada.next();
            g.adicionarPokemon(j);
        }
        System.out.println("Falta(m) " + g.quantosFaltam() + " pomekon(s).");
        entrada.close();
    }

}

class Treinador {

    ArrayList<String> pokemons = new ArrayList<String>();
    public int pokemonCompleto = 0;

    public void adicionarPokemon(String pokemon) {
        if(!(pokemons.contains(pokemon))) {
            pokemonCompleto++;
        }
        pokemons.add(pokemon);
    }

    public int quantosFaltam() {
        return (151 - pokemonCompleto);
    }


}