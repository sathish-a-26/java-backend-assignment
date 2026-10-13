package arraylist;



import java.util.HashSet;
import java.util.Objects;

class DuplicateData {
    int rollNo;
    String name;
    String department;

    DuplicateData(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DuplicateData)) {
            return false;
        }

        DuplicateData s = (DuplicateData) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public String toString() {
        return rollNo + " - " + name + " - " + department;
    }
}

public class DuplicateStudents {
    public static void main(String[] args) {

        HashSet<DuplicateData> students = new HashSet<>();

        students.add(new DuplicateData(101, "sathish", "ECE"));
        students.add(new DuplicateData(102, "rajan", "CSE"));
        students.add(new DuplicateData(101, "guna", "IT"));

        for (DuplicateData s : students) {
            System.out.println(s);
        }

        System.out.println("Total Students: " + students.size());
    }
}

