package hw10;

//用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數
public class Homework10_1 {
	public static void main(String[] args) {

		for (int s = 0; s < 5; s++) {
			int i = (int) (Math.random() * 100) + 1;

			if (isPrime(i)) {
				System.out.println(i + "是質數");
			} else {
				System.out.println(i + "不是質數");
			}
		}

	}

	private static boolean isPrime(int n) {
		// 1及以下的數字不是質數
		if (n <= 1) {
			return false;
		}
		// 偶數不是質數
		if (n % 2 == 0) {
			return false;
		}
		
		// 2是質數
		if (n == 2) {
			return true;
		}
		
		//Math.sqrt 計算n的平方根
		for (int j = 3; j <= Math.sqrt(n); j += 2) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}
}
