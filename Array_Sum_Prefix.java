package Owl_Coder;
import java.util.*;
public class Array_Sum_Prefix 
{

	public static void main(String[] args)
	{
		// Write a Java Program to find the sum of numbers between min and max which will be given by user
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int Prefix[]=new int[N];
		for(int i=1;i<N;i++)
		{
			Prefix[0]=Arr[0];
			Prefix[i]=Prefix[i-1]+Arr[i];
		}
		int T=sc.nextInt();
				while(T!=0)
				{
					int A=sc.nextInt();
					int B=sc.nextInt();
					if(A==0)
					{
						System.out.println(Prefix[B]);
					}
					else
						{
							System.out.println(Prefix[B]-Prefix[A-1]);
						}
					T--;
				}
				sc.close();
		

	}

}
