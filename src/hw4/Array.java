package hw4;

public class Array {
	public static void main(String[] args) {
//		輸出此陣列所有元素的平均值與大於平均值的元素
		int[] iArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

		int sum = 0;
		for (int i = 0 ; i < iArray.length; i++) {
			sum += iArray[i];
			
		}
		double average = (double)sum / iArray.length;
		System.out.println(average);
		
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
		
		String s = "Hello World";		
			for (int i = s.length()-1; i>= 0; i--) {
				char last = s.charAt(i);
				
				System.out.print(last);
			}
			
//			有個字串陣列如下 (八大行星):
//			{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//			請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
			
			String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
			
			int count = 0;
			for (int i = 0 ; i < planet.length; i++) {
				String p = planet[i];
				
				for (int j = 0; j < p.length(); j++) {
					char c = p.charAt(j);
				
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count ++;
					}
				}
			}
			System.out.println(count);
			
	}
}
