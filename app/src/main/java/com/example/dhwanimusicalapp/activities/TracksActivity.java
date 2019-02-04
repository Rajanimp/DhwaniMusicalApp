package com.example.dhwanimusicalapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.adapters.CustomListAdapter;
import com.example.dhwanimusicalapp.data.Song;
import com.example.dhwanimusicalapp.utils.ApplicationGlobals;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Gets the arraylist containing complete song details from ApplicationGlobals class
        final ArrayList<Song> songsDetailsList = ApplicationGlobals.getInstance().getSongDetailsList();

        CustomListAdapter adapter = new CustomListAdapter(this, songsDetailsList);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songsDetailsList.get(position);
                String textMessage = song.getSongTitle() + " - " + song.getArtistName();
                /*Goes to the NowPlayingActivity where the appropriate fragment is loaded
                 according to which activity has sent the intent
                 Also plays the track that was selected*/
                Intent intent =new Intent(TracksActivity.this, NowPlayingActivity.class);
                intent.putExtra("source", "first");
                intent.putExtra("text", textMessage);
                startActivity(intent);
            }
        });
    }
}
