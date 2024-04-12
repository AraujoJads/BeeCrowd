import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int T = dado.nextInt();
        for(int i =0;i<T;i++){
            int B = dado.nextInt();
            int Ai = dado.nextInt();
            int Di = dado.nextInt();
            int Li = dado.nextInt();
            int Ai2 = dado.nextInt();
            int Di2 = dado.nextInt();
            int Li2 = dado.nextInt();
            Treinador Dabriel = new Treinador(B,Ai,Di,Li);
            Treinador Guarte = new Treinador(B,Ai2,Di2,Li2);
            Batalha novo = new Batalha(Guarte,Dabriel);
            System.out.println(novo.Calculo());
            dado.close();
        }
    }
}
class Treinador {
    private int B;
    private int Ai;
    private int Di;
    private int Li;

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getAi() {
        return Ai;
    }

    public void setAi(int ai) {
        Ai = ai;
    }

    public int getDi() {
        return Di;
    }

    public void setDi(int di) {
        Di = di;
    }

    public int getLi() {
        return Li;
    }

    public void setLi(int li) {
        Li = li;
    }

    public Treinador(int B, int Ai, int Di, int Li){
        this.B = B;
        this.Ai = Ai;
        this.Di = Di;
        this.Li= Li;

    }

}
class Batalha {
    Treinador Guarte;
    Treinador Dabriel;
    public Batalha(Treinador Guarte, Treinador Dabriel){
        this.Guarte = Guarte;
        this.Dabriel = Dabriel;
    }
    public String Calculo(){
       double X = (Guarte.getAi() + Guarte.getDi())/ 2.0;
       if(Guarte.getLi() % 2 == 0){
             X = X + Guarte.getB();
       }
       double Y = (Dabriel.getAi() + Dabriel.getDi())/ 2.0;
       if(Dabriel.getLi() % 2 == 0){
           Y = Y + Dabriel.getB();
       }
       if(X > Y){
           return "Guarte";
       }
       else if(X < Y){
            return "Dabriel";
       }
       else{
           return "Empate";
       }
    }
}
