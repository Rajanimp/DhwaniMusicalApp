package com.example.dhwanimusicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.adapters.CustomGridAdapter;
import com.example.dhwanimusicalapp.data.Song;
import com.example.dhwanimusicalapp.utils.ApplicationGlobals;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_albums_grid);

        final ArrayList<Song> artists = ApplicationGlobals.getInstance().getArtistsList();

        CustomGridAdapter adapter = new CustomGridAdapter(this, artists);

        GridView gridView = findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song artist = artists.get(position);
                /*Goes to the NowPlayingActivity where the appropriate fragment is loaded
                 according to which activity has sent the intent*/
                Intent intent =new Intent(ArtistsActivity.this, NowPlayingActivity.class);
                intent.putExtra("source", "second");
                intent.putExtra("artist", artist.getArtistAlbum());
                startActivity(intent);
            }
        });


    }
}
