package Owl_Coder;
import java.util.*;
public class Product_Primes 
{

	public static void main(String[] args) 
	{
		//Write a Java Program to print the product of the Primes
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int c=1;
		for(int i=L;i<=R;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				c=c*i;
			}
		}
		System.out.println(c);
		sc.close();

	}

}
