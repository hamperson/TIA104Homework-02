package hw4;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
import java.util.Scanner;

public class Year {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("請輸入西元年yyyy");
		int yy = s.nextInt();
		System.out.println("請輸入月分mm");
		int mm = s.nextInt();
		System.out.println("請輸入日期dd");
		int dd = s.nextInt();
		
		s.close();
		
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if (isLeap(yy)) {
			days[1] = 29;
		}
		
		if (days[mm-1] < dd) {
			System.out.println("輸入錯誤");
			return;
		}
		
		
		int dayofyear = getDays(days, mm, dd);

		System.out.println(dayofyear + "天");

	}
	
	public static int getDays(int[]days, int mm, int dd) {
		
		int sum = 0;
		for (int i = 0; i < mm - 1; i++) {
			sum += days[i];
		}
		sum += dd;

		return sum;
	}

//	公元年份非4的倍數，為365天平年。
//	公元年份為4的倍數但非100的倍數，為366天閏年。
//	公元年份為100的倍數但非400的倍數（1700年、1800年及1900年）為平年。
//	公元年份為400的倍數（1600年及2000年）為閏年
	public static boolean isLeap(int yy) {
//		if (((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0)) {
//			return true;
//		} else {
//			return false;
//		}
		return ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0);
	}
}
