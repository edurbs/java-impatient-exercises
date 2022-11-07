package ch03.ex04;

import javax.print.event.PrintEvent;

/* 4 - Implement a static "of" method of the "IntSequence" class that yields a
sequence with the arguments. For example, IntSequence.of(3,
1, 4, 1, 5, 9) yields a sequence with six values. Extra credit if
you return an instance of an anonymous inner class. */

/* 5 - Add a static method with the name "constant" of the "IntSequence"
class that yields an infinite constant sequence. For example,
IntSequence.constant(1) yields values 1 1 1..., ad infinitum.
Extra credit if you do this with a lambda expression. */

public class ex04 {
    public static void main(String[] args) {
        
        
        IntSequence values = IntSequence.of(3, 1, 4, 1, 5, 9);

        while(values.hasNext()){
            System.out.print(values.next()+", ");
        }        

        IntSequence constant = IntSequence.constant(1);
        
        System.out.print("\n"+constant.next()+", ");
        System.out.print(constant.next()+", ");
        System.out.print(constant.next());
        
    }
}