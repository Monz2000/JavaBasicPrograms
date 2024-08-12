import java.util.*;
public class RichAdultYoung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter salary :");
		int salary = sc.nextInt();
		
		if(age>40)
		{
			if(salary>=30000) {
				System.out.println("You are rich and adult");
				
			}
			else {
				System.out.println("you are an adult");
			}
		}
		if(age<=40)
		{
			if(salary>=12000) {
				System.out.println("You are rich and young");
				
			}
			else {
				System.out.println("you are an young");
			}
		}
		
		
	}

}
