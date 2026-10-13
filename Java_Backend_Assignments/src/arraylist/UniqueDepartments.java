package arraylist;


import java.util.HashSet;
import java.util.Objects;

class DepartmentData {
    int rollNo;
    String name;
    String department;

    DepartmentData(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DepartmentData)) {
            return false;
        }

        DepartmentData s = (DepartmentData) obj;
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

public class UniqueDepartments {
    public static void main(String[] args) {

        HashSet<DepartmentData> students = new HashSet<>();

        students.add(new DepartmentData(101, "sathish", "ECE"));
        students.add(new DepartmentData(102, "Kaalaiaya", "CSE"));
        students.add(new DepartmentData(103, "senthil", "ECE"));
        students.add(new DepartmentData(104, "velu", "IT"));
        students.add(new DepartmentData(101, "anbu", "ECE"));

        System.out.println("All Students:");

        for (DepartmentData s : students) {
            System.out.println(s);
        }

        HashSet<String> departments = new HashSet<>();

        for (DepartmentData s : students) {
            departments.add(s.department);
        }

        System.out.println("Unique Departments:");
        System.out.println(departments);
    }
}

