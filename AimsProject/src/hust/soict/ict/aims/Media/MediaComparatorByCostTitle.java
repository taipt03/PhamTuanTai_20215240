package hust.soict.ict.aims.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		int costComparison = Double.compare(o2.getCost(), o1.getCost());
		

        if (costComparison!=0){
            return costComparison;
        } 
        else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
	}

}