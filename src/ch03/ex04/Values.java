package ch03.ex04;



public class Values implements IntSequence {
    private int i=-1;
    private Integer[] integers;

    @Override
    public int next() {
        i++;
        return integers[i];
    }  

    

   
 

}
