
public class VarEx4 {

	public static void main(String[] args) {
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; //1. x�� ���� tmp�� ����
		x = y; 	 //2. y�� ���� x�� ����
		y = tmp; //3. tmp�� ���� y�� ����
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

/* Java�� �����͸� �ٷ�� �ּ� ������ 1byte = 8bit
 * �⺻�� 8����Ÿ��
 * ����_boolean(1byte) 		-> true�� false�� �ϳ��� ���� ����
 * ������_char(2byte)    		-> '��' '��' �� ���ڸ� ���� ����
 * ������_byte(1) short(2) 
 * 		int(4) long(8)		-> int(4byte)�� �ַ� ���Ǹ�, long�� ���� ū ����
 * �Ǽ���_float(4) double(8)	-> �ε��Ҽ��� ����		 
 * 
 * ������ Ÿ��
 * ������ �⺻���� ������ ������ String System
 * Date today; //������ ���� today�� ����
 * today = new Date(); 
 * //new Date(); -> ��ü���� 
 * //today = new Date(); -> today�� ��ü�� �ּҸ� ����
 */
