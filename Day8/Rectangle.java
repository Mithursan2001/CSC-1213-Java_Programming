/* Write a java program to create a class called Rectangle
with width and height as private attributes
with findArea, findPermeter as methods 

*/
class Rectangle{
	private int width;
	private int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getWidth(){  //getter for width
		return width;
	}
	public void setWidth(int width){	//setter for width
		this.width = width;
	}	
	public int getHeight(){	//getter for height
		return height;
	}
	public void setHeight(int height){ //setter for height
		this.height = height;
	}	
	public int findArea(){ //method findArea()
		return width * height;
	}
	public int findPerimeter(){ //method findPermeter()
		return 2*(width+height);
	}
}