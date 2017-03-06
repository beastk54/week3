/**
 * 
 */
package week3;
import java.util.*;

/**
 * @author beast
 *
 *Check Passwords
 */
public class Ex6_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String password;
		System.out.println("Enter your password");
		password=scan.next();
		
		if(password.length()>=8){
			if(isDigitsCharacters(password)){
				if(hasDigits(password)){
					System.out.println("Password is valid");
				}
				else{
					System.out.println("Password is invalid");
				}
			}
			else{
				System.out.println("Password is invalid");
			}
			
		}
		else{
			System.out.println("Password is invalid");
		}
		
	}
	public static boolean isDigitsCharacters(String pass){
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean hasDigits(String password) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= 2) {
				return true;
			}
		}
		return false;
	}

}
