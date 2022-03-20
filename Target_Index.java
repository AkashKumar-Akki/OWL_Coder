package Owl_Coder;
import java.util.*;
public class Target_Index 
{

	public static void main(String[] args)
	{
		//Write a Java Program to print the indexes of repeated elements in an Array
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		Arrays.sort(Arr);
		int S=sc.nextInt();
		
		
		for(int i=0;i<N;i++)
		{
			if(Arr[i]==S)
			{
				count++;
			}
			
		}
		int Arr3[]=new int[count];
		for(int i=0,j=0;i<N;i++)
		{
			if(Arr[i]==S)
			{
				//System.out.println("Element found at "+i);
				Arr3[j]=i;
				j++;
			}
			
		}
		System.out.println(Arrays.toString(Arr3));
		sc.close();
		

	}

}
