package ch01;

import java.io.Console;

/*Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try it
first with the % operator, then with floorMod. */

public class ex02 {

    private static Integer min = 0;
    private static Integer max = 359;

    public static void main(String[] args) {

        Console console = System.console();
        Integer angle = Integer.parseInt(console.readLine());

        System.out.println("Normalized with %: " + normalizeAngle(angle));

        System.out.println("Normalized with floodMod: " + normalizeAngleV2(angle));

    }

    
    private static Integer normalizeAngle(Integer angle) {
        if (angle >= min) {
            return min + (angle - min) % (max - min);
        } else {
            return max - (min - angle) % (max - min);
        }
        
    }
    
    private static Integer normalizeAngleV2(Integer angle) {
        if (angle >= min) {
            return Math.floorMod(min + (angle - min), (max - min));
        } else {
            return Math.floorMod(max - (min - angle), (max - min));
        }
    }
}
