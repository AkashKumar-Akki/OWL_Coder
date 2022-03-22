package Owl_Coder;
import java.util.*;
public class Plus_One
{

	public static void main(String[] args) 
	{
		//Write a Java Program to add Plus_One at the end
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(Arr));
		
		for(int i=0;i<N;i++)
		{
			sum=(sum*10)+Arr[i];
		}
		//int res=sum+1;
		//System.out.println(Arrays.toString(res));
	    System.out.println(sum+1);
	    sc.close();

	}

}
