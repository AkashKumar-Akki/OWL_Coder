package Owl_Coder;
import java.util.*;
public class Reverse_String
{

	public static void main(String[] args) 
	{
		//Write a Java Program to Reverse the String
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		for(int i=S.length()-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
		}
		sc.close();
		
	
	

	}

}
