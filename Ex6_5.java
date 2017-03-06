/**
 * 
 */
package week3;
import java.util.*;

/**
 * @author beast
 *	
 * ex 6.5 display numbers in increasing order
 */
public class Ex6_5 {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your three numbers");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		double n3=scan.nextDouble();
		displaySortedNumbers(n1,n2,n3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		
		if((num1<num2)&&(num1<num3))
		{
			System.out.println(num1);
			if(num2<num3){
				System.out.println(num2);
				System.out.println(num3);
			}
			else{
				{
					System.out.println(num3);
					System.out.println(num2);
				}
			}
		}
		else if(num2<num1&&num2<num3){
			System.out.println(num2);
			if(num1<num3){
				System.out.println(num1);
				System.out.println(num3);
			}
			else{
				{
					System.out.println(num3);
					System.out.println(num1);
				}
			}
		}
		else{
			System.out.println(num3);
			if(num1<num2){
				System.out.println(num1);
				System.out.println(num2);
			}
			else{
				{
					System.out.println(num2);
					System.out.println(num1);
				}
			}
		}
			
	}
}
