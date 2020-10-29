package study.jeanwang2dev;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title, duration));
    }

    public void listSongs(){
        System.out.println("Song list for Album " + this.name );
        songs.printList();
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(trackNumber);
        if( checkedSong != null ){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album dose not have track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song checkedSong = songs.findSong(songTitle);
        if( checkedSong != null){
            playlist.add(checkedSong);
            return true;
        } else {
            System.out.println("The song with title " + songTitle + " is not in this album");
            return false;
        }
    }

    class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs= new ArrayList<>();
        }
        
        private boolean add(Song newSong){
            // verification
            if( findSong( newSong.getTitle() ) != null) {
                System.out.println("Song with this name already exists. Song not added. ");
                return false;
            } else {
                this.songs.add(newSong);
                return true;
            }
        }

        private Song findSong(String name){
            for(Song checkedSong: this.songs){
                if( checkedSong.getTitle().equals(name) ){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if( index >= 0 && index < songs.size() ){
                return songs.get(index);
            }
            return null;
        }

        private void printList(){
            for(int i =0; i < songs.size(); i++){
                System.out.println(i + " : " + songs.get(i));
            }
        }

    }


}
