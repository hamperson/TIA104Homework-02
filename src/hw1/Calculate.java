package hw1;

public class Calculate {
	
	public static void main(String[] args) {
		
//		計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println("和:" + a + b);
		System.out.println("積:" + a * b);

//		計算200顆蛋共是幾打幾顆
		int egg = 200, dozen = 12;
		int sum = egg / dozen;
		System.out.print("200顆雞蛋總共:" + sum + "打");
		System.out.println("又" + (sum - dozen) + "顆");
		
//		256559秒為多少天、多少小時、多少分與多少秒
		int second = 256559;
		int day = second / (60 * 60 * 24);
		
		second -= day * (60 * 60 * 24);
		int hour = (second / (60 * 60) );
		
		second -= hour * (60 * 60);
		int minute = second / 60 ;
		
		second -= minute * 60;
		int sec =  second;
				
		System.out.println("256559秒是" + day + "天" + hour + "時" + minute + "分" + "又" + sec + "秒");
	
		
//		半徑為5的圓面積與圓周長
		double pi = 3.1415;
		int radius = 5;
		System.out.printf("圓面積為:%.2f%n", Math.pow(radius, 2) * pi);
		System.out.printf("圓周長為:%.2f%n", radius * 2 * pi);
		
//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//		請用程式計算10年後，本金加利息共有多少錢
		int save = 150;
		double rate = 0.02;
		double qrate = 1 + rate;
		double fv= save * Math.pow(qrate, 10);
		System.out.printf("本金加利息是:%.2f萬\n", fv);
		
//		以字串模式印出5+5
		System.out.println("5 + 5");
//		因單引號內只有一個字元，所以可以直接寫在字串裡面
		System.out.println("5 + '5'");
//		因"是特殊字元，所以須先加上反斜線後再打雙引號
		System.out.println("5 + \"5\"");
	}
}
