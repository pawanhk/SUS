import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getMeaning {
    public void download(String urlString) throws IOException {
        URL url = new URL(urlString);
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("history/page.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            System.out.println("*ADMIN: SYLVY ACCESSED THE INTERNET FOR DEFINITIONS*");
        }


    }

    // search method
    public String searchMeaning(){
        String location = "history/page.txt";
        String meaning = "";
        ArrayList<String> theSentence = new ArrayList<>();
        String join = "";
        // find the meaning from the page
        try{
            File fil = new File(location);
            Scanner reader = new Scanner(fil);
            String sentence="";
            while(reader.hasNextLine()){
                sentence =  reader.nextLine();
                // search for required sentences
            }
            int index = sentence.lastIndexOf("name=\"description\"");
            //int index = sentence.lastIndexOf("content=\"");
            int end = sentence.lastIndexOf("See more.\">");
            String sub = sentence.substring(index,end);
            String[] words = sub.split(" ");
            for(int i=2;i< words.length;i++){
                if(words[i].equals("more.\">")){
                    break;
                }else{
                    //System.out.print(words[i]);
                    join = join + words[i];
                    join = join + " ";
                    //System.out.print(" ");
                }
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("*Admin: failed to fetch webpage *");
            e.printStackTrace();
        }

        return join;
    }
}