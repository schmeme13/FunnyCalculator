
//Now lets create some UI using swing, *unfinished

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class App {
    public static void main(String[] args) {

        //Creating the User Interface
        JFrame frame = new JFrame();
        frame.setSize(400,500);
        frame.setTitle("Java Height Calculator");
        frame.setLayout(null);
        //Needs to be moved to the end and set to true once ready to implement
        frame.setVisible(true);



        //creating scanner object
        //initially declared height as a variable in one statement,
        //but cant be declared inside of the try catch statement so it has to be declared and initialized here
        Scanner scanner = new Scanner(System.in);
        int height = 0;

        //Prompting user input, storing in string variable
        System.out.println("Enter your height in centimeters");
        
        //Trying out some error handling
        try{
            height = scanner.nextInt();
            System.out.println("Your height is: " + height + "cm");
        } catch(InputMismatchException e) {
            System.out.println("Enter your height, it's fairly simple");
            //create logic to end the program here, so it doesn't continue to execute the rest of the code
        }
        
        //closing the scanner object
        scanner.close();
    }
}
