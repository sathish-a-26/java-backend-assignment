package corejava;



import java.util.ArrayList;
import java.util.HashSet;

public class Collectioncd {



    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(50);
        nums.add(300);

        HashSet<Integer> uniquenums = new HashSet<>(nums);

        System.out.println("arraylist:"+ nums);
        System.out.println("hashset:"+uniquenums);
    }
}