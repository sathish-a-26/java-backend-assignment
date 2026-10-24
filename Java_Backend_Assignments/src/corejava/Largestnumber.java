package corejava;

public class Largestnumber {


    public static void main(String[] args) {
        int a = 80;
        int b = 75;
        int c = 64;

        if (a >= b && a >= c){
        	
            System.out.println("largest:"+a);
        } 
        
            else if (b>=a&&b>=c){
            System.out.println("largest:"+b);
        } 
         else {
        	 
            System.out.println("largest:" + c);
        }

        System.out.println("add:"+(a+b));
    }
}
