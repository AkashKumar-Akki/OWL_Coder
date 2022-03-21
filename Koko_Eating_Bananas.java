package Owl_Coder;
import java.util.*;
public class Koko_Eating_Bananas 
{

	public static void main(String[] args)
	{
		//Write a Java Program for KOKO Eating Bananas

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		Arrays.sort(Arr);
		int l=1;
		int m=0;
	
		
		
		
		int h=Arr[N-1];
		int H=sc.nextInt();
		while(l<=h)
		{
			m=(l+h)/2;
			int sum=0;
			for(int i=0;i<N;i++)
			{
				if(Arr[i]%m==0)
				{
					sum+=Arr[i]/m;
					
				}
				else
				{
					sum+=(Arr[i]/m)+1;
				}	
			}	
			
			if(sum<=H)
			{
				h=m-1;
			}
			else
			{
				l=m+1;
			}
			
				
			
			
		
		}
		System.out.println(l);
		sc.close();
		
		
		
		

	}

}
