package ch01;

import java.io.Console;

/*Write a program that reads an integer and prints it in binary, octal, and
hexadecimal. Print the reciprocal as a hexadecimal floating-point number. */

public class ex01 {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Type an integer:");
        String in = console.readLine();
        
        Integer num = Integer.parseInt(in);
        System.out.println("Binary: "+Integer.toBinaryString(num));
        System.out.println("Octal: "+Integer.toOctalString(num));
        System.out.println("Hexadeciam: "+Integer.toHexString(num));

        Float numRec = null;        
        if(num>0){
            numRec=1/num.floatValue();
        }else if (num<0){
            numRec=-1/num.floatValue();
        }
        System.out.println("Reciprocal as a hexadecimal floating-point: "+Float.toHexString(numRec));
        
    }
}
