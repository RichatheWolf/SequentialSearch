import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MusicTesterV1 {
	
	private static List<Music> song = new ArrayList<Music>();
	
	public static void addSongs() {
		song.add(new Music("Video Games", 2012, "Lana Del Rey"));
		song.add(new Music("Tank!", 1998, "Seatbelts"));
		song.add(new Music("The 30th", 2022, "Billie Eilish"));
		song.add(new Music("Cruel Summer", 2019, "Taylor Swift"));
		song.add(new Music("4:00 AM", 1978, "Taeko Onuki"));
		song.add(new Music("Colors", 2006, "FLOW"));
		song.add(new Music("Winding Through Avidya", 2023, "HOYO-MiX"));
		song.add(new Music("Kaikai Kaitan", 2020, "Eve"));
		song.add(new Music("Matoryoshka", 2010, "Kenshi Yonezu"));
		song.add(new Music("Diet Mountain Dew", 2012, "Lana Del Rey"));
		song.add(new Music("Colors", 2015, "Halsey"));
	}
	
	public static void print() {
		System.out.println();
		for (Music song : song) {
			System.out.println(song);
		}
	}
	
	
	public static List<Music> findSongByTitle(String t) {
		List<Music> results = new ArrayList<Music>();
		for (int i = 0; i < song.size(); i++) {
			if (song.get(i).getTitle().equals(t)) {
				results.add(song.get(i));
			}
		}
		return results;
	}
	
	public static List<Music> findSongbyYear(int y){
		List<Music> results = new ArrayList<Music>();
		for (int i = 0; i < song.size(); i++) {
			if (song.get(i).getYear() == y) {
				results.add(song.get(i));
			}
		}
		return results;
	}
	
	public static List<Music> findSongByArtist(String a) {
		List<Music> results = new ArrayList<Music>();
		for (int i = 0; i < song.size(); i++) {
			if (song.get(i).getArtist().equals(a)) {
				results.add(song.get(i));
			}
		}
		return results;
	}
	public static void printResults(List<Music> results) {
		if(results.size() == 0){
			System.out.println("Sorry, there is no such song in the list.");
		}
		else {
			System.out.println("Here are the songs you are looking for: ");
		}
		for(Music song : results){
			System.out.println(song);
		}
	}
	
	public static void main(String[] args) {
		addSongs();
		print();
		System.out.println();
		
		System.out.println("Finding songs with your title...");
		printResults(findSongByTitle("Bohemian Rhapsody"));
		System.out.println();
		
		System.out.println("Finding songs from your year...");
		printResults(findSongbyYear(1998));
		System.out.println();
		
		System.out.println("Finding songs by your artist...");
		printResults(findSongByArtist("Lana Del Rey"));
		System.out.println();
		
	}
}