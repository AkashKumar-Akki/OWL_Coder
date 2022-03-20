package Owl_Coder;
import java.util.*;
public class Square_Root
{

	public static void main(String[] args)
	{
		//Write a Java Program to find Square_Root of a Number
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N/2;i++)
		{
			if((i*i)==N)
			{
				System.out.println(i);
			}
		}
		sc.close();

	}

}
