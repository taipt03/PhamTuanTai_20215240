package hust.soict.ict.aims.Store;
import java.util.ArrayList;
import hust.soict.ict.aims.Media.Media;

public class Store {
    private int MAX_NUMBERS_IN_STORE = 1000;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media add){
        if(itemsInStore.size()<MAX_NUMBERS_IN_STORE){
            itemsInStore.add(add);
        }
        else {
            System.out.println("Exceed max capacity\n");

        }
    }

    public void removeMedia(Media rm){
		if(itemsInStore.isEmpty()) {
			System.out.println("The store is empty.");
		}
		else if (!itemsInStore.contains(rm)) {
			System.out.println("The media you want to remove is not in the store.");
		}
		else {
			itemsInStore.remove(rm);
			System.out.println("Removed");
		}
	}

    public Media searchMedia(String s){
        for (Media media : itemsInStore){
            if (media.getTitle().equals(s)) return media;
        }
        return null;
    }

	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Items in store:\n");
		for (int i=1; i<=itemsInStore.size(); i++) {
			System.out.println("#" + i + itemsInStore.get(i-1).toString());
		}
		System.out.println("***************************************************");
	}

}
