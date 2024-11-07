package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

/*請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
 * (1)千分位(2)百分比(3)科學記號*/
public class Homework10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("請輸入數字:");
			double i = sc.nextDouble();
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
			int s = sc.nextInt();

			switch (s) {
			case 1:
				Format dfm1 = new DecimalFormat("#,###.00");
				System.out.println(dfm1.format(i));
				break;

			case 2:
				Format dfm2 = new DecimalFormat("#.##%");
				System.out.println(dfm2.format(i));
				break;
			case 3:
				Format dfm3 = new DecimalFormat("0.###E00");
				System.out.println(dfm3.format(i));
				break;

			default:
				System.out.println("格式選項不正確，請輸入 1, 2 或 3");

			}
		} catch (InputMismatchException e) {
			System.out.println("格式不正確，請再輸入一次!");
		} finally {
			sc.close();
		}

	}
}
