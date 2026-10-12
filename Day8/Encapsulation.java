class Person{
	private int age;
	private String name;
	
	Person(){
		
	}
	Person(String name, int age){ //constructor
		this.name = name;
		this.age = age;
	}	
	public int getAge(){ //getter method
		return age;
	}	
	public void setAge(int age){ //setter method
		this.age = age;
	}
	public String getName(){ //getter method
		return name;
	}	
	public void setName(String name){ //setter method
		this.name = name;
	}
}
class Encapsulation{
	public static void main(String args[]){
		Person ob = new Person();
		ob.setAge(10);
		System.out.println(ob.getAge());
		//Q1: Create object p1 by passing age 
		//and name as arguments to the constructor
		Person p1 = new Person("Tony",24);
		System.out.println("The name is:"+p1.getName()+ " and the age is: "+p1.getAge());
	}
}