package hw2;

public class Table {

	public static void main(String[] args) {

//	  第一個解法
		for (int i = 1; i <= 9; i++) {
			int y = 1;

			while (y <= 9) {
				System.out.print(i + "*" + y + "=" + i * y + "\t");
				y++;
			}

			System.out.println();
		}

//	  第二個解法

		for (int i = 1; i <= 9; i++) {

			int u = 1;

			do {
				System.out.print(i + "*" + u + "=" + i * u + "\t");
				u++;
			} while (u <= 9);

			System.out.println();

		}

		// 第三種解法

		int y = 1;

		while (y <= 9) {
			int d = 1;

			do {
				System.out.print(y + "*" + d + "=" + y * d + "\t");
				d++;
			} while (d <= 9);

			System.out.println();

			y++;
		}

	}

}
