package Day06;

public class Day06_1 {//c s
	
	// ��� : if[������], switch[������]
	// �ݺ��� : for, while, do~while
			// break, continue
	
	
	public static void main(String[] args) {//m s
		
		// switch
			// ���� : switch( key: �˻���)
			// 1. (key) �� �ش��ϴ� case ã���� �Ʒ� case ��� ����
			// 2. break; : switch Ȥ�� �ݺ��� Ż��
			// 3. ����� ���� �������ִ� ��� switch
			//	 ����� ���� ������������ ��� if
		
		// ��1)
		int ���� = 80;
		switch( ���� ) {
			case 90 : System.out.println("90�� �Դϴ� ");
			case 80 : System.out.println("80�� �Դϴ� ");
			case 70 : System.out.println("70�� �Դϴ� ");
			default : System.out.println("Ż���Դϴ� ");
		}
		
System.out.println("==============================================");		
			
			
		switch( ���� ) {
			case 90 : System.out.println("90�� �Դϴ�if "); break;
			case 80 : System.out.println("80�� �Դϴ�if "); break;
			case 70 : System.out.println("70�� �Դϴ�if "); break;
			default : System.out.println("Ż���Դϴ�if ");
		}
		
System.out.println("==============================================");		
				
		

		// ��2)
		int ��ư = 30;
		switch( ��ư ) {
			case 90 : System.out.println("1���� "); break;
			case 80 : System.out.println("3����"); break;
			case 70 : System.out.println("3����"); break;
			default :
		}
	
System.out.println("==============================================");				
		

		// ��3) �� ������ ����� 90���̻��̸� "A" 80�� �̻��̸� "B" �������� Ż��
		int ���� = 80 ; int ���� = 80 ; int ���� = 90;
		int ��� = (����+����+����)/3;
		switch( ���/10 ) {
			case 9 : System.out.println("A��� "); break;
			case 8 : System.out.println("B���"); break;
			default : System.out.println("Ż�� ");
		}

		// for : ���ǿ� ���� �ݺ�����
		//	for( �ʱⰪ ; ���ǹ� ; ������)
		for( int i = 0 ; i<10 ; i++ ) {
			System.out.print( i + " ");
			if( i== 3 ) continue;  // ���� ����� �ݺ��� �̵�
			if( i== 6 ) break;     // ���� ����� �ݺ��� Ż��
		}
System.out.println(" ");
System.out.println("==============================================");
		// while : ���ǿ� ���� �ݺ����� = ���ѷ���
		// �ʱⰪ
		/* while (���ǹ�) {
			������
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
