package hw4;

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
	
	
	}
//	公元年份非4的倍數，為365天平年。
//	公元年份為4的倍數但非100的倍數，為366天閏年。
//	公元年份為100的倍數但非400的倍數（1700年、1800年及1900年）為平年。
//	公元年份為400的倍數（1600年及2000年）為閏年
	public void leap(int yy) {
		if ((yy%4 == 0 && yy%100 != 0 )|| yy%400 == 0) {
			
		}
	}
}
