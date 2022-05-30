package Rectangle;

public class Rectangle implements Comparison {
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
	
	protected double getArea() {
		return this.length * this.height;
	}

	public int Compare(Rectangle rec) {
		if(rec.getArea() > this.getArea()) {
			return 1;
		}else if (rec.getArea() < this.getArea()) {
			return -1;
		}else
		return 0;
	}
}

