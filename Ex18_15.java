package week3;
import java.util.*;

public class Ex18_15 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.println(count(str, c));
    }

    public static int count(String s, char c) {
        return count(s, c, s.length() - 1);
    }

    public static int count(String s, char c, int high) {
        int num =  (c == s.charAt(0)) ? 1 : 0;
        if (high <= 0)
            return num;
        return num + count(s.substring(1), c, high - 1);
    }
}