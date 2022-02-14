
class Time {
	private int hour;  // 0~23 사이의 값을 가져야 함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isValiidHour(hour)) return;
		
		this.hour = hour;
	}
	
	// 메서드 바로 추가 alt+shift+M
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드 
	private boolean isValiidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}


public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21);
		System.out.println(t.getHour());
				

	}

}
