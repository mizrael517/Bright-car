public class Main {

    public static void main(String[] args) {

        String[] students = {
            "Alex",
            "Bianca",
            "Carlos",
            "Diana",
            "Ethan",
            "Faith",
            "Gabriel",
            "Hannah"
        };

        int[] attendance = {
            95, 82, 68, 91, 74, 88, 59, 100
        };

        System.out.println("====================================");
        System.out.println("      STUDENT ATTENDANCE CHECK");
        System.out.println("====================================");

        displayAttendance(students, attendance);

        double average = calculateAverage(attendance);

        System.out.println();
        System.out.println("Average Attendance: " + average + "%");

        System.out.println();
        System.out.println("Attendance Status:");
        checkAttendance(students, attendance);
    }

    // Method 1: Display student attendance
    public static void displayAttendance(String[] students, int[] attendance) {

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i] + " - " + attendance[i] + "%"
            );
        }
    }

    // Method 2: Calculate average attendance
    public static double calculateAverage(int[] attendance) {

        int total = 0;

        for (int percentage : attendance) {
            total += percentage;
        }

        return (double) total / attendance.length;
    }

    // Method 3: Check attendance status
    public static void checkAttendance(
            String[] students,
            int[] attendance) {

        for (int i = 0; i < students.length; i++) {

            if (attendance[i] >= 75) {
                System.out.println(
                    students[i] + " - GOOD ATTENDANCE"
                );
            } else {
                System.out.println(
                    students[i] + " - LOW ATTENDANCE"
                );
            }
        }
    }
}