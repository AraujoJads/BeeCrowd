import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado;
		dado = new Scanner(System.in);

		int maior = 0;
		int pos = 1;

		for(int i =1;i<=100;i++){
		    int N = dado.nextInt();
		    if(N>maior){
		        maior = N;
		        pos = i;
		    }
		}
		System.out.println(maior);
		System.out.println(pos);
		dado.close();
	}
}
