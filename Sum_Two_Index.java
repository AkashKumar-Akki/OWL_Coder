package Owl_Coder;
import java.util.*;
public class Sum_Two_Index
{

	public static void main(String[] args) 
	{
		// Write a Java Program to print the possible indexes of sum of the given number
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int T=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if((Arr[i]+Arr[j])==T)
				{
					System.out.println(i+" "+j);
					count++;
			    }
			}
			
		}
		if(count==0)
		{
			System.out.println("Not Possible");
		}
		sc.close();

	}

}
