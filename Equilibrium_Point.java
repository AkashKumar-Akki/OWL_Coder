package Owl_Coder;
import java.util.*;
public class Equilibrium_Point 
{

	public static void main(String[] args)
	{
		//Write a Java Program to find the Equilibrium point of an Arry
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Arr[]=new int[N];
		int A=0;
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int Prefix[]=new int[N];
		Prefix[0]=Arr[0];
		for(int i=1;i<N;i++)
		{
			Prefix[i]=Prefix[i-1]+Arr[i];
		}
		//System.out.println(Arrays.toString(Arr));
		//System.out.println(Arrays.toString(Prefix));
		for(int i=2;i<N-1;i++)
		{
			if(Prefix[i-1]==(Prefix[N-1]-Prefix[i]))
			{
				//System.out.println(Prefix[i]-Prefix[i-1]);
				A=Prefix[i]-Prefix[i-1];
			}
		}
		for(int i=0;i<N;i++)
		{
			if(Arr[i]==A)
			{
				System.out.println(i+1);
			}
			
		}
		sc.close();
		

	}

}
