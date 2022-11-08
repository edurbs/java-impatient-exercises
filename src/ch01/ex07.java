package ch01;

/*Write a program that reads in two integers between 0 and 4294967295,
stores them in int variables, and computes and displays their unsigned
sum, difference, product, quotient, and remainder. Do not convert them to
long values. */

public class ex07 {
    public static void main(String[] args) {

        int a = Integer.parseUnsignedInt("4294967295");

        int b = Integer.parseUnsignedInt("2");

        System.out.println("A=" + Integer.toUnsignedString(a) + "; B=" + Integer.toUnsignedString(b));
        System.out.println("Sum: " + Integer.sum(a,b));
        System.out.println("Difference: " + (a-b)); 
        System.out.println("Product: " + (a*b));
        System.out.println("Quotient: " + Integer.divideUnsigned(a, b));
        System.out.println("Quotient: " + (a/b));
        System.out.println("Remainder: " + (Integer.remainderUnsigned(a, b)));
        System.out.println("Remainder: " + (a%b));
    }

}
