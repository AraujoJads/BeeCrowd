import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int casos = dado.nextInt();
        for(int i = 0; i < casos; i++) {
            int r1 = dado.nextInt();
            int r2 = dado.nextInt();
            calcularRaio teste = new calcularRaio(casos,r1,r2);
            System.out.println(teste.getRaio());
        }
        dado.close();
    }
}
class calcularRaio {
    private int casos;
    private int r1;
    private int r2;
    public calcularRaio(int casos,int r1,int r2){
        this.casos = casos;
        this.r1 = r1;
        this.r2 = r2;
    }
    public int getRaio(){
        return (r1+r2);
    }
}

