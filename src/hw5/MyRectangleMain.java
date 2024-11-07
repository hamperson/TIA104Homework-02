package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
//使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		a.setWidth(10);
		a.setDepth(20);
		a.getArea();

//使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		MyRectangle r = new MyRectangle(10, 20);
		r.getArea();
	}
}
