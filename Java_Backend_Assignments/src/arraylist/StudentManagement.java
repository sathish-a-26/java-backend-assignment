package arraylist;



import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + mark;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "cotta bheem", 85));
        students.add(new Student(102, "juggu", 90));
        students.add(new Student(103, "Kirumala", 75));
        students.add(new Student(104, "chutki", 95));
        students.add(new Student(105, "kaaliya", 80));

        Student highest = students.get(0);

        System.out.println("All Students:");

        for (Student s : students) {
            System.out.println(s);

            if (s.mark > highest.mark) {
                highest = s;
            }
        }

        System.out.println("Highest Mark:");
        System.out.println(highest);
    }
}



