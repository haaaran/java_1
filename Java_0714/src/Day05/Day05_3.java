package Day05;

import java.util.Scanner;

public class Day05_3 {//c s
	
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		// �� ���� 6
		System.out.print("��6 ���� : "); int ��6 = scanner.nextInt();
		for( int i6 = 1 ; i6<=��6 ; i6++ ) {
			// ���� ���
			for( int b6= 1; b6<=i6-1 ; b6++ ) {System.out.print(" ");}
			// �� ���
			for( int s6= 1; s6<=��6-i6+1 ; s6++){System.out.print("*");}
			// �� �ٲ�
			System.out.println();
		}
		

		
System.out.println("\n-----------------------------------------------");		
		// �� ����7 �Ƕ�̵�
		
		System.out.print("��7 ���� : "); int ��7 = scanner.nextInt();
		for( int i7 = 1 ; i7<=��7 ; i7++ ) {
			// ���� ���
			for( int b7= 1; b7<=��7-i7 ; b7++ ) {System.out.print(" ");}
			// �� ���
			for( int s7= 1; s7<=i7*2-1 ; s7++){System.out.print("*");}
			
			// �� �ٲ�
			System.out.println();
		}
			
		
System.out.println("\n-----------------------------------------------");		
		//�� ����8 ���� �Ƕ�̵�

		System.out.print("��8 ���� : "); int ��8 = scanner.nextInt();
		for( int i8 = 1 ; i8<=��8 ; i8++ ) {
			// ���� ���
			for( int b8= 1; b8<=��8-i8 ; b8++ ) {System.out.print(" ");}
			// ���� ���
			for( int s8= 1; s8<=i8*2-1 ; s8++){System.out.print(i8);}
						
			// �� �ٲ�
			System.out.println();
		}
		
System.out.println("\n-----------------------------------------------");		
		//�� ����9 ���� �Ƕ�̵�

		System.out.print("��9 ���� : "); int ��9 = scanner.nextInt();
		for( int i9 = 1 ; i9<=��9 ; i9++ ) {
			// ���� ���
			for( int b9= 1; b9<=i9-1 ; b9++ ) {System.out.print(" ");}
			// �� ���
			for( int s9= 1; s9<=(��9-i9+1)*2-1 ; s9++){System.out.print("*");}
			
			
			// �� �ٲ�
			System.out.println();
		}
		
		// �� ����10 �Ƕ�̵�
		
		System.out.print("��10 ���� : "); int ��10 = scanner.nextInt();
		for( int i = 1 ; i<=��10 ; i++ ) {
			// ���� ���
			for( int b= 1; b<=��10-i ; b++ ) {System.out.print(" ");}
			// �� ���
			for( int s= 1; s<=i*2-1 ; s++){System.out.print("*");}
			// �� �ٲ�
			System.out.println();
		}
			// ���� ���
		for( int i = 1 ; i<=��10 ; i++ ) {
			for( int b= 1; b<=i-1 ; b++ ) {System.out.print(" ");}
			// �� ���
			for( int s= 1; s<=(��10-i+1)*2-1 ; s++){System.out.print("*");}
			System.out.println();
		}
		
			
	}//m e
	
}//c e
