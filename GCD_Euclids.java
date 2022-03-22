package Owl_Coder;
import java.util.*;
public class GCD_Euclids
{

	public static void main(String[] args) 
	{
		//Write a Java Program to find GCD of 2 numbers using Euclid's theorem
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int A=0,B=0,C=0;
		while(N1!=0 && N2!=0)
		{
			A=(Math.min(N1,N2));
			B=(Math.max(N1,N2));
			C=B-A;
			N1=A;
			N2=C;
		}
		System.out.println(N1);
		sc.close();
		

	}

}
