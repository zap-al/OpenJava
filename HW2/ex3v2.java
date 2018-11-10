package CLASSES.HW2;
import java.util.InputMismatchException;
import java.util.*;

public class ex3v2 {

    public static void main(String[] args) {
        char ch = ' ';
        
        Scanner in = new Scanner(System.in);
        try {
            ch = Character.toUpperCase(in.next().charAt(0));
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        boolean flag = false;

        char arrayOfChar[] = {'A','E','I','O','U'};

        for (byte i = 0; i < 5; i++)
            if (ch == arrayOfChar[i])
                flag = true;

        System.out.println(flag ? "Character is vowel" : "Character is not vowel");

    }
}