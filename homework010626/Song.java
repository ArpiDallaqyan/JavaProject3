package homework010626;

import java.util.Objects;

public class Song {
    private String singer;
    private String title;
    private int year;

    Song(String singer, String title, int year){
        this.singer = singer;
        this.title = title;
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return year == song.year && Objects.equals(singer, song.singer) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singer, title, year);
    }

    @Override
    public String toString() {
        return title + " " + singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
