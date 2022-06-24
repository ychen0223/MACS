import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        ChatBot MACS = new ChatBot();

        String file = "src//dataset.csv";
        BufferedReader reader = null;
        String line = "";
        int c = 3;
        int d = 3;
        String [][] inputs = new String[c][d];

        try{
            reader =new BufferedReader(new FileReader(file));

            int a = 0;
            int b = 0;
            while ((line = reader.readLine())!= null) {
                String[] Tdata = line.split(",");

                for (String index : Tdata) {
                    if (a < c) {
                        if(b<d-1) {
                            System.out.println(a+" " + b);
                            inputs[a][b] = index;
                            b++;
                        }
                    }
                }
                a++;
                b = 0;
                System.out.println();

            }
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 2; j++)
                    System.out.println("arr[" + i + "][" + j + "] = "
                            + inputs[i][j]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

            try {
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("chatbot name is " + MACS.name);
    }
}
