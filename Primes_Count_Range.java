package Owl_Coder;
import java.util.*;
public class Primes_Count_Range 
{

	public static void main(String[] args)
	{
		//Write a Java Program to print Primes count range
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int status=0;
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
				status++;
			}
		}
		System.out.println(status);
		sc.close();

	}

}
