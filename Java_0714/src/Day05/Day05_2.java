package Day05;

import java.util.Scanner;


public class Day05_2 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		// for 으로 별찍기
		// 별1) 입력받은 정수만큼 별 출력
		System.out.print("별 개수 : "); int 별 = scanner.nextInt();
		for( int i = 1 ; i<=별 ; i++ ) {System.out.print("*");}
		
System.out.println("\n-----------------------------------------------");
		
		// 별2) 입력받은 정수만큼 별 출력 [* 5개마다 줄바꿈]
		System.out.print("별2 개수 : "); int 별2 = scanner.nextInt();
		for( int i2 = 1 ; i2<=별2 ; i2++ ) {
			System.out.print("*");
			//5개마다 줄바꿈처리 [5배수]
			if( i2%5 ==0 ) {System.out.println();}
		}
				
		
System.out.println("\n-----------------------------------------------");
		
		// 별3) 입력받은 줄만큼 별 출력 [for 중첩]
		
		System.out.print("줄3 개수 : "); int 줄3 = scanner.nextInt();
		for( int i3 = 1 ; i3<=줄3 ; i3++ ) {
			// 별 찍기
			for( int s= 1; s<=i3 ; s++ ) {System.out.print("*");}
			// 줄 바꿈
			System.out.println();
		}

System.out.println("\n-----------------------------------------------");
		
		
		// 별4) 입력받은 줄만큼 별 출력
		
		System.out.print("줄4 개수 : "); int 줄4 = scanner.nextInt();
		for( int i4 = 1 ; i4<=줄4 ; i4++ ) {
			
			for( int s1= 1; s1<=줄4-i4+1 ; s1++ ) {System.out.print("*");}
			
			System.out.println();
		}

		// 별5) 입력받은 줄만큼 별 출력 (공백포함)
		
		System.out.print("줄5 개수 : "); int 줄5 = scanner.nextInt();
		for( int i5 = 1 ; i5<=줄5 ; i5++ ) {
			// 공백 찍기
			for( int b2= 1; b2<=줄5-i5 ; b2++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s2= 1; s2<=i5 ; s2++){System.out.print("*");}
			// 줄 바꿈
			System.out.println();
		}
		
		
		
	}//m e

}//c e
