package Owl_Coder;
import java.util.*;
public class GCD 
{

	public static void main(String[] args)
	{
		//Write a Java Program GCD of given 2 numbers
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int gcd=1;
		for(int i=1;i<Math.max(N1,N2);i++)
		{
			if((N1%i==0) && (N2%i==0))
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		sc.close();

	}

}
