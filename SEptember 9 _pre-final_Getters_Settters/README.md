Getters and Setters — Explanation
What are Getters and Setters?

Getters and Setters are methods in Java used to access and modify private variables inside a class.

They are commonly used in encapsulation, which means protecting the data of an object from direct access.

1. Getter

A getter is used to get or read the value of a private variable.

Example:
public String getName() {
    return name;
}

If we have:

Student student = new Student("Mizrael", 20, "IT");

We can get the student's name using:

System.out.println(student.getName());

Output:

Mizrael

👉 Getter = GET/READ information

2. Setter

A setter is used to set, change, or update the value of a private variable.

Example:
public void setName(String name) {
    this.name = name;
}

We can change the student's name using:

student.setName("Juan");

Then:

System.out.println(student.getName());

Output:

Juan

👉 Setter = SET/CHANGE information

Complete Example
public class Student {

    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}
Simple explanation for your assignment:

Getters and setters are methods used to access and modify private variables in a Java class. A getter retrieves the value of a variable, while a setter changes or updates its value. They help protect data and are an important part of encapsulation in Object-Oriented Programming