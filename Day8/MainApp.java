/* create a class called MainApp 
1 


Create ob1 of Rectangle class by passing 
width=3, height=6 as arguments to the constructor
Find area and perimeter of ob1
 */
class MainApp{
	public static void main(String args[]){
		Rectangle ob1 = new Rectangle(5,7);
		System.out.println("The area of ob1: "+ob1.findArea());
		System.out.println("The perimeter of ob1: "+ob1.findPerimeter());
		
		//Q2: set the width to 7 and height to 9
		ob1.setWidth(7);
		ob1.setHeight(9);		
		//now calculate the area and perimeter
		System.out.println("The area of ob1 now: "+ob1.findArea());
		System.out.println("The perimeter of ob1 now: "+ob1.findPerimeter());
	}
}