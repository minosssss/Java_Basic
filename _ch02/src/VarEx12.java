
public class VarEx12 {

	public static void main(String[] args) {
		String str = "3";
		
		// ���ڸ� ���ڷ�
		System.out.println(str.charAt(0) - '0'); 
		System.out.println('3' - '0' + 1);
		// �޼��带 �̿��Ͽ� ���ڿ��� ���ڷ�
		System.out.println(Integer.parseInt(str)+2);
		System.out.println(Double.parseDouble("3.4"));
		
		System.out.println("3" + 1);  // 1�� ���ڿ��� ��ȯ
		System.out.println(3 + '0');  // '0'�� ���ڷ� 48
		
		System.out.println((char) (3 + '0'));  // �� ��ȯ
		/*
		 * 1. ���ڿ� ���ڰ� ��ȯ
		 * ���ڿ��� ���ڷ� �ٲ� ���� +'0'
		 * ���ڿ��� ���ڷ� �ٲ� ���� -'0'
		 * 
		 * 2. ���ڿ��� ��ȯ
		 * ����, ���� ������� ���ڿ��� ���Ѵ� +""
		 * 
		 * 3. ���ڿ� > ����
		 * "3" -> 3
		 * �޼���Ȱ�� -> Integer.parseInt("3");
		 * "3.4" -> 3.4
		 * �޼���Ȱ�� -> Double.parseDouble("3.4");
		 * 
		 * 4. ���ڿ����� ���ڷ�
		 * "3" -> '3'
		 * �޼���Ȱ�� -> "3".charAt(0);
		 */
	}

}
