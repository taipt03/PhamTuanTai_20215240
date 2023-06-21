package hust.soict.ict.aims.Media;

import java.util.Comparator;

public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
	private int id;
	private String title;
	private String category;
	private float cost;

	public Media() {
		
	}
	
	public Media(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			System.out.println("Duplication found!");
			return true;
		}
		if (!(obj instanceof Media)) {
			return false;
		}
		return ((Media)obj).getTitle() == this.getTitle();
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	

	
	
}