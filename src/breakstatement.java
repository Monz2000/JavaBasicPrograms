import java.util.*;
public class breakstatement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double n,sum=0.0;
		
		while(true) {
			n=sc.nextInt();
			
			
			if(n<0.0)
			{
				//System.out.println(n);
			    break;
			}
			sum=sum+n;
			
		}
		
		System.out.println(sum);
		
		}
	}


