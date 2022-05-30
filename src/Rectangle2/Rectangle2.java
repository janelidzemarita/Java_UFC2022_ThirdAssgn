package Rectangle2;


public class Rectangle2 implements Comparison{
	private double length;
	private double height;
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getHigth() {
		return height;
	}
	
	public void setHigth(double higth) {
		this.height = higth;
	}
	
	protected double getPerimeter () {
		return  this.length *2 + this.height * 2;
	}

	public int Compare(Rectangle2 rec1, Rectangle2 rec2) {
		if(rec1.getPerimeter() > rec2.getPerimeter()) {
			return 1;
		}else if (rec1.getPerimeter() < rec2.getPerimeter()) {
			return -1;
		}else
		return 0;
	}
	
}


