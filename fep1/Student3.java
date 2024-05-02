class Student3 {  
    int id;  
    String name;  
    
    // Constructor
    Student3() {
        // Default constructor
    }
    
    // Constructor with parameters
    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Method to display the value of id and name  
    void display() {
        System.out.println(id + " " + name);
    }
    
    public static void main(String args[]) {  
        // Creating objects and initializing using constructors
        Student3 s1 = new Student3(1, "Alice");  
        Student3 s2 = new Student3(2, "Bob");
        
        // Displaying values of the objects  
        s1.display();  
        s2.display();  
    }  
}
