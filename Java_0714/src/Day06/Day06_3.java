package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {//c s
	public static void main(String[] args) {//m s
		// 0. 설정
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();// 랜덤 클래스를 이용한 랜덤 객체
		// 1. 게임판 설정
		String[] 게임판 = {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		while(true) {// 무한루프 [ 종료조건 : 승리자 나왔을 경우, 9개알이 존재했을때 무승부 ] //w s
		// 2. 게임판출력
			for( int i = 0 ; i<게임판.length ; i++ ) {//f s
				System.out.print(게임판[i]);
				if( i% 3 == 2 ) System.out.println();
			}//f e
		// 3. 플레이어에게 위치 선택받아 알 두기
			while(true) {//무한루프[ 종료조건 :정상적인 알을 두었을때 break; ]//w2 s
				System.out.print("위치 선택 : "); int index = scanner.nextInt();
					//1. 이미 알이 존재하는 경우 다시 입력받기
					if( 게임판[index].equals("[ ]")) {게임판[index] = "[0]";
					 	// String 클래스는 == 같다 연산자 사용불가 [.equals ]
						break;//가장 가까운 반복문 탈출 
					}
					else {
						System.out.println("[[경고]] 이미 둔 자리 입니다 [다시 입력]");
					}
				
			}//w2 e
		// 4. 컴퓨터가 난수생성에서 알두기
			while(true) {//w3 s
				int rindex = random.nextInt(9); // 9를 넣으면 0~9
					// 랜덤객체.nextInt(); int 범위내 난수 생성 +-20억
					// 랜덤객체.nextInt(수); 0부터 수전까지 난수 생성 
					// 랜덤객체.nextInt(수)+시작; 시작부터 수전까지 난수 생성
				if( 게임판[rindex]=="[ ]") {
					게임판[rindex]="[x]";
					break;
				}
			}//w3 e
		// 5. 승리 조건
			// 1. 가로로 이기는 수 [0 1 2] [3 4 5] [6 7 8]
			
			// 2. 세로로 이기는 수 [0 3 6] [1 4 7] [2 5 8]
			
			// 3. 대각선으로 이기는 수 [0 4 8 ] [2 4 6]
			
		}//w e
		
		
		
	}//m e
}//c e
