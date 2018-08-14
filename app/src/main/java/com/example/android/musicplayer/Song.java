package com.example.android.musicplayer;

public class Song {

    /** name of song */
    private String mNameSong;
    /** name of artist */
    private String mArtistSong;
    /** create new song object */
    public Song(String nameSong, String artistSong) {
        mNameSong = nameSong;
        mArtistSong = artistSong;
    }
    /** get name of song */
    public String getNameSong () {
        return mNameSong;
    }
    /** get artist of song */
    public String getArtistSong (){
        return mArtistSong;
    }


}
