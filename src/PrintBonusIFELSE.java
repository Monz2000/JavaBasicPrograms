import java.util.*;
public class PrintBonusIFELSE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :");
		
		int salary=sc.nextInt();
		
	   System.out.println("Enter the year of experiance : ");
		 int yr =sc.nextInt();
		 
		 if(yr>5)
		 {
			 int Bonus=(salary*5)/100;
			 System.out.println("bonus calculated :" + (Bonus+salary));
			 
		 }
		 
		 else {
			 System.out.println("0");
		 }
	}

}
