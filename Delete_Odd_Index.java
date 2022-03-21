package Owl_Coder;
import java.util.*;
public class Delete_Odd_Index
{

	public static void main(String[] args) 
	{
		//Write a Java Program to delete odd index values
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		
		for(int i=0;i<S.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(S.charAt(i));
			}
			
		}
		sc.close();

	}

}
