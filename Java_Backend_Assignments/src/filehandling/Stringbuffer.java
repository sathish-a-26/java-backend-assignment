package filehandling;

public class Stringbuffer {

    public static void main(String[] args) {

        StringBuffer sbi = new StringBuffer();

        sbi.append("Amt deposited:1000. ");
        sbi.append("Amt withdraw:500.");

        System.out.println(sbi);
    }
}


//
//Stringbuilder is not thread safe, but it is  faster.
//
//Stringbuffer is thread safe because its methods are synchronized.