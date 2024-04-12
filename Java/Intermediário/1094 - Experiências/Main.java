import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int N = dado.nextInt(); 

		int resultado = 0;
		int resultado1 = 0;
		int resultado2 = 0;
		double porcentagem1;
		double porcentagem2;
		double porcentagem3;
		int geral = 0;
		for(int i = 0; i < N; i++){
		    int quantia = dado.nextInt();
		    String animal = dado.next();
		    if(quantia <= 15 && quantia >= 1){
		        if(animal.equals("C")){
		            resultado = resultado + quantia;
		        }
		        if(animal.equals("R")){
		            resultado1 = resultado1 + quantia;
		        }
		        if(animal.equals("S")){
		            resultado2 = resultado2 + quantia;
		        }
		        geral = geral + quantia;
		    }
		}
		System.out.println("Total: " + geral + " cobaias");
		System.out.println("Total de coelhos: " + resultado);
		System.out.println("Total de ratos: " + resultado1);
		System.out.println("Total de sapos: " + resultado2);
		porcentagem1 = 100.0 * resultado / geral;
		porcentagem2 = 100.0 * resultado1 / geral;
		porcentagem3 = 100.0 * resultado2 / geral;
		System.out.printf("Percentual de coelhos: %.2f %%\n", porcentagem1);
		System.out.printf("Percentual de ratos: %.2f %%\n", porcentagem2);
		System.out.printf("Percentual de sapos: %.2f %%\n", porcentagem3);
		dado.close();
	}
}
