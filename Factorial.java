package Owl_Coder;
import java.util.*;
public class Factorial 
{

	public static void main(String[] args)
	{
		//Write a Java Program to find the Factorial of a number
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Fact=1;
		for(int i=1;i<=N;i++)
		{
			Fact=Fact*i;
		}
		System.out.println(Fact);
		sc.close();

	}

}
