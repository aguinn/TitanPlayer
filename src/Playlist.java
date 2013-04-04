
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
public class Playlist {
    
    List<Playlist> playlist;
    private Playlist songForPlaylist;
    
    public Playlist() {
        playlist = new ArrayList<Playlist>();
    }
    
    public void addPlaylistSong(PlaylistSong playlistSong) {
        playlist.add(songForPlaylist);
    }
    
    public int playlistCount() {
        return playlist.size();
    }
}
