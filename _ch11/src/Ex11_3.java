import java.util.*;

public class Ex11_3 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) {
					System.out.println("빈 값입니다.");
					continue;
				}
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " 
										+ MAX_SIZE + "개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")){
//					save(input);
					
					LinkedList tmp = (LinkedList) q;
//					int i = 0;
//					ListIterator iter = tmp.listIterator();
//					
//					while(iter.hasNext())
//						System.out.println(++i+"."+iter.next());
					
					final int SIZE = tmp.size();
					for (int i=0; i<SIZE; i++)
						System.out.println((i+1)+"."+tmp.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		}
		
		

	}

	private static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input))
			q.offer(input);
		
		// queue의 최대크기를 넘으면 제일 처음 입려된 것을 삭제 한다.
		if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
			q.remove();
	}

}
