package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class ArrayStudentData {
    int rollNo;
    String name;
    int mark;

    ArrayStudentData(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ArrayStudentData)) {
            return false;
        }

        ArrayStudentData s = (ArrayStudentData) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public String toString() {
        return rollNo + " - " + name + " - " + mark;
    }
}

public class ArrayListHashSet {
    public static void main(String[] args) {

        ArrayList<ArrayStudentData> students = new ArrayList<>();

        students.add(new ArrayStudentData(101, "sathish", 85));
        students.add(new ArrayStudentData(102, "kumar", 90));
        students.add(new ArrayStudentData(103, "raajan", 75));
        students.add(new ArrayStudentData(101, "sathish", 85));
        students.add(new ArrayStudentData(104, "kirun", 80));
        students.add(new ArrayStudentData(102, "kumar", 90));

        System.out.println("ArrayList:");

        for (ArrayStudentData s : students) {
            System.out.println(s);
        }

        HashSet<ArrayStudentData> uniqueStudents =
                new HashSet<>(students);

        System.out.println("Unique Students:");

        for (ArrayStudentData s : uniqueStudents) {
            System.out.println(s);
        }

        System.out.println("Total Unique Students: "
                + uniqueStudents.size());
    }
}

