package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private ArrayList<Song> songList;

    public Album(String name) {
        this.name = name;
        this.songList = new ArrayList<>();
    }

    public void addSong(String title, double duration){
        // verification
        if( getSong(title) == null) {
            songList.add(new Song(title, duration));
        } else {
            System.out.println("Song with this name already exists. Song not added. ");
        }
    }

    public Song getSong(String name){
        for(Song checkedSong: this.songList){
            if( checkedSong.getTitle().equals(name) ){
                return checkedSong;
            }
        }
        return null;
    }

    public void addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber >= 0 && trackNumber < songList.size()){
            playlist.add(songList.get(trackNumber));
        } else {
            System.out.println("This album dose not have track " + trackNumber);
        }
    }

    public void addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song checkedSong =  getSong(songTitle);
        if( checkedSong != null){
            playlist.add(checkedSong);
        } else {
            System.out.println("The song with title " + songTitle + " is not in this album");
        }
    }
}
