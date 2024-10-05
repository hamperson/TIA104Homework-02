package hw3;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入:");
	int data1 = sc.nextInt();
	int data2 = sc.nextInt();
	int data3 = sc.nextInt();
	
	if (data1 <= 0 || data2 <= 0 || data3 <= 0) {
		System.out.println("不是正三角形");
		return;
	}
	
	int largest = data1;
	if (data2 > largest) {
		largest = data2;
	}
	if (data3 > largest) {
		largest = data3;
	}
	
	int sum = data1 + data2 + data3;
	if ((sum - largest) <= largest) {
		System.out.println("不是正三角形");
		return;
	}
	
	
	int a = 0;
	int b = 0;
	if (largest == data1) {
		a = data2;
		b = (sum-largest-a);
	}else if (largest == data2) {
		a = data1;
		b = data3;
	}else {
		a = data2;
		b = data1;
	}
	
	
	
		
	if(data1 == data2 && data2 == data3) {
		System.out.println("正三角形");
	}else if (data1 == data2 || data2 == data3 || data1 == data3) {
		System.out.println("等邊三角形");
	}else if (Math.pow(largest, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
		System.out.println("直角三角形");
	}else {
		System.out.println("其他三角形");
	}
	}

}
