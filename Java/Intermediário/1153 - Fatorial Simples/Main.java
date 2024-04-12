import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner dado = new Scanner(System.in);
	int x = dado.nextInt();
	int fatorial = 1;
	while(x>0){
	    fatorial = fatorial*x;
	    x--;
	}
	System.out.println(fatorial);
	dado.close();
	}
}