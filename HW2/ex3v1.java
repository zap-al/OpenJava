package CLASSES.HW2;
import java.util.InputMismatchException;
import java.util.*;

public class ex3v1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = Character.toUpperCase(in.next().charAt(0));
        in.close();

        if (ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U') {
            System.out.println("Character is vowel");
        } else {
            System.out.println("Character is not vowel");
        }
        
    }
}