package java_workspace_assignment;

import java.util.Scanner;

public class Greatest_number {
	
	public static void main(String[] args) {
		
		int a, b, c;
 
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		
		if(a>b && a>c)
		{
			System.out.println("largest number is : " + a);
		}
		
		else if (b>a && b>c)
		{
			System.out.println("largest number is: " + b);
		}
		
	
		  
		}  
		 
	}


