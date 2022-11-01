package ch03.ex04;

public  interface IntSequence {   
   
    default boolean hasNext(){
        // By default, sequences are infinite 
        return true;        
    };

    int next();

    public static IntSequence of(Integer... integers) {        
         return new IntSequence() {
            private int counter = 0;

            @Override
            public int next() {
                counter++;
                return integers[counter-1];
            }

            @Override
            public boolean hasNext() {        
                return counter < integers.length;
            }
            
         };           
    } 

    public static IntSequence constant(int c){        
        return () -> c; 
    }
    
   
    

}