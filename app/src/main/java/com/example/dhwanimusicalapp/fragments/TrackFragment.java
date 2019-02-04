package com.example.dhwanimusicalapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhwanimusicalapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrackFragment extends Fragment {


    public TrackFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.now_playing_track, container, false);

        //Retrieves data sent from NowPlayingActivity
        Bundle bundle = this.getArguments();
        String txtNowPlaying = "";
        if (bundle != null) {
            txtNowPlaying = bundle.getString("text");
        }

        //Toggles the play and pause buttons
        final ImageView playPauseButton = rootView.findViewById(R.id.img_play_pause1);
        playPauseButton.setTag(1);
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playPauseButton.getTag().equals(1)){
                    playPauseButton.setImageResource(R.drawable.play_music);
                    playPauseButton.setTag(2);
                }else{
                    playPauseButton.setImageResource(R.drawable.pause_music);
                    playPauseButton.setTag(1);
                }
            }
        });

        //Displays which song is currently playing
        TextView txtNowPlayingSongTitle = rootView.findViewById(R.id.currently_playing_song_title);
        txtNowPlayingSongTitle.setText(txtNowPlaying);
        return rootView;
    }
}
