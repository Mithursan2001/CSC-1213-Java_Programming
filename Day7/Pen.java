/* Q3: Create a class Pen which has attributes color and 
type (gel/ballpoint) and a method write()
Create a parameterized constructor.
Create 2 objects of pen class ob1:blue gel ob2: red ballpoint

*/
public class Pen{
	String color;
	String type;
	
	Pen(){
		
	}	
	Pen(String color, String type){
		this.color = color;
		this.type = type;
	}	
	public void write(){
		System.out.println("Hi!");
	}	
	public static void main(String args[]){
		Pen ob = new Pen();
		ob.write();
		ob.color = "Blue";
		ob.type = "Gel";
		System.out.println(ob.color);
		Pen ob2 = new Pen("red","Ball point");
		System.out.println(ob2.color);
	}	
} /*
Q4: Create a class Shape
Attributes length, width, radius ......Method: findArea, findPerimeter
Create a Shape object RECT by passing length and width values 
Create another Shape object SQUARE which takes length only
Create another Shape object CIRCLE which takes radius value
