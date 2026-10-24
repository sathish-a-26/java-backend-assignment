package corejava;



	

class Student {
    int studentId;
    String name;
    int marks;

    Student(int studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("student iD:"+studentId);
        System.out.println("name:"+name);
        System.out.println("marks:"+marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student(33, "Sathish", 6154);
        s1.display();
    }
}


