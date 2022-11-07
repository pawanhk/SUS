import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// correct way to set directions
// #this is how/ question/ anything@answer and everything else
public class feeder {
    private String ask;
    private String question;
    private String answer;
    private Scanner scan = new Scanner(System.in);
    private Scanner next = new Scanner(System.in);

    public feeder(){
        this.ask = "";
        this.question = "";
        this.answer = "";
    }

    public String[][] setArray(String question, String answer){
         String[][] directions = {{question,answer}};
         return directions;
    }

    public void setDirections(){
        // set the directions
        System.out.println("How many directions: ");
        int num = scan.nextInt();
        for(int i = 0;i<num;i++){
            System.out.println("How do I do it: ");
            this.ask = next.nextLine();
            int x = this.ask.indexOf('#');
            int y = this.ask.indexOf('@');
            // identify question and answer
            this.question = this.ask.substring(x+1,y);
            this.answer = this.ask.substring(y+1,this.ask.length()-1);
            // set the array element
            String[][] saveDirection = setArray(this.question,this.answer);
            // save to file called directions
            // create a file
            try{
                File cfile = new File("cats/directions.txt");
                if(cfile.createNewFile()){
                }
            }catch (IOException e){
                System.out.println("Error logging data, data lost ");
            }
            // save to a file
            try {
                FileWriter pen = new FileWriter("cats/directions.txt",true);
                String temp = saveDirection[0][0];
                pen.write(temp+"\n");
                temp = saveDirection[0][1];
                pen.write(temp+"\n");
                System.out.println("Data has been logged !");
                pen.close();
            }catch (IOException e){
                System.out.println("Error saving data, data lost ");
            }
        }

    }




}
