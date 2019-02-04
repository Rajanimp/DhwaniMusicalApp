package com.example.dhwanimusicalapp.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dhwanimusicalapp.R;

public class MainActivity extends AppCompatActivity {

    TextView txtTracks;
    TextView txtArtists;
    TextView txtAlbums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_title);
        setSupportActionBar(toolbar);

        String DEVNAGRI = "dev.ttf";
        String ORNAMENTAL = "angels.ttf";

        TextView dhwaniTitle = findViewById(R.id.tv_dhwani);
        dhwaniTitle.setTypeface(Typeface.createFromAsset(getAssets(), DEVNAGRI));

        TextView soulMusic = findViewById(R.id.tv_soul_music);
        soulMusic.setTypeface(Typeface.createFromAsset(getAssets(), ORNAMENTAL));

        txtTracks = findViewById(R.id.tv_tracks);
        txtArtists = findViewById(R.id.tv_artists);
        txtAlbums = findViewById(R.id.tv_albums);

        addListeners();
    }

    private void addListeners() {
        txtTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goes to the Tracks screen
                Intent i = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(i);
            }
        });

        txtArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goes to the Artists screen
                Intent i = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(i);
            }
        });

        txtAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Goes to the Albums screen
                Intent i = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            Toast.makeText(this, "You clicked search", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
