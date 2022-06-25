import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class happiness extends emotion{
    String file = "src//happiness.csv";
    int row = 26;
    int column = 7;
    String[][] input = new String[row][column];
    public happiness(){
    }

    public void checkDatabase(){

        String[][]data = input;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + data[i][j]);
    }

    public void fetch() {
        BufferedReader reader = null;
        String line = "";
        String[][] inputs = new String[row][column];

        try {
            reader = new BufferedReader(new FileReader(file));

            int a = 0;
            int b = 0;
            while ((line = reader.readLine()) != null) {
                String[] Tdata = line.split(",");

                for (String index : Tdata) {
                    if (a < row) {
                        if (b < column) {
                            inputs[a][b] = index;
                            b++;
                        }
                    }
                }
                a++;
                b = 0;
            }

           /* for (int i = 0; i < row; i++)
                for (int j = 0; j < d; j++)
                    System.out.println("arr[" + i + "][" + j + "] = "
                            + inputs[i][j]);*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        this.input = inputs;
    }

}

