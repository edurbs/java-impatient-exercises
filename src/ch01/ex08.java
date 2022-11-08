package ch01;

/*Write a program that reads a string and prints all of its nonempty
substrings. */
public class ex08 {
    public static void main(String[] args) {
        String words = "Lorem ipsum dolor sit amet consectetuer";

        for (char c : words.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                System.out.println(c);
            }
        }

    }
}
