package hust.soict.ict.test.DISCS.TestDisc;
import hust.soict.ict.aims.Media.Book;
import hust.soict.ict.aims.Media.CompactDisc;
import hust.soict.ict.aims.Media.DigitalVideoDisc;
import hust.soict.ict.aims.Media.Media;
import hust.soict.ict.aims.Store.Store;
public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD= new DigitalVideoDisc("Jungle", null, null, 0, 0);
        DigitalVideoDisc cinderellaDVD= new DigitalVideoDisc("Cinderella", null, null, 0, 0);

        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp=o1;
        o1=o2;
        o2=tmp;
    }

}
