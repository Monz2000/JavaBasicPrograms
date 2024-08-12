import java.util.*;
public class GradingStudentNestedIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark :");
		int m =sc.nextInt();//m for marks
		if(m>90) {
			System.out.println("Excellent");
		}
		else if(m>80 && m<=90) {
			System.out.println("Good");
	}
		else if(m>70 && m<=80) {
			System.out.println("Fair");
	}
		else if(m>60 && m<=70) {
			System.out.println("Meets expectation");
	}
		else if(m>50 && m<=60) {
			System.out.println("par");
		
	}
		else{
			System.out.println("fail");

		}
}
}