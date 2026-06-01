package homework010626;

import java.util.ArrayList;
import java.util.List;


public class Playlist {
    private List<Song> songs;

    Playlist(List<Song> songs){
        this.songs = songs;

    }
    List<Song> resultList = new ArrayList<>();
    public List<Song> searchSinger(String singer1){
        for(Song search : this.songs){
            if (search != null && search.getSinger().equals(singer1)){
                resultList.add(search);
            }
        }
        System.out.println(resultList);
        return resultList;

    }
    boolean isPlayed;
    private Song playedSong;
    public Song playSong(Song song)throws NoSongInPlaylist{
        for (Song currentSongs : this.songs){
            if (currentSongs.equals(song)){
                isPlayed = true;
                System.out.println(("Play Song " )+ song);
                playedSong = song;
                return song;
            }
        }
        throw new NoSongInPlaylist();
    }
    public Song pausedSong()throws NoSongInPlaylist{
        for (Song currentSong : this.songs){
            if (playedSong != null){
                System.out.println(("Pause Song " + playedSong));
                playedSong = null;
            }
            return playedSong;
        }
        throw new NoSongInPlaylist();
    }

    public Song getPlayedSong() {
        return playedSong;
    }

    public void setPlayedSong(Song playedSong) {
        this.playedSong = playedSong;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}
