/**
 * 
 */
package week3;
import java.util.*;
/**
 * @author beast
 *
 */
public class Ex18_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string: ");
        String word = scan.nextLine();
        reverseDisplay(word);

    }

    private static void reverseDisplay(String word) {
        if (word.length() == 0)
            return;
        System.out.print(word.substring(word.length() - 1));
        reverseDisplay(word.substring(0, word.length()-1));
    }
}
	
