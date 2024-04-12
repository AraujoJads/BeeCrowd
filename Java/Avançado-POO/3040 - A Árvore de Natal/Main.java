import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        for(int i = 0; i < N; i++){
            int a = dado.nextInt();
            int d = dado.nextInt();
            int g = dado.nextInt();
            Arvore nova = new Arvore(a,d,g);
            nova.result();
        }
        dado.close();
    }
}

class Arvore {
    private int a;
    private int d;
    private int g;
    public Arvore(int a, int d, int g) {
        this.a = a;
        this.d = d;
        this.g = g;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void result(){
        if(a >= 200 && a <= 300){
            if(d >= 50){
                if(g >= 150){
                    System.out.println("Sim");
                }
                else{
                    System.out.println("Nao");
                }
            }
            else{
                System.out.println("Nao");
            }
        }
        else{
            System.out.println("Nao");
        }
    }
}


