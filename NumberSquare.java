package week1module;

import java.util.Scanner;

public class NumberSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		 int n = sc.nextInt();
		 int a=sc.nextInt();
		  for(int i=1; i <=n; i++) {
			  for(int j=1; j <=n; j++) {
				  System.out.print(a+" ");
			  }
			  System.out.println();  
			  }
		
	}
}
