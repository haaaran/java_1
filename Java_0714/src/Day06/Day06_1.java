package Day06;

public class Day06_1 {//c s
	
	// 제어문 : if[논리제어], switch[값제어]
	// 반복문 : for, while, do~while
			// break, continue
	
	
	public static void main(String[] args) {//m s
		
		// switch
			// 형태 : switch( key: 검사대상)
			// 1. (key) 에 해당하는 case 찾은후 아래 case 모두 실행
			// 2. break; : switch 혹은 반복문 탈출
			// 3. 경우의 수가 정해져있는 경우 switch
			//	 경우의 수가 정해지지않은 경우 if
		
		// 예1)
		int 점수 = 80;
		switch( 점수 ) {
			case 90 : System.out.println("90점 입니다 ");
			case 80 : System.out.println("80점 입니다 ");
			case 70 : System.out.println("70점 입니다 ");
			default : System.out.println("탈락입니다 ");
		}
		
System.out.println("==============================================");		
			
			
		switch( 점수 ) {
			case 90 : System.out.println("90점 입니다if "); break;
			case 80 : System.out.println("80점 입니다if "); break;
			case 70 : System.out.println("70점 입니다if "); break;
			default : System.out.println("탈락입니다if ");
		}
		
System.out.println("==============================================");		
				
		

		// 예2)
		int 버튼 = 30;
		switch( 버튼 ) {
			case 90 : System.out.println("1선택 "); break;
			case 80 : System.out.println("3선택"); break;
			case 70 : System.out.println("3선택"); break;
			default :
		}
	
System.out.println("==============================================");				
		

		// 예3) 세 점수의 평균이 90점이상이면 "A" 80점 이상이면 "B" 나머지는 탈락
		int 국어 = 80 ; int 영어 = 80 ; int 수학 = 90;
		int 평균 = (국어+영어+수학)/3;
		switch( 평균/10 ) {
			case 9 : System.out.println("A등급 "); break;
			case 8 : System.out.println("B등급"); break;
			default : System.out.println("탈락 ");
		}

		// for : 조건에 따른 반복실행
		//	for( 초기값 ; 조건문 ; 증감식)
		for( int i = 0 ; i<10 ; i++ ) {
			System.out.print( i + " ");
			if( i== 3 ) continue;  // 가장 가까운 반복문 이동
			if( i== 6 ) break;     // 가장 가까운 반복문 탈출
		}
System.out.println(" ");
System.out.println("==============================================");
		// while : 조건에 따른 반복실행 = 무한루프
		// 초기값
		/* while (조건문) {
			증감식
			} 
		*/
		int i = 0 ;
		while ( i<10 ) {
			if( i== 3 ) continue;  
			if( i== 6 ) break;
			System.out.print( i + " ");
			i++;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//m e
}//c e
