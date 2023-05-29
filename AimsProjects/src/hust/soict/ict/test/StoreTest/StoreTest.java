package hust.soict.ict.test.StoreTest;
import hust.soict.ict.aims.Media.Book;
import hust.soict.ict.aims.Media.CompactDisc;
import hust.soict.ict.aims.Media.DigitalVideoDisc;
import hust.soict.ict.aims.Media.Media;
import hust.soict.ict.aims.Store.Store;
public class StoreTest {
    public static void main(String[] args){
        Store myStore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
        myStore.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        myStore.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin"   , "Animation", null, 0, 18.99f);
        myStore.addMedia(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("La la land", "Musical, Romance", "Justin Hurtwiz", 117, 50.33f);
        myStore.addMedia(dvd4);
        myStore.removeMedia(dvd2);

    }
}
