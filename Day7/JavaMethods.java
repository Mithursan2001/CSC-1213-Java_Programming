class JavaMethods{
	//method
	int a=5, b=8;
	public int sum(){
		return a+b;
	}
	public void message(){
		--a;
	}
	
	public static void main(String args[]){
		JavaMethods ob = new JavaMethods();
		System.out.println(ob.sum());
		ob.message();
		System.out.println(ob.a);
	}
}