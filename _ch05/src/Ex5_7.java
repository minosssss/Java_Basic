class Ex5_7 {
	public static void main(String[] args) {
		// args ���ڸ� ��������, Run Configurations �Ǵ� cmd���� class ���� ����
		System.out.println("�Ű������� ����:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}