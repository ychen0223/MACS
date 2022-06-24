import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class datas extends ChatBot{

    public datas(int c, int d, String file){
        BufferedReader reader = null;
        String line = "";
        String[][] inputs = new String[c][d];

        try{
            reader =new BufferedReader(new FileReader(file));

            int a = 0;
            int b = 0;
            while ((line = reader.readLine())!= null) {
                String[] Tdata = line.split(",");

                for (String index : Tdata) {
                    if (a < c) {
                        if(b<d) {
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
            for (int i = 0; i < c; i++)
                for (int j = 0; j < d; j++)
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
    }

}
