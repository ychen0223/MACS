import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ChatBot MACS = new ChatBot();
        String NewMessage = "I am happy";

        String file = "src//dataset.csv";
        int c =3;
        int d = 2;
        System.out.println("input message is: " + NewMessage);
        MACS.response(NewMessage,c,d,file);

        System.out.println("chatbot name is " + MACS.name);
    }
}
