package Day05;

import java.util.Scanner;


public class Day05_2 {//c s
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		// for ���� �����
		// ��1) �Է¹��� ������ŭ �� ���
		System.out.print("�� ���� : "); int �� = scanner.nextInt();
		for( int i = 1 ; i<=�� ; i++ ) {System.out.print("*");}
		
System.out.println("\n-----------------------------------------------");
		
		// ��2) �Է¹��� ������ŭ �� ��� [* 5������ �ٹٲ�]
		System.out.print("��2 ���� : "); int ��2 = scanner.nextInt();
		for( int i2 = 1 ; i2<=��2 ; i2++ ) {
			System.out.print("*");
			//5������ �ٹٲ�ó�� [5���]
			if( i2%5 ==0 ) {System.out.println();}
		}
				
		
System.out.println("\n-----------------------------------------------");
		
		// ��3) �Է¹��� �ٸ�ŭ �� ��� [for ��ø]
		
		System.out.print("��3 ���� : "); int ��3 = scanner.nextInt();
		for( int i3 = 1 ; i3<=��3 ; i3++ ) {
			// �� ���
			for( int s= 1; s<=i3 ; s++ ) {System.out.print("*");}
			// �� �ٲ�
			System.out.println();
		}

System.out.println("\n-----------------------------------------------");
		
		
		// ��4) �Է¹��� �ٸ�ŭ �� ���
		
		System.out.print("��4 ���� : "); int ��4 = scanner.nextInt();
		for( int i4 = 1 ; i4<=��4 ; i4++ ) {
			
			for( int s1= 1; s1<=��4-i4+1 ; s1++ ) {System.out.print("*");}
			
			System.out.println();
		}

		// ��5) �Է¹��� �ٸ�ŭ �� ��� (��������)
		
		System.out.print("��5 ���� : "); int ��5 = scanner.nextInt();
		for( int i5 = 1 ; i5<=��5 ; i5++ ) {
			// ���� ���
			for( int b2= 1; b2<=��5-i5 ; b2++ ) {System.out.print(" ");}
			// �� ���
			for( int s2= 1; s2<=i5 ; s2++){System.out.print("*");}
			// �� �ٲ�
			System.out.println();
		}
		
		
		
	}//m e

}//c e
