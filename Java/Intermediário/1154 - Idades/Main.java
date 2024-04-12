import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		float soma = 0;
		int quant = 0;
		float resultado;

		 while(true){
		     int idade = dado.nextInt();
		     if(idade<0){
		         break;
		     } else{
		         soma += idade;
		         quant += 1;
		     }
		 }
		resultado = soma / quant;
		 System.out.printf("%.2f\n",resultado);
		 dado.close();
	}
}