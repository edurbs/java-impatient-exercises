package ch01;


/*Write a program that reads a line of text and prints all characters that are
not ASCII, together with their Unicode values. */
public class ex11 {

    public static void main(String[] args) {

        String words = "Lorem ipsum dolor sit ĩ̱ ẽ ĩ amet consectetuer";

        for (char ch : words.toCharArray()) {
            int i = (int) ch;
            if( i<1 || i>255){
                System.out.println(ch);               
                System.out.println(String.format("\\u%04x", i));
            }
        }
    

    }
    
}
