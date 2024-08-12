//swapping without the 3rd variable
import java.util.*;
public class First {
public static void main(String args[]) {
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("the value of a: ");
		System.out.println("the value of b: ");
		
		a=sc.nextInt();
	
		
		b=sc.nextInt();
		
		
		a=((a^b)^a);
		System.out.println("the value after swapping a: "+ a);
		
		b=((b^a)^b)-1;
		
		System.out.println("the value after swapping b: "+ b);
		
		
		
	
	
}
}
}