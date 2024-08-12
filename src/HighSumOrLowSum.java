import java.util.*;
public class HighSumOrLowSum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum,x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		sum=x+y;
		if(sum>=100) {
			System.out.println("High sum");
			}
		else {
			System.out.println("Low sum");
			
		}
		
	}

}
