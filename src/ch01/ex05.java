package ch01;

/*What happens when you cast a double to an int that is larger than the
largest possible int value? Try it out. */

public class ex05 {
    public static void main(String[] args) {
        System.out.println((double) Integer.MAX_VALUE+1);
        System.out.println((double) Integer.MAX_VALUE);
    }
    
}
