import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
 
		Scanner dado;
		dado = new Scanner(System.in);
		int numfinal = 0;

		for(int i = 0; i <= 4; i++){
		    int num = dado.nextInt();
		    if(num % 2 == 0){
		        numfinal = numfinal + 1;
		    }
		}
		System.out.println(numfinal + " valores pares");
		dado.close();
    }
}