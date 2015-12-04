/*
 * Write an interface called draw object to implement the draw(),resize(), calculatearea() of 
 * different shapes depend on the type of object implementing it i.e. Rectangle, Circle, Square, Triangle.
 */

package question8;

import java.util.Scanner;

class Rectangle implements Draw{
	
	private double length;
	private double width;
	
	public void setSides(double l,double w){
		length = l;
		width  = w;
	}

	@Override
	public void draw() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = input.nextInt();
		System.out.print("\nEnter width : ");
		double width = input.nextInt();
		System.out.print(" ____________\n");
		System.out.print("|           |\n");
		System.out.print("|           |\n");
		System.out.print("|           |\n");
		System.out.print(" ------------\n\n");
		System.out.println("Rectangle draw. Successfull !");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calulatePrimeter() {
		// TODO Auto-generated method stub
		
	}

//	Getter and Setter 
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
}

class Circle implements Draw{
	private double radius;
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calulatePrimeter() {
		// TODO Auto-generated method stub
		
	}
	
}

class Square implements Draw{
	private double length;
	
	@Override
	public void draw() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = input.nextInt();
		System.out.print(" _________\n");
		System.out.print("|        |\n");
		System.out.print("|        |\n");
		System.out.print("|        |\n");
		System.out.print(" ---------\n\n");
		System.out.println("Square draw. Successfull !");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calulatePrimeter() {
		// TODO Auto-generated method stub
		
	}
	
}
class Tringle implements Draw{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calulatePrimeter() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Question8 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.draw();
	}

}
