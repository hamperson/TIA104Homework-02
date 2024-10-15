package hw6;

public class Calculator {

	public static int powerXY(int x, int y) throws CalException {
		if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} 
		int r = (int) Math.pow(x, y);
		return r;
	}

}
