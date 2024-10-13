package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
		
		a.setWidth(10);
		a.setDepth(20);
		a.getArea();
		
		MyRectangle r = new MyRectangle(10, 20);
		r.getArea();
	}
}
