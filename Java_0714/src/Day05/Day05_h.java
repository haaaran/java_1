package Day05;

import java.util.Scanner;

public class Day05_h {//c s
	
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		//별 문제11 X별
		System.out.print("줄11 개수 : "); int 줄11 = scanner.nextInt();
		for( int i = 1 ; i<=줄11 ; i++ ) {//i는 행 가로단위
			for( int j = 1 ; j<=줄11 ; j++ ){//j는 열
				// 조건1 : 행과 열이 만나는 지점
				// 별 찍기
				if( i==j )System.out.print("*");
				// 별2 찍기
				else if ( (i+j) ==(줄11+1) ) System.out.print("*");
				// 공백 찍기
				else System.out.print(" ");
				// 줄 바꿈
			}
			System.out.println();
		}
		
System.out.println("\n-----------------------------------------------");		
		
		
		
		
		
		
		
		
		
	}//m e	
}//c e
