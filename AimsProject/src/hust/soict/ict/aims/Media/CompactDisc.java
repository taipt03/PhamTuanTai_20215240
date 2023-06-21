package hust.soict.ict.aims.Media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<>();
	
	public CompactDisc(int id, String title, String category, float cost, String director, String artist, ArrayList<Track> tracks) {
		super(id, title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	
    public String getArtist() {
		return artist;
	}

    public void addTrack(Track add){
        if(tracks.contains(add)){
            System.out.println("The track has already existed\n");
        }
        else {
            tracks.add(add);
            System.out.println("The track has been added\n");
        }
    }
    public void removeTrack(Track add){
        if(tracks.contains(add)){
            tracks.remove(add);
            System.out.println("The track has been removed\n");
        }
        else {
            System.out.println("The track does not exist\n");
        }
    }
	@Override
	public int getLength() {
		int total = 0;
		for (Track track : tracks) {
			total += track.getLength();
		}
		return total;
	}
	
	public String toString() {
		return "CD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getArtist() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
    public void play(){
        System.out.println("There contains: " + tracks.size() + " tracks in the CD\n");
        System.out.println("Disc Artist: " + this.getArtist());
		System.out.println("Disc length: " + this.getLength());
    }
}
