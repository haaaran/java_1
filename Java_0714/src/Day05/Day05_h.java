package Day05;

import java.util.Scanner;

public class Day05_h {//c s
	
	public static void main(String[] args) {//m s
		
		Scanner scanner = new Scanner(System.in);
		
		//�� ����11 X��
		System.out.print("��11 ���� : "); int ��11 = scanner.nextInt();
		for( int i = 1 ; i<=��11 ; i++ ) {//i�� �� ���δ���
			for( int j = 1 ; j<=��11 ; j++ ){//j�� ��
				// ����1 : ��� ���� ������ ����
				// �� ���
				if( i==j )System.out.print("*");
				// ��2 ���
				else if ( (i+j) ==(��11+1) ) System.out.print("*");
				// ���� ���
				else System.out.print(" ");
				// �� �ٲ�
			}
			System.out.println();
		}
		
System.out.println("\n-----------------------------------------------");		
		
		
		
		
		
		
		
		
		
	}//m e	
}//c e
