
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c);
		/*
		 * ��� -145479936
		 * 
		 * c = 2,000,000,000,000 �̸�, 10^12
		 * ������, int�� 10^9�̱� ������ �����÷ο� �߻�
		 * 
		 * a�� b�� LongŸ������ ����ȯ�Ͽ� �����ϸ� (�Ѵ��ص�����)
		 * �� �������� Ÿ���� ���� ��ġ ��Ű�Ƿ� (���� ū Ÿ������)
		 * �ǿ������� Ÿ���� Long���� �ٲ�� ���ȴ�.
		 * 
		 */
		
		long d = (long)a * b;
		
		System.out.println(d);
	}

}
