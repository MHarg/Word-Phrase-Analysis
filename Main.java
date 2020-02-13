
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    private static String quit = "quit"; 
    private static String question = "";

    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while ((quit.equals(question)!=true)){
            question = scan.nextLine();
            System.out.println (question);

        }
    }

}
