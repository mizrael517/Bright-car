public class Main {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 8, 15, 20, 3, 18, 5, 10};

        System.out.println("Array Elements:");
        printArray(numbers);

        int evenCount = countEvenNumbers(numbers);

        System.out.println("\nTotal Even Numbers: " + evenCount);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Utility method that accepts an array and returns the number of even values
    public static int countEvenNumbers(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num % 2 == 0) {   // Conditional statement
                count++;
            }
        }

        return count;
    }
}