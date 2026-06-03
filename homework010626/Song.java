package homework010626;

import java.util.Objects;

public class Song {
    private String singer;
    private String title;
    private String year;

    Song(String singer, String title, String year){
        this.singer = singer;
        this.title = title;
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return  Objects.equals(singer, song.singer) && Objects.equals(title, song.title);
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

    public String getYear() {
        return year;
    }

}
