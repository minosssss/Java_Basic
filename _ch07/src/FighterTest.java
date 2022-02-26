abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable { //인터페이스의 모든 메서드는 public abstract 생략
	void move(int x, int y);	//public abstract 생략
	void attack(Fightable f);	//public abstract 생략
}


class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙: 조상보다 접근제어자가 좁으면 안된다.
	//public을 안붙이면 default가 되며,
	public void move(int x, int y) {   
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter ft = new Fighter();
		Fightable f2 = ft.getFightable();
		
		
		Unit2 u = new Fighter();
		u.stop();
		u.move(100, 200);
//		u.attack();				//Unit2 에는 attack()이 없어서 호출불가
		
		
		Fightable f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
//		f.stop();				//Fightable 에는 stop()이 없어서 호출불가
		
	
	}

}
