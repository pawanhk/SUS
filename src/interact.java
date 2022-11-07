import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class interact {
    // set up the way to interact with syl
    private String input;
    private String proc;
    private int choice;
    private Scanner scan = new Scanner(System.in);
    private Scanner sc = new Scanner(System.in);


    private langproc lang = new langproc();
    public interact(){
        this.input = "";
    }

    // primary interaction menu
    public void displayMenu(){
        // void function to display the interaction menu
        System.out.println("#PSYNCHRON-ADMIN#");
        System.out.println("Interaction Menu: ");
        System.out.println("1.) SYLVY LIVE INTERACT ");
        System.out.println("2.) ADMIN DEBUG MODE ");
        System.out.println("3.) MANUEL FEEDER MODE ");
        System.out.println("4.) LANGPROC DIRECT ACESS ");
        System.out.println("5.) EXIT");
        System.out.println("ENTER CHOICE: ");
        choice = scan.nextInt();
        // method tree
        if(choice == 5){
            System.exit(0);
        }
        else if(choice == 4){
            // call the lanproc method
            lang.langprocMenu();
        }
    }


}
