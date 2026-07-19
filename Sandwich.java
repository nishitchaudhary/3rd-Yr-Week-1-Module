package week1module;

import java.util.Scanner;

public class Sandwich {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a=1;
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
	}//logic 1
		for(int j=1;j<=2*i-1;j++) {
			System.out.print(a+" ");
		}a++;
		
		System.out.println();}
	a=a-2;
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
		}//logic 1
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(a+" ");
			}a--;
			System.out.println();
	}
}
}
