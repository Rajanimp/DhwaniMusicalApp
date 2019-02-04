package com.example.dhwanimusicalapp.utils;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.data.Song;

import java.util.ArrayList;

/**A class that stores all the variables and methods that are required in multiple activities
 * Includes methods that return different arrayLists related to the songs based on artists and albums
 * */
public class ApplicationGlobals {

    public static final String KISHORI = "Smt. Kishori Amonkar";
    public static final String BHIMSEN = "Pt. Bhimsen Joshi";
    public static final String HARIPRASAD = "Pt. Hariprasad Chaurasia";
    public static final String SHIVKUMAR = "Pt. Shivkumar Sharma";
    public static final String GANDHARV = "Pt. Kumar Gandharv";
    public static final String AMJADALIKHAN = "Ustad Amjad Ali Khan";

    public static final String LIVE_CONCERT = "Live Concert";
    public static final String RANGI_RANGALA = "Rangi Rangala Shrirang";
    public static final String MUSIC_MOUNTAINS = "Music of the Mountains";
    public static final String GODS_BREATH = "God's Own Breath";
    public static final String SAROD_EUPHONY = "Sarod Euphony";
    public static final String SANS_BREATH = "Sans Breath";
    public static final String NIRGUNI_BHAJANS = "Nirguni Bhajans";
    public static final String ABHANGVAANI = "Abhangvaani";

    private static ApplicationGlobals applnGlobals = null;

    public static ApplicationGlobals getInstance(){
        if (applnGlobals == null)
        {
            applnGlobals = new ApplicationGlobals();
        }
        return applnGlobals;
    }

    /** Method returns and array list of all songs and their details*/
    public ArrayList<Song> getSongDetailsList(){
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Raag Bhinna Shadja - Ud Ja Re Kaga", LIVE_CONCERT, KISHORI));
        songs.add(new Song("Raag Bhoopali - Pratham Sur Sadhe", LIVE_CONCERT, KISHORI));
        songs.add(new Song("Abhang - Avagha Rang Ek Zhala", RANGI_RANGALA, KISHORI));
        songs.add(new Song("Abhang - Bolawa Vitthal Pahawa Vitthal", RANGI_RANGALA, KISHORI));
        songs.add(new Song("Raag Durga - Tu rasikan re", LIVE_CONCERT, BHIMSEN));
        songs.add(new Song("Raag Bhairavi - Babul Mora Naihar", LIVE_CONCERT, BHIMSEN));
        songs.add(new Song("Abhang - Mazhe Maher Pandhari", ABHANGVAANI, BHIMSEN));
        songs.add(new Song("Abhang - Dnyaniyancha Raja Guru Maharaj", ABHANGVAANI, BHIMSEN));
        songs.add(new Song("Bhajan - Avadhuta, Kudrat Ki Gat Nyari", NIRGUNI_BHAJANS, GANDHARV));
        songs.add(new Song("Bhajan - Sunta Hai Guru Gyani", NIRGUNI_BHAJANS, GANDHARV));
        songs.add(new Song("Raag Yaman - flute", SANS_BREATH, HARIPRASAD));
        songs.add(new Song("Raag Hamsadhwani - flute",GODS_BREATH, HARIPRASAD));
        songs.add(new Song("Raag Des - flute", GODS_BREATH, HARIPRASAD));
        songs.add(new Song("Raag Durga - flute", LIVE_CONCERT, HARIPRASAD));
        songs.add(new Song("Mountain Love Song", MUSIC_MOUNTAINS, SHIVKUMAR));
        songs.add(new Song("Raag Jhinjhoti - Santoor", LIVE_CONCERT, SHIVKUMAR));
        songs.add(new Song("Spirit of Kashmir", MUSIC_MOUNTAINS, SHIVKUMAR));
        songs.add(new Song("Raag Mishra Pilu", SAROD_EUPHONY, AMJADALIKHAN));
        songs.add(new Song("Raag Charukeshi", SAROD_EUPHONY, AMJADALIKHAN));
        songs.add(new Song("Raag Maru Bihag", SAROD_EUPHONY, AMJADALIKHAN));
        return songs;
    }

    /**Method returns an array list of all artists and their images*/
    public ArrayList<Song> getArtistsList(){
        ArrayList<Song> artists = new ArrayList<Song>();
        artists.add(new Song(KISHORI, R.drawable.kishori_thumbnail));
        artists.add(new Song(BHIMSEN, R.drawable.bhimsen_thumbnail));
        artists.add(new Song(GANDHARV, R.drawable.gandharv_thumbnail));
        artists.add(new Song(HARIPRASAD, R.drawable.hariprasad_thumbnail));
        artists.add(new Song(SHIVKUMAR, R.drawable.shivkumar_thumbnail));
        artists.add(new Song(AMJADALIKHAN, R.drawable.amjad_ali_khan_thumbnail));
        return artists;
    }

    /**Method returns an array list of all albums and their images*/
    public ArrayList<Song> getAlbumsList(){
        final ArrayList<Song> albums = new ArrayList<Song>();
        albums.add(new Song(GODS_BREATH, R.drawable.gods_breath));
        albums.add(new Song(MUSIC_MOUNTAINS, R.drawable.mountains));
        albums.add(new Song(LIVE_CONCERT, R.drawable.microphone));
        albums.add(new Song(SANS_BREATH, R.drawable.sans_breath));
        albums.add(new Song(NIRGUNI_BHAJANS, R.drawable.kabir_bhajans));
        albums.add(new Song(SAROD_EUPHONY, R.drawable.sarod_euphony));
        albums.add(new Song(RANGI_RANGALA, R.drawable.rangi_rangala));
        albums.add(new Song(ABHANGVAANI, R.drawable.abhangvaani));
        return albums;
    }
}
