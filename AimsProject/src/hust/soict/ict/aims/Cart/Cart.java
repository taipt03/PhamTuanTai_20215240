package hust.soict.ict.aims.Cart;
import java.util.ArrayList;

import hust.soict.ict.aims.Media.Media;



public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObervableList<Media> itemsOrdered = new ArrayList<>();

	public void addMedia(Media add){
		if (itemsOrdered.size()<MAX_NUMBERS_ORDERED){
			itemsOrdered.add(add);
		}
		else {
			System.out.println("Exceed maximum capacity\n");
		}
	}
	public void removeMedia(Media rm){
		if(itemsOrdered.isEmpty()) {
			System.out.println("The cart is empty.");
		}
		else if (!itemsOrdered.contains(rm)) {
			System.out.println("The media you want to remove is not in the cart.");
		}
		else {
			itemsOrdered.remove(rm);
			System.out.println("Removed");
		}
	}

	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered items:");
		for (int i=1; i<=itemsOrdered.size(); i++) {
			System.out.println("#" + i + itemsOrdered.get(i-1).toString());
		}
		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("***************************************************");
	}

	public Media searchMedia(String s){
        for (Media media : itemsOrdered){
            if (media.getTitle().equals(s)) return media;
        }
        return null;
    }

	public void searchTitle(String s){
		for (Media media : itemsOrdered){
			if (media.getTitle().equals(s)) System.out.println(media.toString());
			else System.out.println("No match!");
		}
	}

	public void searchId(int s){
		for (Media media : itemsOrdered){
			if (s==media.getId()) System.out.println(media.getId() + media.toString());
			else System.out.println("No match!");
		}
	}

	public float totalCost() {
		float total=0;
		for (Media media : itemsOrdered) {
			total = total + media.getCost();
		}
		return total;
	}
	public void emptyCart(){
		for (Media media : itemsOrdered){
			media = null;
		}
	}
	

}
 