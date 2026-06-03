package homework010626;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Playlist {
    private List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;

    }

    public List<Song> searchSinger(String singer1) {
        List<Song> resultList = new ArrayList<>();
        for (Song search : this.songs) {
            if (search != null && search.getSinger().equals(singer1)) {
                resultList.add(search);
            }
        }
        System.out.println(resultList);
        return resultList;

    }

    private Song playedSong;

    public Song playSong(Song song) throws NoSongInPlaylist {
        for (Song currentSongs : this.songs) {
            if (currentSongs.equals(song)) {
                System.out.println(("Play Song ") + song);
                playedSong = song;
                return song;
            }
        }
        throw new NoSongInPlaylist();
    }

    public void pausedSong() {
        if (playedSong != null) {
            System.out.println(("Pause Song " + playedSong));
            playedSong = null;
        }
    }
    public boolean add(Song s){
        songs.add(s);
        return true;
    }
    public boolean addAll(Collection <? extends Song> newSongs){
        songs.addAll(newSongs);
        return true;
    }

    public Song getPlayedSong() {
        return playedSong;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
