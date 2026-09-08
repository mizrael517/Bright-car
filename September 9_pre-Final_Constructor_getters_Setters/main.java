public class Main {

    static class Student {
        private String name;
        private int age;
        private String course;

        // Constructor
        Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCourse() {
            return course;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }

    public static void main(String[] args) {

        // Create an object using the constructor
        Student student = new Student("Juan", 20, "BS Information Technology");

        // Using getters
        System.out.println("STUDENT INFORMATION");
        System.out.println("-------------------");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());

        // Using setters
        student.setName("Pedro");
        student.setAge(21);
        student.setCourse("BS Computer Science");

        System.out.println("\nUPDATED INFORMATION");
        System.out.println("-------------------");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
    }
}