import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer: //while문 이름 지정
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmpNum = scanner.nextLine();
			menu = Integer.parseInt(tmpNum);
			
			if (menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)");
				continue;
			}
			
			for(;;) {
				System.out.println("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99)");
				tmpNum = scanner.nextLine();
				num = Integer.parseInt(tmpNum);
				
				if (num==0)
					break;
				if (num==99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("result="+ num*num);
					break;
				case 2:
					System.out.println("result="+ Math.sqrt(num));
					break;
				case 3:
					System.out.println("result="+ Math.log(num));
					break;
				}
			} //for(;;)
		} //while(outer) 끝
		System.out.println("프로그램이 종료되었습니다.");
	} 

}