import java.util.*;

public class Ex10_1 {

	public static void main(String[] args) {
		Calendar thisYear = Calendar.getInstance();
		System.out.println("올해: " + thisYear.get(Calendar.YEAR));
		
		Calendar lastYear = Calendar.getInstance();
		lastYear.add(Calendar.YEAR, -1);
		System.out.println("작년: " + lastYear.get(Calendar.YEAR));
		
		thisYear.add(Calendar.MONTH, +1); // 월(0~11, 0:1월)
		System.out.println("지금 몇 월 몇 일: "
		+ thisYear.get(Calendar.MONTH) 	+ "월"
		+ thisYear.get(Calendar.DATE) 	+ "일");
		System.out.println("시간(0~11): " + thisYear.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + thisYear.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " 	 + thisYear.get(Calendar.MINUTE));
		System.out.println("초(0~59): " 	 + thisYear.get(Calendar.SECOND));
		System.out.println("이 달의 마지막 날: " 
	            + thisYear.getActualMaximum(Calendar.DATE) ); // 이 달의 마지막 일자.
	}

}
