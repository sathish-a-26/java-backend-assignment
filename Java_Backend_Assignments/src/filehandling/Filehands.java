package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;

public class Filehands {

    public static void main(String[] args) throws IOException {

        // 1. File Creation
        File file = new File("student.txt");

        if (file.createNewFile()) {
            System.out.println("file created");
        } else {
            System.out.println("file already exists");
        }

        // 2. Append content to file
        FileWriter filewrte = new FileWriter("student.txt", true);
        filewrte.write("Sathish\n");
        filewrte.close();
        System.out.println("data inserted");

        // 3. Remove duplicates using HashSet
        HashSet<Integer>set=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); 
        set.add(30);
        set.add(20);

        System.out.println("unique num:"+set);

        // 4. Store roll number and name using HashMap
        HashMap<Integer, String> students = new HashMap<>();

        students.put(33, "sathish");
        students.put(56, "surya");

        System.out.println("students:"+ students);

        // 5. Sort numbers in ascending order
        
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        Collections.sort(numbers);

        
        System.out.println("sorted num:"+numbers);
    }
}
