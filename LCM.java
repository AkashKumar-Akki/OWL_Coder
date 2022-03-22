package Owl_Coder;
import java.util.*;
public class LCM 
{

	public static void main(String[] args) 
	{
		//Write a Java Program to find LCM of given numbers
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int lcm=1;
	
		for(int i=2;i<=Math.min(N1,N2);i++)
		{
			if((N1%i==0) && (N2%i==0))
			{
				N1=N1/i;
				N2=N2/i;
				lcm=lcm*i;
				i--;
				
			}
			
			
		}
		System.out.println((N1*N2*lcm));
		sc.close();
	}

}
