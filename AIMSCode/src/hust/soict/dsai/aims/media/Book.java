package hust.soict.dsai.aims.media; 
import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName) == true) {
			System.out.printf("The author %s is already on the list\n", authorName);
			return;
		} 
		authors.add(authorName);
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName) == false) {
			System.out.printf("There is no author %s on the list to remove\n", authorName);
			return;
		}
		authors.remove(authorName);
	}
}
