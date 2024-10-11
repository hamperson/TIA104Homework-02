package hw3;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {

	private double[] num;

	public static void main(String[] args) {
		Triangle a = new Triangle();
		a.setNum();
		a.isTriangle();
		
		
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(){
			num = new double[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入:");
			for (int i = 0; i < 3; i++) {
				num[i] = sc.nextDouble();
			}
			Arrays.sort(num);
			sc.close();
	}

	
	public void isTriangle() {
		if(num[0]<=0||num[1]<=0||num[2]<=0) {
			System.out.println("不是三角形");
			return;
			}
		if(num[0]+num[1]>num[2]) {
			if (num[0] == num[1] && num[1] == num[2]) {
				System.out.println("正三角形");
			} else if (num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
				System.out.println("等邊三角形");
			} else if (Math.pow(num[2], 2) == Math.pow(num[0], 2) + Math.pow(num[1], 2)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
	}
}