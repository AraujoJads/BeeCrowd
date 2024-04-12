import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int codigo;
		int quantidade;
		
		codigo = dado.nextInt();
		quantidade = dado.nextInt();
		
		lanche2 l = new lanche2(codigo,quantidade);
		
		System.out.printf("Total: R$ %.2f\n" ,l.Total());
		dado.close();

	}
}

class lanche2 {

	public int codi;
	public int quan;
	
	public lanche2(int c, int q) {
		 codi = c;
		 quan  = q;
	 }
	
	public float Total(){
		float i = 0;
		if(codi == 1){
			i = (float) (4.00 * quan);
		}
		else if(codi == 2){
			i = (float)(4.50 * quan);
		}
		else if(codi == 3){
			i = (float)(5.00 * quan);
			
		}
		else if(codi == 4){
			i = (float)(2.00 * quan);
		}
		else if(codi == 5){
			i = (float)(1.50 * quan);
		}
		return i;
	}
	
}

