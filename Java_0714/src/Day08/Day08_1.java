package Day08;

public class Day08_1 {//c s
	public static void main(String[] args) {//m s
		
	
		// java �� 100% ��ü���� ���
			// ��ü : Ŭ����������� ������� ���
				// Ŭ���� : ���赵
					// ��� Ŭ������ object Ŭ�����κ��� ���۵ȴ�
		
		// Ŭ����
			// 1.��� : �ʵ�, ������, �޼ҵ�
				// �ʵ� : ����, ��ü ��
				// ������ : �������, ��� �ʵ带 �޴� ������, 
				// �޼ҵ�[�Լ�] : �̸� ������� �ڵ�
					// 1. ��Ȱ�� �Ǵ� �ڵ� [ ������ ���Ǵ� �ڵ� ]
					// 2. �̸� �ۼ��� �ϳ��� �ڵ���� ����
					// 3. �μ��� ��ȯ
						// �μ� : �޼ҵ� ������ ������ ������
						// ��ȯ :	 �޼ҵ� ������ ������ ������ [ �޼ҵ峻 ��� �޸� �ʱ�ȭ => return ������]
					// 4. �޼ҵ� �ȿ��� ����Ǵ� �޸𸮴� �޼ҵ� ����� �ʱ�ȭ [ �޸� ȿ���� ��� ���� ]
		
		
		// 1. ȸ�����赵
			// ����[�ʵ�] : 1.���̵�  2. �г���  3. ��й�ȣ  4. �̸�  5. �̸���
			// ��ü�ʱⰪ[������] : ��ü ������ �ʵ��� �ʱ� �� ����
			// �ൿ[�޼ҵ�] : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.ȸ��Ż��
		
		// 2. �Խ��� ���赵
			// ����[�ʵ�] : 1.�г���  2. ��й�ȣ  3. ����  4. ����
			// ��ü�ʱⰪ[������] 
			// �ൿ[�޼ҵ�] : 1.�۾��� 2.�ۺ��� 3.�ۻ��� 4.�ۼ��� ��
		
		// ��1) ������� [ ��ü����� �ʵ忡 ������ x]
			// 1. ��ü ���� [ Ŭ������ ��ü��[����] = new ������(); ]
				// 1. new : ��ü ����� �޸� �Ҵ� ������
				// 2. ������() : Ŭ������ �����ڰ� ������� ������� �ڵ�
		
		Member member = new Member();
		
			// 2. ��ü�� ��� ���ٽ� [ .���ٿ����� ]
				// ��� : �ʵ�, ������, �޼ҵ�
		System.out.println(  member.id );
			member.id = "zxc";
			member.nickname = "zxc";
			member.password=1234;
			member.name = "zxc";
			member.email = "zxc@zxc";
		
		// ��2) ������ �̿��� ��ü ���� [ ��ü����� �̸� �ʵ忡 ������ �ֱ� ]
		
		Member member2 = new Member("asd","qwe",0,"dhq","a1b");
							// ������( �μ�1, �μ�2, �μ�3, �μ�4, �μ�5)
								// �μ� : ������ ������ ���� ������
		
		System.out.println( member2.id );
		
		
		// �� 3) ������ �̿��� ��ü ����2
		
		Member member3 = new Member("asd",446);
		
		System.out.println( member3.id );
		
		// �޼ҵ�
		// ��1 ) �޼ҵ� ȣ��
		System.out.println("ȸ��1 �޼ҵ� ȣ��");
		member.info();
		System.out.println("ȸ��2 �޼ҵ� ȣ��");
		member2.info();
		System.out.println("ȸ��3 �޼ҵ� ȣ��");
		member3.info();
		
		// ��2 ) ��ȯŸ���� �ִ� �޼ҵ� ȣ��
		
		String ã���̸��� = member.getemail();
		System.out.println(" getemail �޼ҵ忡 ���ϵ� ��� : "+ ã���̸��� );
		
		
		// ��3 ) �μ��� ��ȯ�� �ִ� �޼ҵ� ȣ��
		
		
		String ��� = member.setname("���缮");
		System.out.println(" ��� : "+ ��� + " ���ο� �̸� : " + member.name );
		
		// ��4 ) �μ��� �ִ� �޼ҵ� ȣ��
		
		member.setname("ert@ert");
		System.out.println(" ��� : " + member.email );
		
		
	}//m e
}//c e