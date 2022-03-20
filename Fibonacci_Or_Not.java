package Akki;
import java.util.*;
public class Fibonacci_Or_Not 
{
	public static void main(String[] args)
	{
		// Write a Java Program to check the given Number is Fibonacci or Not:
		System.out.println("Enter a Number to check it is Fibonacci or Not: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int m=0;
		int n=1;
		int c=0;
		for(int i=0;i<=N-2;i++)
		{
			int X=m+n;
			m=n;
			n=X;
			if(N==m || N==n)
			{
				c=1;
			}
			
		}
		if(c==1)
		{
			System.out.println("Yes");
		}
		if(c==0)
		{
			System.out.println("No");
		}
		sc.close();
		
		
		
		

	}

}
