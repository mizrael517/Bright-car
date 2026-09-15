Constructor, Getters, and Setters — Explanation
1. Constructor

A constructor is a special method in Java that is automatically called when you create an object.

Its purpose is to give initial values to the object's variables.

Example:

public Student(String name, int age, String course) {
    this.name = name;
    this.age = age;
    this.course = course;
}

When we create:

Student student = new Student("Mizrael", 20, "Information Technology");

the constructor stores:

Name → Mizrael
Age → 20
Course → Information Technology
2. Getter

A getter is a method used to access or get the value of a private variable.

Example:

public String getName() {
    return name;
}

We use it like this:

System.out.println(student.getName());

Purpose: Getter = GET/READ data

3. Setter

A setter is a method used to change or update the value of a private variable.

Example:

public void setName(String name) {
    this.name = name;
}

We use it like this:

student.setName("Juan");

Purpose: Setter = SET/CHANGE data

Simple Summary
Concept	Purpose	Example
Constructor	Gives initial values	new Student("Mizrael", 20, "IT")
Getter	Gets/reads data	getName()
Setter	Changes/updates data	setName("Juan")
Easy way to remember

Constructor → CREATE the object
Getter → GET the information
Setter → SET new information