package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {//c s
	public static void main(String[] args) {//m s
		// 0. ����
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();// ���� Ŭ������ �̿��� ���� ��ü
		// 1. ������ ����
		String[] ������ = {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		while(true) {// ���ѷ��� [ �������� : �¸��� ������ ���, 9������ ���������� ���º� ] //w s
		// 2. ���������
			for( int i = 0 ; i<������.length ; i++ ) {//f s
				System.out.print(������[i]);
				if( i% 3 == 2 ) System.out.println();
			}//f e
		// 3. �÷��̾�� ��ġ ���ù޾� �� �α�
			while(true) {//���ѷ���[ �������� :�������� ���� �ξ����� break; ]//w2 s
				System.out.print("��ġ ���� : "); int index = scanner.nextInt();
					//1. �̹� ���� �����ϴ� ��� �ٽ� �Է¹ޱ�
					if( ������[index].equals("[ ]")) {������[index] = "[0]";
					 	// String Ŭ������ == ���� ������ ���Ұ� [.equals ]
						break;//���� ����� �ݺ��� Ż�� 
					}
					else {
						System.out.println("[[���]] �̹� �� �ڸ� �Դϴ� [�ٽ� �Է�]");
					}
				
			}//w2 e
		// 4. ��ǻ�Ͱ� ������������ �˵α�
			while(true) {//w3 s
				int rindex = random.nextInt(9); // 9�� ������ 0~9
					// ������ü.nextInt(); int ������ ���� ���� +-20��
					// ������ü.nextInt(��); 0���� �������� ���� ���� 
					// ������ü.nextInt(��)+����; ���ۺ��� �������� ���� ����
				if( ������[rindex]=="[ ]") {
					������[rindex]="[x]";
					break;
				}
			}//w3 e
		// 5. �¸� ����
			// 1. ���η� �̱�� �� [0 1 2] [3 4 5] [6 7 8]
			
			// 2. ���η� �̱�� �� [0 3 6] [1 4 7] [2 5 8]
			
			// 3. �밢������ �̱�� �� [0 4 8 ] [2 4 6]
			
		}//w e
		
		
		
	}//m e
}//c e
