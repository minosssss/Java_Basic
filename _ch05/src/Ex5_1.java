
public class Ex5_1 {

	public static void main(String[] args) {
		// �迭�� ���� - �迭�� �ٷ�� ���� ���� ������ ����
		// �迭�� �ε��� - �� ��ҿ� �ڵ����� �ٴ� ��ȣ
		
		int[] score = new int[5]; // �迭�� ����� ������ ���ÿ�
		score[3] = 100;
		
		int value = score[3];     //������ score[3]=100 �� ����
		System.out.println("value="+value);
		
		int arrayLength = score.length;
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.println(score[i]);
		}
	}

}
