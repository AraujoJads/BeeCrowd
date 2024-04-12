import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado;
		dado = new Scanner(System.in);
		
		int flag = 1;
		int grenal = 0 , inter = 0 ,gremio = 0,empate = 0;
				while(flag==1){
				    grenal++;
				    int A = dado.nextInt();
				    int B = dado.nextInt();
				    
				    if(A>B){
				        inter++;
				    }else if(A<B){
				        gremio++;
				    }else{
				        empate++;
				    }
				    System.out.println("Novo grenal (1-sim 2-nao)");
				    flag = dado.nextInt();
				    while(flag!=1&& flag!=2){
				    System.out.println("Novo grenal (1-sim 2-nao)");
				    flag = dado.nextInt();
				    }
				}
				System.out.println(grenal+" grenais");
				System.out.println("Inter:"+inter);
				System.out.println("Gremio:"+gremio);
				System.out.println("Empates:"+empate);

				if(inter>gremio&& inter>empate){
					System.out.println("Inter venceu mais");
				}else if(gremio>inter&&gremio>empate){
					System.out.println("Gremio venceu mais");
				}else{
					System.out.println("Nao houve vencedor");
				}
				dado.close();
	}
}
