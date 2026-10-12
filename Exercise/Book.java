class Book{

	public String title;
	public String author;
	public boolean availablity;
	
	public Book(String title, String author, boolean availability) {
        this.title = title;
        this.author = author;
        this.availability = availability;
    }
	
	public String gettitle(){
		return title;
	}
	
	public String getauthor(){
		return author;
	}
	
	public boolean getavailability(){
		return availability;
	}
	
	public void settitle(String title){
		this.title=title;
	}
	
	public void setauthor(String author){
		this.author=author;
	}
	
	public void setavailability(String availability){
		this.availability=availability;
	}
	
}