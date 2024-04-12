import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado;
		dado = new Scanner(System.in);
		
		int positivo = 0;
		int negativo = 0;
		int par = 0;
		int impar = 0;

		for(int i = 1; i <= 5; i++){
		    int num = dado.nextInt();
		    if(num > 0){
		        positivo = positivo + 1;
		    }
		    if(num < 0){
		        negativo = negativo + 1;
		    }
		    if(num % 2 == 0 ){
		        par = par + 1;
		    }
		    if(num % 2 != 0){
		        impar = impar + 1;
		    }
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		dado.close();
	}
}
