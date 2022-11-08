package ch01;

/*Using only the conditional operator, write a program that reads three
integers and prints the largest. Repeat with Math.max. */

public class ex03 {
    public static void main(String[] args) {

;
        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = 3;

        System.out.println("Largest with conditionals: ");
        System.out.println(showMax1(int1, int2, int3));

        System.out.println("Largest with Math.max: ");
        System.out.println(showMax2(int1, int2, int3));

    }

    private static Integer showMax1(Integer int1, Integer int2, Integer int3) {
        
        if(int1>int2 && int1>int3){
            return int1;
        }else if(int2>int1 && int2>int3){
            return int2;
        }else{
            return int3;
        }
    }

    private static Integer showMax2(Integer int1, Integer int2, Integer int3) {
        return Math.max(int1, Math.max(int2, int3));        
    }

}
