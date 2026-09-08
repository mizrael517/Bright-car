import java.util.*;

public class Stacks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Integer> plateStack = new Stack<>();

        System.out.println("Cafeteria Plate Counter initialized.");

        System.out.print("Enter first plate number to wash/stack: ");
        int plate1 = input.nextInt();
        plateStack.push(plate1);

        System.out.print("Enter second plate number to wash/stack: ");
        int plate2 = input.nextInt();
        plateStack.push(plate2);

        System.out.println("\nCurrent Plates on Stack: " + plateStack);

        int removedPlate = plateStack.pop();
        System.out.println("Customer picked up Plate #" + removedPlate);
        System.out.println("Top plate available now: Plate #" + plateStack.peek());
    }
} 