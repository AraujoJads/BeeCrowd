import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int N = dado.nextInt();
				for(int i=1;i<=N;i++){
				    int X = dado.nextInt();
				    int cont = 0;
				    
				    for(int j=1;j<=X;j++){
				        if(X%j==0){
				            cont++;
				        }
				    }
				    if(cont==2){
				        System.out.println(X+" eh primo");
				    }else{
				    	System.out.println(X+" nao eh primo");
				    }
				}
				dado.close();


	}

}
