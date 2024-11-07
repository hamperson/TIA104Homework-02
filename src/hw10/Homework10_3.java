package hw10;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成
(1)年/月/日(2)月/日/年(3)日/月/年三選一*/
public class Homework10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validDate = false;

		while (!validDate) {
			System.out.println("請輸入日期(年月日，例如:20110131):");
			String i = sc.nextLine();
			if (i.matches("\\d{8}")) {
				try {
					SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
					input.setLenient(false);
					Calendar cal = Calendar.getInstance();
					cal.setTime(input.parse(i));

					int m = cal.get(Calendar.MONTH) + 1;
					int d = cal.get(Calendar.DAY_OF_MONTH);

					int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

					if (m < 1 || m > 12) {
						System.out.println("月份輸入錯誤");
						continue;
					}

					if (d < 1 || d > maxDay) {
						System.out.println("日期輸入錯誤");
						continue;
					}

					validDate = true;

					System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
					int trans = sc.nextInt();

					switch (trans) {
					case 1:
						Format sfm1 = new SimpleDateFormat("yyyy/MM/dd");
						System.out.println(sfm1.format(cal.getTime()));
						break;

					case 2:
						Format sfm2 = new SimpleDateFormat("MM/dd/yyyy");
						System.out.println(sfm2.format(cal.getTime()));
						break;

					case 3:
						Format sfm3 = new SimpleDateFormat("dd/MM/yyyy");
						System.out.println(sfm3.format(cal.getTime()));
						break;
					default:
						System.out.println("格式選項不正確，請輸入 1, 2 或 3");

					}

				} catch (Exception e) {
					System.out.println("日期格式無效，請檢查輸入!");
				}
			} else {
				System.out.println("日期格式輸入不正確，請再輸入一次");
			}
		}

		sc.close();
	}
}
