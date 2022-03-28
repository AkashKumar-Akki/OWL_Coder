package Owl_Coder;
import java.util.*;
public class Array_Min_Max_Add
{

	public static void main(String[] args) 
	{
		//Write a Java Program to increase elements by users command
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int Q=sc.nextInt();
		while(Q!=0)
		{
			int L=sc.nextInt();
			int R=sc.nextInt();
			int X=sc.nextInt();
			for(int i=L;i<=R;i++)
			{
				Arr[i]=Arr[i]+X;
			}
			Q--;
		}
		System.out.println(Arrays.toString(Arr));
		sc.close();

	}

}
