package hust.soict.ict.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
	
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public Book(int id, String title, String category, float cost, ArrayList<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

    public void addAuthors(String authorName){
        if (authors.contains(authorName)){
            System.out.println("The author has already existed\n");
        }
        else {
        authors.add(authorName);
        System.out.println("Author named: " + authorName +" has been added\n");
        }
    }

    public void removeAuthors(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("The author named: " + authorName + " has been removed\n");
        }
        else {
            System.out.println("The author doesnot exist\n");
        }

    }

}  

