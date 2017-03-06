package week3;
import java.util.*;

public class Ex18_17 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of characters then press enter: ");
        String s = scan.nextLine();
        System.out.print("Enter a character: ");
        char c = scan.next().charAt(0);
        char[] chars = s.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + c + "' in \"" + s + "\" = " + count(chars, c));
    }
    private static int count(char[] chars, char c) {
        return count(chars, c, chars.length - 1);
    }
    private static int count(char[] chars, char c, int num) {
        int count = (chars[num] == c) ? 1 : 0;
        if (num == 0)
            return count;
        else
            return count + count(chars, c, num - 1);
    }

}