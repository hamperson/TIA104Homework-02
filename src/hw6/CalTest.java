package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值:");
				int xx = sc.nextInt();
				System.out.println("請輸入y的值:");
				int yy = sc.nextInt();
				sc.close();
				
				Calculator c = new Calculator(xx, yy);
				System.out.println(c.powerXY(xx, yy));
				break;
				
			} catch (CalException aa) {
				System.out.println(aa.getMessage());
			}
			
		}
	}
}
