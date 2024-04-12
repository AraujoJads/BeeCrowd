import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int qtdTestes = dado.nextInt();
        ArrayList lista = new ArrayList();
        for(int i = 0; i < qtdTestes;i++){
            int n = dado.nextInt();
            lista.add(n);
        }
        Motor motor01 = new Motor(lista);

        System.out.println(motor01.primQueda());
        dado.close();
    }
}


class Motor {

    ArrayList lista;
    public Motor(ArrayList lista) {
        this.lista = lista;
    }

    public int primQueda(){
        int aux = 0;
        int i;
        for(i = 0; i < lista.size(); i++){
            int r = (int) lista.get(i);
            if(aux <= r){
                aux = r;
            }
            else{
                break;
            }
        }

        if(lista.size() == i){
            return 0;
        }
        else{
            return i+1;
        }
    }
}