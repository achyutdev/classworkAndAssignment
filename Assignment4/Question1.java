/*
 * Consider the following class:

            public class IdentifyMyParts

                        {

                                    public static int x = 7; 

                                     public int y = 3; 

                        }

    What are the class variables?
    What are the instance variables?
    What is the output from the following code:

d.    IdentifyMyParts a = new IdentifyMyParts();

e.    IdentifyMyParts b = new IdentifyMyParts();

f.     a.y = 5;

g.    b.y = 6;

h.    a.x = 1;

i.     b.x = 2;

j.     System.out.println("a.y = " + a.y);

k.    System.out.println("b.y = " + b.y);

l.     System.out.println("a.x = " + a.x);

m.  System.out.println("b.x = " + b.x);

System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
 * 
 */

//Answer a) Class variable is a variable which is a properties of class.
//	in above example x is class variable.
// b) the variable which is property of object call instance variable.
//		y is a intance variable
// Output:
//a.y = 5
//b.y = 6
//a.x = 2
//b.x = 2
//IdentifyMyParts.x = 2

class IdentifyMyParts

{

	public static int x = 7;
	public int y = 3;

}

public class Question1 {

	public static void main(String[] args) {
		IdentifyMyParts a = new IdentifyMyParts();
		IdentifyMyParts b = new IdentifyMyParts();
		a.y = 5;
		b.y = 6;
		a.x = 1;
		b.x = 2;
		System.out.println("a.y = " + a.y);
		System.out.println("b.y = " + b.y);
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
	}

}
