package Owl_Coder;
import java.util.*;
public class Linear_Search
{
	public static void main(String[] args)
	{
		//Write a Java Program to find an element in an Array using Linear Search
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int status=0;
		int Arr[]=new int[N];
		int pos=0;
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int A=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			if(Arr[i]==A)
			{
				status=1;
				pos=i;
				break;
				
			}
		}
		if(status==1)
		{
			System.out.println("Element found at "+pos);
		}
		else
		{
			System.out.println("Element not found");
		}
		sc.close();

	}

}
