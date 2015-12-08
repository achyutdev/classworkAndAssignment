/*
 * Write an interface called draw object to implement the draw(),resize(), calculatearea() of 
 * different shapes depend on the type of object implementing it i.e. Rectangle, Circle, Square, Triangle.
 */

 

package question2;

import java.util.Scanner;

class Rectangle implements Draw{
	
	private double length;
	private double width;

	@Override
	public void draw() {
		System.out.println("\n\n\nDrawing Rectrangle");
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
		this.length=length;
		this.width=width;
		System.out.println("Rectangle draw. Successfull !");
	}

	@Override
	public void resize() {
		System.out.println("Resize Rectangle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = input.nextInt();
		System.out.print("\nEnter width : ");
		double width = input.nextInt();
		this.length=length;
		this.width=width;
		System.out.println("Resizeing Done!");
	}

	@Override
	public void calculateArea() {
		double area = length*width;
		System.out.println("Area : "+area);
	}

	@Override
	public void calulatePrimeter() {
		double perimeter = 2*(length+width);;
		System.out.println("Perimeter : "+perimeter);
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
// Circle class 
class Circle implements Draw{
	private double radius;
	
	
	@Override
	public void draw() {
		System.out.println("\n\n\nDrawing Circle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double radius = input.nextInt();
	   System.out.println("Cricle drawn Successfully.");
		
	}

	@Override
	public void resize() {
		System.out.println("Resize Circle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double radius = input.nextInt();
		this.radius=radius;
		System.out.println("Resizeing Done!");
	}

	@Override
	public void calculateArea() {
		System.out.println("Area : "+Math.PI*radius*radius);
		
	}

	@Override
	public void calulatePrimeter() {
		System.out.println("Perimeter : "+ 2*Math.PI*radius);
		
	}
	
}

class Square implements Draw{
	private double length;
	
	@Override
	public void draw() {
		System.out.println("\n\n\nDrawing Square");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = input.nextInt();
		System.out.print(" _________\n");
		System.out.print("|        |\n");
		System.out.print("|        |\n");
		System.out.print("|        |\n");
		System.out.print(" ---------\n\n");
		this.length=length;
		System.out.println("Square draw. Successfull !");
	}

	@Override
	public void resize() {
		System.out.println("Resize Square");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = input.nextInt();
		this.length=length;
		System.out.println("Resizeing Done!");
	}

	@Override
	public void calculateArea() {
		System.out.println("Area : "+length*length);
		
	}

	@Override
	public void calulatePrimeter() {
		System.out.println("Perimeter : "+4* length);
	}
	
}
class Tringle implements Draw{
	
	private double base;
	private double hight;

	@Override
	public void draw() {
		System.out.println("\n\n\nDrawing Tringle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length of Base: ");
		double base=input.nextInt();
		System.out.print("Enter Hight: ");
		double hight=input.nextInt();
		System.out.println("|\\");
		System.out.println("|  \\");
		System.out.println("|    \\");
		System.out.println("|      \\");
		System.out.println("|        \\");
		System.out.println("|          \\");
		System.out.println("-------------");
		
		this.base=base;
		this.hight=hight;
		System.out.println("Tringle drawn Successfull.");
	}

	@Override
	public void resize() {
		System.out.println("Resize tringle");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length of Base: ");
		double base=input.nextInt();
		System.out.print("Enter Hight: ");
		double hight=input.nextInt();
		this.base=base;
		this.hight=hight;
		System.out.println("Resizeing Done!");
	}

	@Override
	public void calculateArea() {
		System.out.println("Area :"+0.5*base*hight);
	}

	@Override
	public void calulatePrimeter() {
		System.out.println("Calculating ...");
	}

}

public class Question2 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.draw();
		rec.resize();
		rec.calculateArea();
		rec.calulatePrimeter();
		
		Circle circle = new Circle();
		circle.draw();
		circle.resize();
		circle.calculateArea();
		circle.calulatePrimeter();
		
		
		Square sqr = new Square();
		sqr.draw();
		sqr.resize();
		sqr.calculateArea();
		sqr.calulatePrimeter();
		
		Tringle tri = new Tringle();
		tri.draw();
		tri.resize();
		tri.calculateArea();
		tri.calulatePrimeter();
	}

}
