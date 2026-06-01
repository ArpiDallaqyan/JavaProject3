package homework010626;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SongDemo {
    static void main(String[] args) {
        List<Song> songs2 = new LinkedList<>();
        songs2.add(new Song ("Ed Sheeran", "Perfect", 2017));
        songs2.add(new Song ("Justin Timberlake", "Mirrors", 2013));
        songs2.add(new Song("LC", "Lost On You", 2016));
        Playlist playlist2 = new Playlist(songs2);
        playlist2.searchSinger("LC");
        try {
            playlist2.playSong(new Song ("Ed Sheeran", "Perfect", 2017));
        } catch (NoSongInPlaylist e) {
            throw new RuntimeException(e);
        }
        try {
            playlist2.playSong(new Song ("Justin Timberlake", "Mirrors", 2013));
        } catch (NoSongInPlaylist e) {
            throw new RuntimeException(e);
        }
        try {
            playlist2.pausedSong();
        } catch (NoSongInPlaylist e) {
            throw new RuntimeException(e);
        }
        songs2.add(new Song("Passenger", "Let Her Go", 2025));
        songs2.remove(2);
        songs2.remove(new Song("Justin Timberlake", "Mirrors", 2013));
        songs2.addAll(songs2);
        for (Song song2 : playlist2.getSongs()){
            System.out.println(song2);
        }

        List<Song> allSongs = new ArrayList<>();
        allSongs.add(new Song ("Adele", "Someone Like You", 2012));
        allSongs.add(new Song ("Adele", "Easy On Me", 2022));
        allSongs.add(new Song("Outlandish", "Callin U", 2010));
        allSongs.add(new Song("John Legend", "Stay With You", 2021));
        Playlist playlist = new Playlist(allSongs);
        allSongs.add(new Song("Tom Odell", "Another Love", 2013));
        allSongs.addAll(allSongs);
        for (Song song : playlist.getSongs()) {
            System.out.println(song);
        }

        List<Song> results = playlist.searchSinger("Adele");

        try {
            playlist.playSong(new Song("Adele", "Easy On Me", 2022));
        } catch (NoSongInPlaylist e) {
            throw new RuntimeException(e);
        }
        System.out.println(playlist.getPlayedSong());

        try {
            playlist.pausedSong();
        } catch (NoSongInPlaylist e) {
            throw new RuntimeException(e);
        }


    }

}
