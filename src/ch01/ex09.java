package ch01;

/*Section 1.5.3 has an example of two strings s and t so that
s.equals(t) but s != t. Come up with a different example that
doesn’t use substring. */

public class ex09 {
    public static void main(String[] args) {
        
        String greeting = "Hello World"; 
        String[] array = greeting.split(" ");

        String s=array[1];
        String t="World";

        System.out.println("Test if "+s+" is equals to "+t);
        System.out.println(s.equals(t));
        System.out.println(s==t);

    }
    
}
