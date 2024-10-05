package hw3;

import java.util.Scanner;
public class Awen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文你討厭哪個數字");
		int data = sc.nextInt();
		
		if (data >= 10) {
			System.out.println("輸入錯誤");
	
			sc = new Scanner(System.in);
			System.out.println("阿文你討厭哪個數字");
			data = sc.nextInt();
		}
		
		int lotto;
		int count = 0;
		for (lotto = 1; lotto <= 49; lotto++) {
			int digits = lotto % 10;
			int ten = (lotto / 10) % 10;
			
			if (data != digits && data != ten) {
				System.out.print(lotto+ "\t");
				count++;
				if (count % 6 == 0) {
					System.out.println();
				}
			}
			
		}
		System.out.printf("總共有%d個數字可以選", count);
	}

}
