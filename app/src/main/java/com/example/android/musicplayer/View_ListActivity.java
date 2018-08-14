package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class View_ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__list);

        // Create an arraylist of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Push It", "Salt-N-Pepa"));
        songs.add(new Song("Down Under", "Men at Work"));
        songs.add(new Song("Take On Me", "a-ha"));
        songs.add(new Song("Billie Jean", "Michael Jackson"));
        songs.add(new Song("Tainted Love", "Soft Cell"));
        songs.add(new Song("When Doves Cry", "Prince"));
        songs.add(new Song("Time After Time", "Cyndi Lauper"));
        songs.add(new Song("Livin' on a Prayer", "Bon Jovi"));
        songs.add(new Song("Come on Eileen", "Dexys Midnight Runners"));
        songs.add(new Song("Total Eclipse of the Heart", "Bonnie Tyler"));

        SongAdapter musicAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(musicAdapter);
    }
}
