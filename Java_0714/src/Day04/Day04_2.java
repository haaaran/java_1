package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ����2 : Ű����ũ ���α׷� 
			// 0. �ݾ��� �Է¹޾� ��ǰ ���� => ��ٱ��� ��� => ����
			// 1. ��ǰ�޴�[�ݺ�] : 1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.����		
		
		int �ݶ���� = 10; 	int ȯŸ��� =10; 		int ���̴���� =10; 	// ��� ���� 
		//��ǰ���� ������ 
		while(true) { // ���Ǳ� ���ѷ��� [ �������� ���� ] 
			int �ݶ󱸸ż� = 0 ; 	int ȯŸ���ż� = 0 ; 	int ���̴ٱ��ż� = 0; 	// ���ż� ���� 
			int �Ѱ����� = 0;
			while(true) { // ������� ���ѷ��� [ while{ } : ��ȣ�� �ڵ尡 ���ѽ��� ]
							// ���� ����[�����������(4) : break; : �ݺ���Ż��( ���尡��� �ݺ��� ��ȣ ������ )
				System.out.println("\n[[[[ ���Ǳ� ]]]] ");
			
				if( �ݶ���� ==0 ) System.out.print("[[[ 1.�ݶ�[��ǰ�غ���]");
				else  System.out.print("[[[ 1.�ݶ�[300��]");
				
				if( ȯŸ��� == 0) System.out.print("2.ȯŸ[��ǰ�غ���]");
				else System.out.print("2.ȯŸ[200��]");
		
				if( ���̴���� == 0 )  System.out.print("3.���̴�[��ǰ�غ���]");
				else  System.out.print("3.���̴�[100��]");
				
				System.out.println("4.����");
				
				
				System.out.print("[[ ���� : "); int ���� = scanner.nextInt();
				if( ���� == 1 ) {
					//1. ����� ������� ���� �Ұ� 
					if( �ݶ���� > 0 ) { // ����� ������� 
						System.out.println("[[[ �ݶ��� ��ҽ��ϴ� ]]]");
						�ݶ󱸸ż�++; // �ݶ󱸸ż� ����
						�ݶ����--;	// �ݶ���� ���� 
					}else {
						System.out.println("[[[ �ݶ� ����� �����ϴ� ]]]");
					}
				}
				if( ���� == 2 ) {
					//1. ����� ������� ���� �Ұ� 
					if( ȯŸ��� > 0 ) { // ����� ������� 
						System.out.println("[[[ ȯŸ ��ҽ��ϴ� ]]]");
						ȯŸ���ż�++; // �ݶ󱸸ż� ����
						ȯŸ���--;	// �ݶ���� ���� 
					}else {
						System.out.println("[[[ ȯŸ��� �� �����ϴ� ]]]");
					}
				}
				if( ���� == 3 ) {
					//1. ����� ������� ���� �Ұ� 
					if( ���̴���� > 0 ) { // ����� ������� 
						System.out.println("[[[ ���̴� ��� ��ҽ��ϴ� ]]]");
						���̴ٱ��ż�++; // �ݶ󱸸ż� ����
						���̴����--;	// �ݶ���� ���� 
					}else {
						System.out.println("[[[ ���̴� ����� �����ϴ� ]]]");
					}
				}
				if( ���� == 4 ) { 
					System.out.println("[[[ ��ٱ��� ]]]");
					if( �ݶ󱸸ż�==0 && ȯŸ���ż�==0 && ���̴ٱ��ż� ==0  ) { System.err.println("[[[ ���� �Ͻ� ��ǰ�� �����ϴ� ]]]"); break;}
					else {
						if( �ݶ󱸸ż� !=0 ) System.out.println("�ݶ� ���ż� : " + �ݶ󱸸ż� + " ������ : "+�ݶ󱸸ż�*300);
						if( ȯŸ���ż� !=0 ) System.out.println("ȯŸ ���ż� : " + ȯŸ���ż� + " ������ : "+ȯŸ���ż�*200);
						if( ���̴ٱ��ż� !=0 ) System.out.println("���̴� ���ż� : " + ���̴ٱ��ż� + " ������ : "+���̴ٱ��ż�*100);
						
						�Ѱ����� = (�ݶ󱸸ż�*300) + (ȯŸ���ż�*200) + (���̴ٱ��ż�*100);
						
						System.out.println("���� �Ͻðڽ��ϱ�? ��[1] �ƴϿ�[0]"); int ����2 = scanner.nextInt();
						if( ����2 == 1 ) {
							System.out.println("[[[ �ݾ� ���� ]]] : "); int �ݾ� = scanner.nextInt();
							//1.�Ѱ����׺��� �ݾ��� ������� ����x
							if( �ݾ� < �Ѱ����� ) {
								System.out.println("[[[ �ݾ� ����(�ʱ�ȭ��) ]]] ");
								�ݶ����+=�ݶ󱸸ż�;
								���̴����+=���̴ٱ��ż�;
								ȯŸ���+=ȯŸ���ż�;
								break;
							}else {
								�ݾ� -= �Ѱ�����;
								System.out.println("[[[ �����Ϸ� ]]] : �ܵ� : " + �ݾ�);
								System.err.println("\n[[[�����Ϸ�]]] �̿����ּż� �����մϴ�"); 
								break;
							}
						}
						if( ����2 == 0 ) {
							System.out.println("[[[ �ʱ�ȭ������ �̵� ]]]");
							�ݶ����+=�ݶ󱸸ż�;
							���̴����+=���̴ٱ��ż�;
							ȯŸ���+=ȯŸ���ż�;
							break;
						}
						break; // while ���� 
					}
				}
			} // �ι�° ���ѷ��� ���� ���� 
		} // ù��° ���ѷ��� ���� ����

		
	} // main end 
}