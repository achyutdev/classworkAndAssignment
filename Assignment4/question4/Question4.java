/*
 * Create a class called MyPoint, which models a 2D point with x and y coordinates, class contains:

Two instance variables x (int) and y (int).

A "no-argument" (or "no-arg") constructor that construct a point at (0, 0).

A constructor that constructs a point with the given x and y coordinates.

Getter and setter for the instance variables x and y.

A method setXY() to set both x and y.

A toString() method that returns a string description of the instance in the format "(x, y)".

A method called distance(int x, int y) that returns the distance from this point to another 
point at the given (x, y) coordinates.
 */

package question4;

class MyPoint{
	private int x;
	private int y;
	
	public MyPoint(){
		this.x=0;
		this.y=0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
		return("("+this.x+","+this.y+")");
	}
	
	public double distance(int x, int y){
		return Math.sqrt(Math.pow((this.x-x), 2)+Math.pow((this.y-y), 2));
	}
}

public class Question4 {

	public static void main(String[] args) {
		
//		(x1,y1) = (4,5)
		MyPoint codinate1 = new MyPoint(4, 5);
		System.out.println(codinate1);   //is similar to codinate1.toString
		
//		distance between (4,5)  and (2,-3)
		System.out.println(codinate1.distance(2, -3));
		

//		using default constructor - which default codinate is (0,0)
		MyPoint codinate2 = new MyPoint();
		System.out.println(codinate2.toString());
		
//		distance between (6,-8)
		System.out.println(codinate2.distance(6, -8));
	}

}
