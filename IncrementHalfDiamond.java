package week1module;

import java.util.Scanner;

public class IncrementHalfDiamond {public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a=1;
	for(int i=1; i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(a+" ");

		}a++;
		System.out.println( );
	}
	a=a-2;
	for(int i=n-1; i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(a+" ");

		}
		System.out.println( );
	}
}


}
