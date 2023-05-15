package Cart;

import Disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered [] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is already full");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		if (qtyOrdered+dvdList.length<MAX_NUMBERS_ORDERED){
			for (int i=0;i<dvdList.length;i++){
				itemsOrdered[qtyOrdered]=dvdList[i];
				qtyOrdered++;
				System.out.println("The disc has been added");
			}
		}
		else {
			System.out.println("The cart is already full");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){}

	public void print(){
		System.out.println("***********************CART***********************\n");
		System.out.println("Ordered items: \n");
		for (int i=0;i <qtyOrdered;i++){
			System.out.println((i+1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() +": " + itemsOrdered[i].getCost() +"$\n");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************\n");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i]==disc) {
				itemsOrdered[i]=null;
				for(int x=i;i<qtyOrdered;i++) {
					itemsOrdered[x]=itemsOrdered[x+1];
				}
				qtyOrdered--;
				itemsOrdered[qtyOrdered]=null;
				System.out.println("The disc has been removed\n");
			}
		}
	}
	public float totalCost() {
		float total=0;
		for (int i=0;i<qtyOrdered;i++) {
			total = total + itemsOrdered[i].getCost();
		}
		return total;
	}
}
 