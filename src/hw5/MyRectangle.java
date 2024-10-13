package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {}
	
	public MyRectangle(double width, double depth) {
//		this.width = width;
//		this.depth = depth;
		setWidth(width);
		setDepth(depth);
	}
	
	public double getArea() {
		double area = width * depth;
		System.out.println(area);
		return area;
	}
	
	public void setWidth(double width) {
		if (width > 0 ) {
			this.width = width;
		} else {
			System.out.println("width錯了");
		}
	}
	
	public void setDepth(double depth) {
		if (depth > 0 ) {
			this.depth = depth;
		} else {
			System.out.println("depth錯了");
		}
	}
}
