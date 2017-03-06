/**
 * 
 */
package week3;
import java.util.*;
/**
 * @author beast
 *
 */
public class Ex18_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.next();
        char ch = scan.next().charAt(0);
        System.out.println(count(str, ch));

    }

    public static int count(String s, char c) {

        int num =  (c == s.charAt(0)) ? 1 : 0;
        if (s.length() == 1)
            return num;
        else
            return num + count(s.substring(1), c);

    }

}