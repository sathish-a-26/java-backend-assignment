

package corejava;

public class Staticfinal {
    static int count=0;
    final int marks=100;

    Staticfinal() {
        count++;
    }

    public static void main(String[] args) {
        Staticfinal s1 = new Staticfinal();
        Staticfinal s2 = new Staticfinal();

        
        
        System.out.println("static is the keyword to be an  variable of the class and sharing  to all objects."
        		
	        		+ "final is the keyword to be an variable value can't to be changed after the initialized.");
        System.out.println("Count:"+count);
        System.out.println("Mark:"+ s1.marks);
    }
}






