package Owl_Coder;
import java.util.*;
public class Binary_Search 
{

	public static void main(String[] args)
	{
		//Write a Java Program to find an element in an Array using Binary Search
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int status=0;
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int S=sc.nextInt();
		int l=0;
		int pos=0;
		int h=N-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if((Arr[m])==S)
			{
				status=1;
				pos=m;break;
			}
			if(Arr[m]>S)
			{
				h=m-1;
			}
			if(Arr[m]<S)
			{
				l=m+1;
			}
		}
		
		if(status==1)
		{
			System.out.println("Element found "+pos);
		}
		else
		{
			System.out.println("Element not found");
		}
		sc.close();

	}

}
