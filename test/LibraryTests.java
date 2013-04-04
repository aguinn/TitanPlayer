/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amanda
 */
public class LibraryTests {
    
    public LibraryTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    @Test
    public void emptyLibraryTest() {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongTest() {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Song Title 1", "Song Artist 1"));
        myLibrary.addSong(new Song("Song Title 2", "Song Artist 2"));
        myLibrary.addSong(new Song("Song Title 3", "Song Artist 3"));
        assertEquals(3, myLibrary.songCount());
    }
    
    @Test
    public void removeSongTest() {
        Library myLibrary = new Library();
        myLibrary.removeSong(new Song ("Song Title 2", "Song Artist 2"));
    }
    
    @Test
    public void createPlaylist() {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addPlaylistSong(new PlaylistSong("Song to Playlist Title 1", "Song to Playlist Artist 1"));
        myPlaylist.addPlaylistSong(new PlaylistSong("Song to Playlist Title 2", "Song to Playlist Artist 2"));
        assertEquals(2, myPlaylist.playlistCount());
    }
}
