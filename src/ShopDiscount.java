import java.util.*;
public class ShopDiscount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double TotCost,cost;
	double unit=sc.nextInt();
	cost=100*unit;
	if(cost>1000)
	{
		double discount;
		discount= 0.1*cost;
		cost=cost-discount;
		System.out.println(cost);
	}
}
}
