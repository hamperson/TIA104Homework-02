package hw3;

import java.util.Scanner;

public class GameGuess {
	public static void main(String[] args) {
//		junior();
		advance();
		
	}
	
	public static void junior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int data = sc.nextInt();
		int i = (int) (Math.random() * 10);

		while (data != i) {
			if (data > 10 || data < 0) {
				System.out.println("輸入錯誤");
			} else {
				System.out.println("猜錯囉");
			}
			sc = new Scanner(System.in);
			data = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + i);
	}
	
	
	public static void advance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int data = sc.nextInt();
		int i = (int) (Math.random() * 100);

		while (data != i) {
			if (data > 100 || data < 0) {
				System.out.println("輸入錯誤");
			} else {
				if (i > data) {
					System.out.println("猜錯囉，答案大於"+data);
				} else {
					System.out.println("猜錯囉，答案小於"+data);
				}
			}
			sc = new Scanner(System.in);
			data = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + i);
	}
}
