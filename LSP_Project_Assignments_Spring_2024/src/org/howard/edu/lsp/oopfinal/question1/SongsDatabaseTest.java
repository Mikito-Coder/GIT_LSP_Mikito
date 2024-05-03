package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        db.addSong("Rap", "Lose Yourself");
    }

    @Test
    public void testAddSong() {
        db.addSong("Pop", "Blinding Lights");
        assertTrue(db.getSongs("Pop").contains("Blinding Lights"));
    }

    @Test
    public void testAddMultipleSongsSameGenre() {
        db.addSong("Rap", "God's Plan");
        assertTrue(db.getSongs("Rap").contains("God's Plan"));
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullSong() {
        db.addSong(null, null);
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unknown Song"));
    }

    @Test
    public void testGetGenreWithDuplicateSongTitles() {
        db.addSong("Blues", "Always There");
        assertNotNull(db.getGenreOfSong("Always There")); // should return the first found genre, i.e., Jazz
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertEquals(2, rapSongs.size()); // Ensure it contains "Lose Yourself" and "Savage"
    }

    @Test
    public void testGetSongsFromNonExistentGenre() {
        Set<String> nonexistentGenreSongs = db.getSongs("Electronic");
        assertTrue(nonexistentGenreSongs.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSongsNull() {
        db.getSongs(null);
    }
}
