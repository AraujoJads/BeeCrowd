import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner dado = new Scanner(System.in);
        boolean erro = true;
        int senha = 2002;

        while (erro) {
            try {
                int input = dado.nextInt();
                if (input != senha) {
                    throw new Exception();

                }
                erro = false;
                System.out.println("Acesso Permitido");
            }catch (Exception e) {
                System.out.println("Senha Invalida");
            }
        }
        dado.close();
    }
}