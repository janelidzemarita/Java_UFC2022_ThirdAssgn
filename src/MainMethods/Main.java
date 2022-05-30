package MainMethods;

import Rectangle2.Rectangle2;
import Rectangle.Rectangle;


public class Main {
	public static void main(String[] args){
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		Rectangle2 rectangle2 = new Rectangle2();
		Rectangle2 rectangle4 = new Rectangle2();
		
		rectangle1.setHigth(15.9);
		rectangle1.setLength(53.8);
		
		rectangle2.setHigth(9.8);
		rectangle2.setLength(21.2);
		
		rectangle3.setHigth(12.3);
		rectangle3.setLength(42.3);
		
		rectangle4.setHigth(15.7);
		rectangle4.setLength(33.5);
		
		
		System.out.println("First Rectangle Comparison result: " + rectangle1.Compare(rectangle3));
		System.out.println("Second Rectangle Comparison result: " +rectangle2.Compare(rectangle4, rectangle2));
		
    }

}


