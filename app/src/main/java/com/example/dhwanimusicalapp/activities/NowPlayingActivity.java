package com.example.dhwanimusicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.fragments.ArtistAlbumFragment;
import com.example.dhwanimusicalapp.fragments.TrackFragment;

/**Takes intents from three activities, i.e., TracksActivity, ArtistsActivity, and AlbumsActivity
 * The intent extras are named "first", "second", and "third" respectively
 * The intent extras are processed and the appropriate fragment is loaded accordingly*/
public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            String from = intent.getStringExtra("source");
            if ("first".equals(from)){
                String songTitle = intent.getExtras().getString("text");
                Bundle bundle = new Bundle();
                bundle.putString("text", songTitle);
                TrackFragment trackFragment = new TrackFragment();
                trackFragment.setArguments(bundle);
                //Loads the TrackFragment
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, trackFragment).commit();
            } else if("second".equals(from)){
                String artistName = intent.getExtras().getString("artist");
                Bundle bundle = new Bundle();
                bundle.putString("source", "artist");
                bundle.putString("artist", artistName);
                ArtistAlbumFragment artistAlbumFragment = new ArtistAlbumFragment();
                artistAlbumFragment.setArguments(bundle);
                //Loads the ArtistAlbumFragment with songs of the artist selected
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, artistAlbumFragment).commit();
            }
            else {
                String albumName = intent.getExtras().getString("album");
                Bundle bundle = new Bundle();
                bundle.putString("source", "album");
                bundle.putString("album", albumName);
                ArtistAlbumFragment artistAlbumFragment = new ArtistAlbumFragment();
                artistAlbumFragment.setArguments(bundle);
                //Loads the ArtistAlbumFragment wiht songs of the album selected
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, artistAlbumFragment).commit();
            }
        }

    }
}
