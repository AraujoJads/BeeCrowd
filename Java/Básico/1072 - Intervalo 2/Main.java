import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado;
		dado = new Scanner(System.in);
		int N = dado.nextInt();
		var numin = 0;
		var numout = 0;

		for(int i = 1; i <= N; i++){
		    int num = dado.nextInt();
		    if(num >= 10 && num <= 20){
		        numin = numin + 1;
		    }
		    else{
		        numout = numout + 1;
		    }
		}
		System.out.println(numin + " in");
		System.out.println(numout + " out");
		dado.close();

	}

}
