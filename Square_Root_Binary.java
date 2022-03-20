package Owl_Coder;
import java.util.*;
public class Square_Root_Binary
{

	public static void main(String[] args)
	{
		//Write a Java Program to find Square_Root of a Number using Binary Search
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L=1;
		int H=N;
		int count=0;
		while(L<=H)
		{
			int M=(L+H)/2;
			if((M*M)==N)
			{
				System.out.println(M);
				count++;
				break;
			}
			if((M*M)>N)
			{
				H=M-1;
			}
			if((M*M)<N)
			{
				L=M+1;
			}
		}
		if(count==0)
		{
			System.out.println(H);
		}
		sc.close();
		
	}

}
