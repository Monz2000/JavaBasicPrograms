import java.util.*;
public class PrintFinalZnestedIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter X :");
		x=sc.nextInt();
		System.out.println("Enter Y :");
		y=sc.nextInt();
		System.out.println("Enter Z :");
		z=sc.nextInt();
		
		if(x>=20) {
			if(y>=100) {
				z=z+100;
			}
			else if(y<100&&y>=50) {
				z=z+50;
			}
			else {
				z=z+10;
			}
		}
		else if(x<20) {
			if(y>=100) {
				z=z+3;
			}
			else if(y<100&&y>=50) {
				z=z+2;
			}
			else {
				z=z+1;
			}
		}
		System.out.println("the final value of Z :" + z);
	}

}
