package hw2;

public class LoopTest {

	public static void main(String[] args) {

//		計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for (int even = 1; even <= 1000; even++) {
			if (even % 2 == 0) {
				sum += even;
			}
		}
		System.out.println(sum);

//		計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		sum = 1;
		for (int num = 1; num <= 10; num++) {
			sum *= num;
		}
		System.out.println(sum);

//		計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		sum = 1;
		int num = 1;
		while (num <= 10) {
			sum *= num;
			num++;
		}
		System.out.println(sum);

//		輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++) {

			if	(i == 10) {
				System.out.println(i * i);
			}else {
				System.out.print(i * i + " ");
			}
			
		}

//		大樂透(1 ～ 49)，不能有4的數字，可以選擇的數字有哪些？總共有幾個？
		System.out.println("可以選的數字有:");
		int lotto;
		int count = 0;
		for (lotto = 1; lotto <= 49; lotto++) {
			int digits = lotto % 10;
			int ten = (lotto / 10) % 10;

			if (digits != 4 && ten != 4) {
				
				System.out.print(lotto + " ");
				
				count++;
			}

		}

		System.out.println();
		System.out.println("總共有" + count + "個");

//		印出數字圖形
		for (int toOne = 10; toOne >= 1; toOne--) {
			for (int lenght = 1; lenght <= toOne; lenght++) {
				System.out.print(lenght + " ");
			}

			System.out.println();
		}

//		印出ABC圖形
		char letter = 'A';
		for (int abc = 1; abc <= 6; abc++) {
			for (int cde = 1; cde <= abc; cde++) {
				System.out.print(letter);
			}
			System.out.println();
//			letter = (char) ((int)letter + 1);
			letter++;
		}

	}

}
