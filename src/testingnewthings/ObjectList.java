/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package testingnewthings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pussy Whisperer
 */
public class ObjectList {
    ArrayList objectList = new ArrayList();
    
    //Constructor
    ObjectList(){
        userInputAddToList();
    }
    
    public void userInputAddToList(){
        //Prompt user, create scanners, get user input
        System.out.println("Enter a name: ");
        Scanner input2;
        
        try (Scanner input1 = new Scanner(System.in)) {
            String inputName = input1.next();
            System.out.println("Enter an age: ");
            input2 = new Scanner(System.in);
            int inputAge = input2.nextInt();
            
            //Use input to create object
            Object newPerson = new Object(inputName, inputAge);
            
            //Add the person to a list
            objectList.add(newPerson);
            
            //Print the list to ensure new person was added
            System.out.println("Printing list...");
            System.out.println(objectList.toString()); 
        }
        //Close out
        input2.close();
    }
}//End class
