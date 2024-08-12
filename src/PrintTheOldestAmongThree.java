import java.util.*;
public class PrintTheOldestAmongThree {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age of A :");
	int a=sc.nextInt();
	System.out.println("Enter age of B :");
	int b=sc.nextInt();
	System.out.println("Enter age of C :");
	int c=sc.nextInt();
	
	if (a>b)
	{
		if(a>c) {
			System.out.println("A is the oldest");
		}
	}
	if (b>a)
	{
		if(b>c) {
			System.out.println("B is the oldest");
		}
	}
	if (c>a)
	{
		if(c>a) {
			System.out.println("c is the oldest");
		}
	}
	
}
}
