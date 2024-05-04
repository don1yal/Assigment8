package PART2;

public class PlaylistIterator implements IIterator<Song> {
    private PlayList playList;
    private int index = 0;

    public PlaylistIterator(PlayList playList) {
        this.playList = playList;
    }
    public boolean hasNext() {
        return index < playList.getCount();
    }
    public Song next() {
        return playList.getSong(index++);
    }
}
