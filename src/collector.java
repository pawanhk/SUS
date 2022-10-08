import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class collector {
    private String input;
    private int indexer;
    private String catagory;
    private ArrayList<String> holdData = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private Scanner nos = new Scanner(System.in);
    private String choice;
    public collector(){
        this.input = "";
        this.indexer = 0;
        this.catagory = "gen"; // gen is general
        this.choice = "N";
    }
    public void enterData(){
        System.out.println("What catagory does the data fall under: ");
        this.catagory = scan.nextLine();
        System.out.println("How much data is required: ");
        this.indexer = scan.nextInt();
        holdData.add("#" + this.catagory);
        int counter = 0;
        while(counter < this.indexer){
            System.out.println("Enter data: ");
            this.input = nos.nextLine();
            holdData.add(this.input);
            counter++;
        }
        // check information
        System.out.println("Category: " + this.catagory);
        for(int i=0; i < holdData.toArray().length; i++){
            System.out.println(holdData.get(i));
        }
        // check condition
        System.out.println("Is the above information correct(Y/N): ");
        this.input = nos.nextLine();
        if(this.input.equals("N")){
            holdData.clear();
            System.out.println("Enter information again, edit not available ");
            enterData();
        }else{
            // create a file
            System.out.println("Information has been logged, ready for processing");
            try{
                File cfile = new File("cats/"+catagory+".txt");
                if(cfile.createNewFile()){
                    System.out.println("Writing to file " + catagory + ".txt");
                }
            }catch (IOException e){
                System.out.println("Error logging data, data lost ");
            }
            // save to a file
            try {
                FileWriter pen = new FileWriter("cats/"+catagory+".txt",true);
                for(int i = 1; i <= this.indexer ; i++){
                    pen.write(holdData.get(i));
                    pen.write("\n");
                }
                System.out.println("Data has been logged !");
                pen.close();
            }catch (IOException e){
                System.out.println("Error saving data, data lost ");
            }
        }

    }
}
