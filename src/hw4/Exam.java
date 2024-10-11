package hw4;

//請算出每位同學考最高分的次數
public class Exam {
	public static void main(String[] args) {
		int[][] cc = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		//int one = 0;
		//int two = 0;
		//int three = 0;
		//int four = 0;
		//int five = 0;
		//int six = 0;
		//int seven = 0;
		//int eight = 0;

		//從0開始記錄每位同學最高分次數
		int [] students = {0, 0, 0, 0, 0, 0, 0, 0};
		
		//判斷每次考試的最高分數
		for (int i = 0; i < cc.length; i++) {
			int highestScore = 0;
		//	int who = 0;
			for (int j = 0; j < cc[i].length; j++) {
				if (cc[i][j] >= highestScore) {
					highestScore = cc[i][j];
		//			who = j;
				}
			}
			
			//如果最高分分數重複，則個別同學的最高分次數都加一
			for (int j = 0; j < cc[i].length; j++) {
				if (cc[i][j] == highestScore) {
					students[j]++;
				}
			}
		//	students[who]++;
			
		//	if (who == 0) {
		//		one++;
		//	} else if (who == 1) {
		//		two++;
		//	} else if (who == 2) {
		//		three++;
		//	} else if (who == 3) {
		//		four++;
		//	} else if (who == 4) {
		//		five++;
		//	} else if (who == 5) {
		//		six++;
		//	} else if (who == 6) {
		//		seven++;
		//	} else if (who == 7) {
		//		eight++;
		//	}
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println((i+1)+"號同學考最高分次數:"+students[i]);
		}
		
		
		//System.out.println(one);
		//System.out.println(two);
		//System.out.println(three);
		//System.out.println(four);
		//System.out.println(five);
		//System.out.println(six);
		//System.out.println(seven);
		//System.out.println(eight);

	}

}
