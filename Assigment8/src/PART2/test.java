package PART2;

public class test {
    public static void main(String[] args) {
        PlayList myPlaylist = new PlayList();

        myPlaylist.addSong(new Song("Lose Yourself", "Eminem"));
        myPlaylist.addSong(new Song("Juicy", "The Notorious B.I.G."));
        myPlaylist.addSong(new Song("Stan", "Eminem"));
        myPlaylist.addSong(new Song("Gin and Juice", "Snoop Dogg"));
        myPlaylist.addSong(new Song("HUMBLE.", "Kendrick Lamar"));

        System.out.println("=== My Rap Playlist ===");
        System.out.println("Songs:");
        System.out.println("-----------------------");

        IIterator<Song> iterator = myPlaylist.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
