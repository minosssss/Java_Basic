import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		DecimalFormat df  = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.print("문자열 1,234,567.89" + " -> ");
			
			double d = num.doubleValue();
			System.out.print("숫자변환" + d + " -> ");
			
			System.out.println("지수변환" + df2.format(num));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
