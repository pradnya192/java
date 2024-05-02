class Student {
    int rollNo; // Corrected variable name from roll no to rollNo
    String name;
    static String college = "SGU"; // Changed college to uppercase convention

    Student(int r, String n) {
        rollNo = r; // Assigning the parameter values to instance variables
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college); // Added + to concatenate strings
    }
}

public class TestStaticVariable1 {       // Corrected class declaration
    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan"); // Corrected parameter value casing
        Student s2 = new Student(112, "Aryan"); // Corrected parameter value casing
        s1.display();
        s2.display();
    }
}
