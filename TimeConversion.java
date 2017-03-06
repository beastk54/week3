/**
 * 
 */
package week3;
import java.util.*;
/**
 * @author beast
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the time in Military time? ");
		double Time= scan.nextDouble();
		
		System.out.println("The time is: "+((int)Time%12));
		
		
		System.out.println("Now try using a decimal for the minutes! ");
		Time= scan.nextDouble();
		
		System.out.println("The time is: "+((int)Time%12)+" hours and "+ ((int)((Time%1)*60))+" minutes");		
	}
}
