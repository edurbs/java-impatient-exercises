package ch01;

import java.math.BigInteger;

/*Write a program that computes the factorial n! = 1 × 2 × ... × n, using
BigInteger. Compute the factorial of 1000. */

public class ex06 {
public static void main(String[] args) {
    BigInteger n = BigInteger.ONE;

    for(int i=2;i<=1000;i++){
        n=BigInteger.valueOf(i).multiply(n);
    }

    System.out.println(n);
}
    
    
}
