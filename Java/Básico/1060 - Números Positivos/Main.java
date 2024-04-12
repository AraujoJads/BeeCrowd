import java.util.Scanner;
public class Main {

	public static void main(String[] args ) {
		Scanner dado;
		dado = new Scanner(System.in);
		int positivo = 0;
		for(int i = 0; i < 6; i++) {
			double n = dado.nextDouble();
			if(n > 0) {
				positivo = positivo + 1;
			}
		}
		System.out.println(positivo + " valores positivos");
		dado.close();
	}

}