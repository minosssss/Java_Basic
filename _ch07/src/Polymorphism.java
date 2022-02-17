
class Tv {
		// 속성: 크기, 길이, 높이, 색상, 볼륨, 채널 등
		String color;  // 색깔
		boolean power; // 전원상태
		int channel;   // 채널
		
		// 기능: 켜기, 끄기, 볼륨, 높이기, 볼륨 낮추기, 채널 변경 등
		void power()        { power = !power; }
		void channelUp()    { channel++; }
		void channelDown()  { channel--; }
}

class SmartTv extends Tv {  // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 한다.
	boolean caption;    	// 캡션 상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡셩 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
public class Polymorphism {
	public static void main(String args[]) {
	SmartTv s = new SmartTv();
	s.channel = 2;
	s.channelUp();
	s.power();
	System.out.println(s.caption);
	s.displayCaption("TEST");
	s.caption = true;
	s.displayCaption("HI?~");
	System.out.println(s.caption);
	System.out.println(s.channel);
	System.out.println(s.power);
	}
		
}

