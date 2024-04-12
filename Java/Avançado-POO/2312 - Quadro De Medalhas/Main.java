import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        ArrayList lista = new ArrayList();
        for(int i = 0;i < N; i++){
            String pais = dado.next();
            int O = dado.nextInt();
            int P = dado.nextInt();
            int B = dado.nextInt();
            Pais novo = new Pais(pais,O,P,B);
            lista.add(novo);
            Collections.sort(lista,new Comparador());
        }

        for(int i = 0;i < N;i++){
            System.out.println(lista.get(i).toString());
        }
        dado.close();
    }





}
class Comparador implements Comparator<Pais>{

    @Override
    public int compare(Pais o1, Pais o2) {



        if(o1.getO() > o2.getO()){
            return -1;
        }else if(o1.getO() < o2.getO()){
            return 1;
        }else{
            if(o1.getP() > o2.getP()){
                return -1;
            }else if(o1.getP() < o2.getP()){
                return 1;
            }
            else{
                if(o1.getB() > o2.getB()){
                    return -1;
                }else if(o1.getB() < o2.getB()){
                    return 1;
                }
                else{
                    if(o1.getPais().compareTo(o2.getPais()) < 0){
                        return -1;
                    }else if(o1.getPais().compareTo(o2.getPais()) > 0){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        }


    }
}
class Pais {
    private String pais;
    private int o;
    private int p;
    private int b;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Pais(String pais, int o, int p, int b) {
        this.pais = pais;
        this.o = o;
        this.p = p;
        this.b = b;

    }
    public String toString(){
        return pais + " " + o + " " + p + " " + b;
    }

}

