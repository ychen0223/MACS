import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ChatBot MACS = new ChatBot();

        String file = "src//dataset.csv";
        int c =3;
        int d = 2;

        new datas(c,d,file);


        System.out.println("chatbot name is " + MACS.name);
    }
}
