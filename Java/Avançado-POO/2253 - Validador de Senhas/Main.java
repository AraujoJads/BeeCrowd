import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int z=0;
        int y=0;
        int x=0;
        while(br.ready()){
            String senha = br.readLine();
            if (senha.length() >= 6 && senha.length() <= 32){
                for(int i=0 ; i<senha.length() ; i++){
                    if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z')
                        y++;
                    else if (senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z')
                        x++;
                    else if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9')
                        z++;
                }
                if (x==0) System.out.println("Senha invalida.");
                else if (y==0) System.out.println("Senha invalida.");
                else if (z==0) System.out.println("Senha invalida.");
                else if (x+y+z==senha.length()) System.out.println("Senha valida.");
                else System.out.println("Senha invalida."); }
            else
                System.out.println("Senha invalida.");

            y=0;
            x=0;
            z=0;
        }
      
    }

}