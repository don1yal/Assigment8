package PART2;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IAggregate<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song.getTitle() + " by " + song.getArtist());
    }
    public IIterator<Song> createIterator() {
        return new PlaylistIterator(this);
    }
    public int getCount() {
        return songs.size();
    }
    public Song getSong(int index) {
        System.out.println("Getting song at index: " + index);
        return songs.get(index);
    }
}
