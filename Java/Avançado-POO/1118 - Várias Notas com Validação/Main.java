import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ValidaNota v = new ValidaNota();
		Scanner dado = new Scanner(System.in);
		int x = 0;
		
		do {
			
			do {
				
				try {
					v.validarNota(dado.nextDouble());
					
				}catch(IllegalArgumentException e){
					System.out.println("nota invalida");
				}
				
			}while(v.getNotasValidas() < 2);
				
				v.Media();
				System.out.println(String.format("media = %.2f", v.getMedia()));
				v.limpa();
			
				do {
					System.out.println("novo calculo (1-sim 2-nao)");
					
					if(x == 2) { 
						break;
					}
					
					x = dado.nextInt();
					
				}while(x != 1 && x != 2);
			
		} while(x == 1);
		dado.close();
	}
}

class ValidaNota {
	
	private int NotasValidas = 0;
	private double media = 0;
	List<Double> Notas = new ArrayList<>();
	
//getters
	public int getNotasValidas() {
		return NotasValidas;
	}
	
	public double getMedia() {
		return media;
	}
	
//metodos
	public void validarNota(double x) throws IllegalArgumentException{
		
		if(x < 0 || x > 10) {
			throw new IllegalArgumentException();
			
		} else {
			Notas.add(x);
			NotasValidas++;
		}
	}
	
	public double Media() {
		media = (Notas.get(0) + Notas.get(1)) / 2;
		return media;
	}
	
	public void limpa() {
		Notas.clear();
		media = 0;
		NotasValidas = 0;
	}
	
}