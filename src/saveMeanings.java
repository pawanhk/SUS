import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class saveMeanings {
    private String name;
    private String url;
    private String def;

    public saveMeanings(){
        name="";
        def="";
        url="cats/definitions.txt";
    }

    public saveMeanings(String name){
        this.name = name;
    }

    public String getMeanings(){
        String joined = " ";
        getMeaning meaning = new getMeaning();
        String url = "https://www.dictionary.com/browse/"+this.name;
        try{
            meaning.download(url);
            joined = meaning.searchMeaning();
        }catch (Exception e){
            System.out.println("Meaning could not be found !");
        }
        return joined;
    }

    public Boolean checkMeaning(){
        // check meaning
        String name = this.name;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "cats/definitions.txt"));
            String line = reader.readLine();
            while (line != null) {
                // read next line
                if(line.equals(name)){
                    return true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public void saveMeanings(){
        String name = this.name;
        String meaning  = getMeanings();
        System.out.println(name);
        System.out.println(meaning);
        //save to file
        try{
            FileWriter writer = new FileWriter("cats/definitions.txt",true);
            writer.write(name+"\n");
            writer.write(meaning+"\n");
            writer.close();
            System.out.println("definitions stored ... ");
        }catch (IOException e){
            System.out.println("cannot write to file, internal error ... ");
        }
    }
}
