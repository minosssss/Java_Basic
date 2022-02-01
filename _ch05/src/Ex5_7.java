class Ex5_7 {
	public static void main(String[] args) {
		// args 인자를 받으려면, Run Configurations 또는 cmd에서 class 파일 실행
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}