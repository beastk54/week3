/**
 * 
 */
package week3;
import java.util.*;
/**
 * @author beast
 *
 */
public class Ex4_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name;
		double hours;
		double rate;
		double fedTax;
		double StateTax;
		
		System.out.println("Enter Employee's Name:");
		name=scan.next();
		System.out.println("Enter Hours worked:");
		hours=scan.nextDouble();
		System.out.println("Enter Hourly pay rate:");
		rate=scan.nextDouble();
		System.out.println("Enter Federal tax withholdings:");
		fedTax=scan.nextDouble();
		System.out.println("Enter State tax withholdings:");
		StateTax=scan.nextDouble();
		double gross=hours*rate;
		double Fedpay=(gross*(fedTax));
		double Statepay=(gross*(StateTax));
		double deductions=Statepay+Fedpay;
		double Net=gross-deductions;
		
		System.out.println("Employee name: "+name);
		System.out.println("Hours Worked: "+hours);
		System.out.println("Pay rate: $"+rate);
		System.out.println("Gross Pay: $"+gross);
		System.out.println("Deductions: ");
		System.out.println("   Federal Withholdings: $"+Fedpay);
		System.out.println("   State Withholdings: $"+ Statepay);
		System.out.println("   Total Deductions: $"+ deductions);
		System.out.println("Net pay: $"+ Net);
	}

}
