package Owl_Coder;
import java.util.*;
public class Sieve_Prime_Factorization 
{

	public static void main(String[] args)
	{
		// Write a Java Program to find the Prime Factors of a number using sieve method
		Scanner sc=new Scanner(System.in);
		int N=127;
		int K=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=i;
		}
		for(int i=2;i<N;i++)
		{
			for(int j=i;j<=N;j=j+i)
			{
				if((Arr[j]%i==0) && (Arr[j]==j))
				{
					Arr[j]=i;
				}
			}
		}
		for(int i=2;i<N;i++)
		{
			while(Arr[K]!=1)
			{
				
				System.out.println(Arr[K]);
				K=K/Arr[K];
			}
			sc.close();
		}
		
		
		
		
		

	}

}
