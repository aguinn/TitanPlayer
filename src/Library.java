
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amanda
 */
public class Library {
    
    List<Song> songs;
    
    public Library() {
        songs = new ArrayList<Song>();
    }
    
    public void addSong(Song songToAdd) {
        songs.add(songToAdd);
    }
    
    public void removeSong(Song songToRemove) {
        songs.remove(songToRemove);
    }
    
    public int songCount() {
        return songs.size();
    }
}
