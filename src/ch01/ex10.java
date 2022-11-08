package ch01;

import java.util.Random;

/*Write a program that produces a random string of letters and digits by
generating a random long value and printing it in base 36. */

public class ex10 {
    public static void main(String[] args) {

        Long rnd = new Random().nextLong();

        System.out.println(Long.toString(rnd, 36));

    }
}
