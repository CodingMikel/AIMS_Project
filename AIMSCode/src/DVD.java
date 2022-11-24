
public class DVD {
	private int ID;
	private String title;
	private String category;
	private double cost;
	private String director;
	private int length;
	
	public DVD(String title) {
		super();
		this.title = title;
	} 
	
	public DVD(String title, String category, double cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DVD(String title, String category, double cost, String director) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	public DVD(String title, String category, double cost, String director, int length) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getCost() {
		return cost;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
