import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado;
		dado = new Scanner(System.in);
		int numfinal = 0;
		double aux = 0;
		double resultado = 0;

		for(int i = 0; i < 6; i++){
		    double num = dado.nextDouble();
		    if(num > 0){
		        numfinal = numfinal + 1;
		        aux = aux + num;
		        resultado = aux / numfinal; 
		    }
		}
		System.out.println(numfinal + " valores positivos");
		System.out.printf("%.1f\n",resultado);
		dado.close();
	}
}