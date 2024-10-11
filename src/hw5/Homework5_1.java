package hw5;

import java.util.Scanner;

public class Homework5_1 {
	public static void main(String[] args) {
//		當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬、高");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
		
//		從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		randAvg();
		
		sc.close();
	}
	
	public static void starSquare(int width,int height) {
		for(int i = 0; i < height; i++) {
			for (int j = 0; j< width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void randAvg() {
		
		int[] ten = new int[10];
		
		for(int i = 0; i < ten.length; i++) {
			int rand = (int)(Math.random()*100);
			if (i==0) {
				System.out.println("本次亂數結果：");
			}
			ten[i]=rand;
			System.out.print(ten[i]+" ");
		}
		int sum = 0;
		for(int i = 0; i < ten.length; i++) {
			sum += ten[i];
		}
		int avg = sum / ten.length;
		System.out.println("\n" + "平均值："+ avg);
	}
	
}