Cafeteria Plate Stack
A simple Java application that uses a Stack data structure to manage cafeteria plates.

Description
This project simulates stacking and removing plates in a cafeteria based on the LIFO (Last In, First Out) concept. The last plate placed on top of the stack is the first one picked up by a customer.

Requirements
 * Java Development Kit (JDK) 8 or higher
 * Any IDE (VS Code, Eclipse, NetBeans) or Terminal

Code
import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Stack to store plate numbers
        Stack<Integer> plateStack = new Stack<>();

        System.out.println("Cafeteria Plate Counter initialized.");

        // Add 1st plate
        System.out.print("Enter first plate number to wash/stack: ");
        int plate1 = input.nextInt();
        plateStack.push(plate1);

        // Add 2nd plate
        System.out.print("Enter second plate number to wash/stack: ");
        int plate2 = input.nextInt();
        plateStack.push(plate2);

        System.out.println("\nCurrent Plates on Stack: " + plateStack);

        // Take top plate off
        int removedPlate = plateStack.pop();
        System.out.println("Customer picked up Plate #" + removedPlate);
        System.out.println("Top plate available now: Plate #" + plateStack.peek());
    }
}

How to Run
 * Open terminal and compile the file:
   javac Stacks.java

 * Run the compiled code:
   java Stacks

Sample Output
Cafeteria Plate Counter initialized.
Enter first plate number to wash/stack: 101
Enter second plate number to wash/stack: 102

Current Plates on Stack: [101, 102]
Customer picked up Plate #102
Top plate available now: Plate #101
Compose
Write to Pierce Ely Hibionada
