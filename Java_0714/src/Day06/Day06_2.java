package Day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Day06_2 {//c s
	
	// 1. ��� // 2. �Է� // 3. ���� // 4. ������ // 5. ��� // 6. �ݺ���
	
	// ���� : �ڷ��� ������� ����� �޸�
	// ��ü : Ŭ���� ������� ����� �޸�
	
	
	// �迭 : ����[�ε���]�� ���� ����
		// ���� : ������ �ڷ���/Ŭ������ ������ �޸� ����
		// �ε��� : �޸𸮰� ����� ���� ��ȣ[ 0�� ����~~ ]
		// ���� :	 
		// ���� : �迭��.length
	
	
	// ���� : �޸�[�ڿ�] �Ҵ�޾� ������ �����ϴ� ���� 1��
	
	
	
	
	
	public static void main(String[] args) {//m s
		
		// �迭����
		int[] �����迭1 = new int[3]; // int�� ���� 3���� �����Ҽ� �ִ� �޸� �Ҵ� ���� �迭
		// 1. �ڷ���/Ŭ����[]
			// 2. �迭�� (����)
				// 3. new : �޸��Ҵ� ������
					// 4. int[�迭�Ǳ���]
		// �迭 ��� ȣ�� :[0] ~~ [2] // 3�� �ε����� ���
		�����迭1[0] = 3;
		�����迭1[1] = 4;
		�����迭1[2] = 5;
		
		// �迭 ����2 : ����� ���ÿ� �ʱⰪ(�޸� ������ �⺻��)
		String[] ���ڿ��迭2 = {"���缮","��ȣ��","�ŵ���"};
							// String Ŭ���� ��ü 3���� �����ϴ� �޸� �Ҵ���� �迭
		// �迭 ��� ȣ��
		System.out.println(" �迭 �� : " + ���ڿ��迭2); //�޸� �ּ� = ù��° �ε��� �ּҰ� = �迭 �ּҰ�
		System.out.println(" �迭 0 ��° ���� : " + ���ڿ��迭2[0]);
		System.out.println(" �迭 1 ��° ���� : " + ���ڿ��迭2[1]);
		System.out.println(" �迭 2 ��° ���� : " + ���ڿ��迭2[2]);
		System.out.println(" �迭�� ���� : " + ���ڿ��迭2.length );// �迭�� ��� ����
		System.out.println(" �迭 0 ���� ���� : " + ���ڿ��迭2[0].toString());
		
		// ���� 1 : �л����� ���α׷� [ �迭 ]
			// 1. �л����� �Է¹޾� �л�����ŭ �迭�� ���� �Ҵ�
			// 2. �޴� [ 1.�л��� 2.�����Է� 3.�м�[���,���] 4.����]
		
		Scanner scanner = new Scanner(System.in);
		
		int end = 0;
		Integer[] �л�������� = null;
		while( true ) {//w s ���ѷ��� [ �������� : 4���� �������� break; ]
			
			System.out.println(" 1.�л��� 2.�����Է� 3.�м�[���,���] 4.����");
			System.out.print(" ���� : "); int ch = scanner.nextInt();
			
			switch( ch ) {//sw s
				
				case 1 :
					System.out.println(" �л��� �Է� : ");
					int count = scanner.nextInt();
						// int[] �л�������� : ������ �̸����� �޸� ������ �ѹ� // int �ڷ��� => Integer Ŭ����
					�л�������� = new Integer[count];
					System.out.println(count + "��ŭ ��� ����");
					break;					
				case 2 :
					// �л�����ŭ ���� �Է� [ �ݺ��� ]
					for( int i = 0 ; i<�л��������.length ; i++) {
						// i�� 0���� �迭�� �ִ���������� 1�� �����ϸ鼭 �ݺ�
						System.out.print( i + "��° �л��� ���� �Է� : ");
						�л��������[i] = scanner.nextInt();
					}
					break;
				case 3 :
					System.out.println("[[[�м� : ���(��������) , ��ü���]]");
					
					// ����� ��� [ �������� ]
					// 1. �����ڵ��ۼ� 2. Ŭ�����̿� [ �̸� ������� �ڵ� ]
					
					// 2. Arrays.sort(�迭); // ��������
					
					Arrays.sort(�л��������);				
						// �������� : �������� �ݴ�
						// Arrays.sort(�л��������,Collections.reverseOrder());
					 Arrays.sort(�л��������, Collections.reverseOrder() );
							//Collections.reverseOrder()) : �迭�� �ڷ����� ���� ����
					
					int �հ� = 0;
					//��� �迭�� ��ҵ��� �հ�
					for( int i = 0 ; i<�л��������.length ; i++ ) {
						�հ� += �л��������[i];
						// �հ� = �հ� + �л��������[i];
					}
					System.out.println("[[���]] : " + (�հ�/�л��������.length ) );
					
					break;					
				case 4 :
					System.out.println("[[����]]"); end = 1;
					break;
				default:
					System.out.println("[[�˼����� ��ȣ�Դϴ�]]");
				
			}//sw e
			
			if( end == 1 ) break; //case 4�� �������� end�� 1�̶� break�� �ɸ���
		}//w e
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//m e
}//c e
