package Week2.Day0712;

class Song{
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	Song() {
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
		track = 0;
	}
	Song ( String title, String artist, String album, String[] composer, int year, int track){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show() {
		System.out.println("노래 제목:" + title);
		System.out.println("가쉬:" + artist);
		System.out.println("앨범:" + album);
		System.out.println("작곡가:");
		
		for(int i = 0; i < composer.length; i++) {
			System.out.println(composer[i]);
			
			if(i + 1 == composer.length)
				System.out.println();
			else
				System.out.print(",");
		}
		System.out.println("년도:" + year);
		System.out.println("트랙 번호:" + track);
		}
	
	}

public class SongManager {

	public static void main(String[] args) {
		Song s = new Song ("Dansing Queen", "ABBA", "Arrival",
                 new String[]{"Benny Andersson","Bjorn Ulvaeus"},    //s.String 과 똑같다
        1977, 2);

		  s.show();
	}

}

