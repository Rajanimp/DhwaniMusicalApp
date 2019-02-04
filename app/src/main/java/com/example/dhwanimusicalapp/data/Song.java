package com.example.dhwanimusicalapp.data;

public class Song {

    /** Title of the song*/
    private String songTitle;

    /** Name of the artist */
    private String artistName;

    /** Name of the album*/
    private String albumName;

    /** Artist or album name depending on the activity */
    private String artistAlbum;

    /** Image resource ID for the artist */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this artist */
    private static final int NO_IMAGE_PROVIDED = -1;

    private boolean flag;

    public Song(String songTitle, String albumName, String artistName) {
        this.songTitle = songTitle;
        this.albumName = albumName;
        this.artistName = artistName;
        flag = true;
    }

    public Song(String songTitle, String artistAlbum){
        this.songTitle = songTitle;
        this.artistAlbum = artistAlbum;
        flag = false;
    }

    public Song(String artistAlbum, int imageResourceId) {
        this.artistAlbum = artistAlbum;
        this.imageResourceId = imageResourceId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getArtistAlbum() {
        return artistAlbum;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean getFlag(){
        return flag;
    }
}
