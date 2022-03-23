package Owl_Coder;
import java.util.*;
public class Three_Divisors
{

	public static void main(String[] args) 
	{
		//Write a Java Program to print the numbers which have only three divisors in between them
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		for(int i=L;i<R;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==3)
			{
				System.out.println(i);
			}
		}
		sc.close();

	}

}
