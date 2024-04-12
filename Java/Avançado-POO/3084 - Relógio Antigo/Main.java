import java.io.*;

public class Main {

    public static void main(String[] args) {

        InputStreamReader ir = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(ir);

        try{

            while(br.ready()) {

                String[] linha = br.readLine().split(" ");
                int aHoras = Integer.parseInt(linha[0]);
                int aMinutos = Integer.parseInt(linha[1]);
                double horas = aHoras / 30;
                double minutos = (aMinutos / 30.0) * 5;
                if(horas < 10){
                  if(minutos < 10){
                      System.out.printf("0%.0f:0%.0f\n", horas, minutos);
                   }
                  else {
                      System.out.printf("0%.0f:%.0f\n", horas, minutos);
                  }
                }
                else{
                    if(minutos < 10){
                        System.out.printf("%.0f:0%.0f\n", horas, minutos);
                    }
                     else {
                          System.out.printf("%.0f:%.0f\n", horas, minutos);
                     }
                }
            }
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}