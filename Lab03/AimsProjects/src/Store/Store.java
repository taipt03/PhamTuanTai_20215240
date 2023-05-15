package Store;
import Disc.DigitalVideoDisc;

public class Store {
    private int MAX_NUMBERS_IN_STORE = 1000;
    private int nbItems=0;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    public void addDVD(DigitalVideoDisc dvd){
        if (nbItems<MAX_NUMBERS_IN_STORE){
            itemsInStore[nbItems] = dvd;
            nbItems++;
            System.out.println("The item has been added\n");
        }
        else {
            System.out.println("FULL\n");
        }
    }
    public void removeDVD(DigitalVideoDisc dvd){
        for (int i=0;i< nbItems;i++){
            if (itemsInStore[i] == dvd){
                itemsInStore[i]=null;
                for (int j=i;j<nbItems;j++){
                    itemsInStore[j]=itemsInStore[j+1];
                }
                nbItems--;
                itemsInStore[nbItems]=null;
                System.out.println("The items has been removed\n");
            }
        }

    }
}
