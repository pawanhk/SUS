import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class langproc {
    // language processor and word meaning and understanding
    // use feeder or collector to get sentence or information

    // standard question and greetings
    // invoke the basic greeting
    private BufferedReader reader;
    private int rechoice;
    private Scanner scan = new Scanner(System.in);
    private Scanner sc = new Scanner(System.in);
    private String proc;
    private String sentence;
    ArrayList<String> bestPossible = new ArrayList<>();

    public langproc(){
        // default constructor
        this.sentence = "";
    }

    public langproc(String sentence){
        this.sentence = sentence;
    }

    // get the question
    // greetings and opening with a new class call it initiate

    public void langprocMenu(){
        System.out.println("LANGPROC DIRECT ACCESS 1");
        System.out.println("LANPROC MENU: ");
        System.out.println("1.) SINGLE SENTENCE PROCESS ");
        System.out.println("2.) MULTILINE PROCESS ");
        System.out.println("3.) TEXT FILE READ ");
        System.out.println("4.) GO BACK ");
        System.out.println("5.) EXIT ");
        System.out.println("ENTER CHOICE: ");
        rechoice = scan.nextInt();
        if(rechoice == 1){
            // single
            System.out.println("#LANGPROC SINGLE SENTENCE#");
            System.out.println("ENTER SENTENCE TO PROCESS: ");
            proc = sc.nextLine();
            langproc(proc);
        }
        else if(rechoice == 4){
            interact inter = new interact();
            inter.displayMenu();
        }
        else if(rechoice == 5){
            System.exit(0);
        }

    }

    // langproc called from elsewhere
    public void langproc(String sentence){
        // process this sentence
        System.out.println("PROCESSING SENTENCE USING LANGPROC ");
        String[] split = sentence.split(" ");
        // start by storing each word in a temp array
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> connectors = new ArrayList<>();
        ArrayList<String> subject = new ArrayList<>();
        ArrayList<String> verbs = new ArrayList<>();
        // match words with each cat


    }




}
