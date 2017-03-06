/**
 * 
 */
package week3;
import java.util.*;

/**
 * @author beast
 *
 */
public class Ex6_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int palindrome=scan.nextInt();
		System.out.println("Is it a Palindrome?"+isPalindrome(palindrome));
		
	}

	public static int reverse(int num){
		int rev=0;
		int single=num%10;
		int tens=(num%100)-single;
		int hundreds=(num%1000)-single-tens;
		rev=single+tens+hundreds;
		return rev;
	}
	
	public static boolean isPalindrome(int number){
		
		if(number==(reverse(number)))
		{
			return (true);
		}
		else 
		{
			return(false);
		}
	}
	
}
