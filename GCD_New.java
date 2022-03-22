package Owl_Coder;
import java.util.*;
public class GCD_New 
{

	public static void main(String[] args) 
	{
		// Write a Java Program to print GCD of 2 numbers using new method
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int A=Math.max(N1,N2);
		int B=Math.min(N1,N2);
		if(A%B==0)
		{
			System.out.println(B);
		}
		else
		{
			System.out.println(A%B);
		}
		sc.close();
	}

}
