

public class ChatBot {
    String name;
    String data[][] = new String[0][0];
    public ChatBot(){
        name = "MACS";
    }

    /*methods
     1. we need to figure out how we can process the request
       --
     */

    public void checkDatabase(int c, int d, String file){
        new datas().fetch(c,d,file);
    }
    public void response(String request,int c, int d, String file){
        boolean match = false;
        String placeholder = "no match! try again later!";
        String[] SearchSentence = chopdownthesentence(request);
        String[][] data = new datas().fetch(c,d,file);
        /*for(int i = 0; i  <chopdownthesentence(request).length; i++){
            System.out.println("word["+i+"] = " + chopdownthesentence(request)[i]);
        }

         for (int i = 0; i < c; i++)
                for (int j = 0; j < d; j++)
                    System.out.println("arr[" + i + "][" + j + "] = " + data[i][j]);
        */
        int a = 0;

        while(a<SearchSentence.length&&match!=true){
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++)
                    if (data[i][j].toLowerCase().equals(SearchSentence[a].toLowerCase())) {
                        System.out.println("current search word: " + chopdownthesentence(request)[a]);
                        System.out.println("current match word: " + data[i][j]);
                        match = true;
                        placeholder = data[i][j + 1];
                    }
            }
            a++;
        }
        System.out.println(placeholder);
    }


    public static String[] chopdownthesentence(String Sentence){
        String words[] = Sentence.split(" ");
        /*System.out.println("Number of words: " + words.length);
        for(int i = 0; i  <words.length; i++){
            System.out.println("word["+i+"] = " + words[i]);
        }*/
        return words;
    }
}
