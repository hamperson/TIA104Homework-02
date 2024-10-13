package hw5;

public class Howework5_4 {
	public static void main(String[] args) {
//		System.out.println((int) '0');
//		System.out.println((int) '9');
//		System.out.println((int) 'A');
//		System.out.println((int) 'Z');
		
		System.out.println("本次隨機產生驗證碼為:" + genAuthCode());

	}

	public static String genAuthCode() {
		String auth = "";
		for (int i = 0; i < 8; i++) {
			//0~9, a~z, A~Z 三組隨機排序
			int lots = (int) (Math.random() * 3);
			int code = 0;

			switch (lots) {
			case 0:
				//0~9的char編碼
				code = (int) (Math.random() * 10) + 48;
				break;
			case 1:
				//a~z的char編碼
				code = (int) (Math.random() * 26) + 97;
				break;
			case 2:
				//A~Z的char編碼
				code = (int) (Math.random() * 26) + 65;
				break;

			}

			auth += (char) code;

		}
		
		return auth;
		
	}
}
