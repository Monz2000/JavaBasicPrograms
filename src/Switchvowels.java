import java.util.*;
public class Switchvowels {
	public static void main(String[] args)
	{
		{
			Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a character :");
		
		char vow =sc.next().charAt(0);
		
		
		switch(vow)
		{
		case'a':
			System.out.println("vowel");
		break;	
		case'e':
			System.out.println("vowel");
		break;	
		case'i':
			System.out.println("vowel");
		break;	
			
		case'o':
			System.out.println("vowel");
			
		break;	
			
		case'u':
			System.out.println("vowel");
		break;	
	
			default:
				System.out.println("incorrect");
			
		}
		
	}
	}

}
