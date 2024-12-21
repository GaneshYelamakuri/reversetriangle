package com.jsp.Patternspack;
  import java.util.Scanner;

public class ReversePyramid 
{
	public static void main(String [] args)
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a number");
			int a=scn.nextInt();
			int l=a;
			int s=0;
			
			for (int i=1; i<=a;i++)
			{
				for(int j=1;j<=s;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=l;j++)
				{
					System.out.print("X");
				}
				
				System.out.println();
				s++;
				l-=2;
			}
		}

	


}
