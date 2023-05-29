package hust.soict.ict.test.CartTest;
import hust.soict.ict.aims.Cart.Cart;
import hust.soict.ict.aims.Media.Book;
import hust.soict.ict.aims.Media.CompactDisc;
import hust.soict.ict.aims.Media.DigitalVideoDisc;
import hust.soict.ict.aims.Media.Media;
import hust.soict.ict.aims.Store.Store;

public class CartTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin"   , "Animation", null, 0, 18.99f);
        cart.addMedia(dvd3);

        cart.print();
    }
}
