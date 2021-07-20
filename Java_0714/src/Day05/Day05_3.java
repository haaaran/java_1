package Day05;

import java.util.Scanner;

public class Day05_3 {//c s
	
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		// 별 문제 6
		System.out.print("줄6 개수 : "); int 줄6 = scanner.nextInt();
		for( int i6 = 1 ; i6<=줄6 ; i6++ ) {
			// 공백 찍기
			for( int b6= 1; b6<=i6-1 ; b6++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s6= 1; s6<=줄6-i6+1 ; s6++){System.out.print("*");}
			// 줄 바꿈
			System.out.println();
		}
		

		
System.out.println("\n-----------------------------------------------");		
		// 별 문제7 피라미드
		
		System.out.print("줄7 개수 : "); int 줄7 = scanner.nextInt();
		for( int i7 = 1 ; i7<=줄7 ; i7++ ) {
			// 공백 찍기
			for( int b7= 1; b7<=줄7-i7 ; b7++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s7= 1; s7<=i7*2-1 ; s7++){System.out.print("*");}
			
			// 줄 바꿈
			System.out.println();
		}
			
		
System.out.println("\n-----------------------------------------------");		
		//별 문제8 숫자 피라미드

		System.out.print("줄8 개수 : "); int 줄8 = scanner.nextInt();
		for( int i8 = 1 ; i8<=줄8 ; i8++ ) {
			// 공백 찍기
			for( int b8= 1; b8<=줄8-i8 ; b8++ ) {System.out.print(" ");}
			// 숫자 찍기
			for( int s8= 1; s8<=i8*2-1 ; s8++){System.out.print(i8);}
						
			// 줄 바꿈
			System.out.println();
		}
		
System.out.println("\n-----------------------------------------------");		
		//별 문제9 역순 피라미드

		System.out.print("줄9 개수 : "); int 줄9 = scanner.nextInt();
		for( int i9 = 1 ; i9<=줄9 ; i9++ ) {
			// 공백 찍기
			for( int b9= 1; b9<=i9-1 ; b9++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s9= 1; s9<=(줄9-i9+1)*2-1 ; s9++){System.out.print("*");}
			
			
			// 줄 바꿈
			System.out.println();
		}
		
		// 별 문제10 피라미드
		
		System.out.print("줄10 개수 : "); int 줄10 = scanner.nextInt();
		for( int i = 1 ; i<=줄10 ; i++ ) {
			// 공백 찍기
			for( int b= 1; b<=줄10-i ; b++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s= 1; s<=i*2-1 ; s++){System.out.print("*");}
			// 줄 바꿈
			System.out.println();
		}
			// 공백 찍기
		for( int i = 1 ; i<=줄10 ; i++ ) {
			for( int b= 1; b<=i-1 ; b++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s= 1; s<=(줄10-i+1)*2-1 ; s++){System.out.print("*");}
			System.out.println();
		}
		
			
	}//m e
	
}//c e
