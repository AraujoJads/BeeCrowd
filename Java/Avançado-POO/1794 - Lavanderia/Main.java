import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int LA = dado.nextInt();
        int LB = dado.nextInt();
        int SA = dado.nextInt();
        int SB = dado.nextInt();

        Lavadora novaLavadora = new Lavadora(LA,LB);
        Secadora novaSecadora = new Secadora(SA,SB);
        Comparacao novaComparacao = new Comparacao(novaLavadora.getLa(),novaLavadora.getLb(),novaSecadora.getSa(),novaSecadora.getSb(),N);

        novaComparacao.result();
        dado.close();
    }
}

class Lavadora {
    private int la;
    private int lb;

    public int getLa() {
        return la;
    }

    public void setLa(int la) {
        this.la = la;
    }

    public int getLb() {
        return lb;
    }

    public void setLb(int lb) {
        this.lb = lb;
    }

    public Lavadora(int la, int lb) {
        this.la = la;
        this.lb = lb;

    }
    
}

class Secadora {
    private int sa;
    private int sb;

    public int getSa() {
        return sa;
    }

    public void setSa(int sa) {
        this.sa = sa;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }
    public Secadora(int sa, int sb){
        this.sa = sa;
        this.sb = sb;
    }
}

class Comparacao {
    private int la;
    private int lb;
    private int sa;
    private int sb;
    private int n;

    public int getLa() {
        return la;
    }

    public void setLa(int la) {
        this.la = la;
    }

    public int getLb() {
        return lb;
    }

    public void setLb(int lb) {
        this.lb = lb;
    }

    public int getSa() {
        return sa;
    }

    public void setSa(int sa) {
        this.sa = sa;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Comparacao(int la, int lb, int sa, int sb, int n){
        this.la = la;
        this.lb = lb;
        this.sa = sa;
        this.sb = sb;
        this.n = n;
    }

    public void result(){
        if(n >= la && n<= lb){
            if(n >= sa && n <= sb){
                System.out.println("possivel");
            }
            else{
                System.out.println("impossivel");
            }
        }
        else{
            System.out.println("impossivel");
        }

    }
}