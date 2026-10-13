package arraylist;

import java.util.ArrayList;

class SearchData {
    int rollNo;
    String name;
    String department;

    SearchData(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + department;
    }
}

public class SearchStudent {
    public static void main(String[] args) {

        ArrayList<SearchData> students = new ArrayList<>();

        students.add(new SearchData(101, "Sathish", "ECE"));
        students.add(new SearchData(102, "Kirumala", "CSE"));
        students.add(new SearchData(103, "anbu", "IT"));
        students.add(new SearchData(104, "senthil", "EEE"));

        int searchRollNo = 103;
        boolean found = false;

        for (SearchData s : students) {
            if (s.rollNo == searchRollNo) {
                System.out.println("Student Found:");
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }
}
