package com.example.dhwanimusicalapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.activities.NowPlayingActivity;
import com.example.dhwanimusicalapp.adapters.CustomListAdapter;
import com.example.dhwanimusicalapp.data.Song;
import com.example.dhwanimusicalapp.utils.ApplicationGlobals;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtistAlbumFragment extends Fragment {

    ArrayList<Song> songsDetailsList = ApplicationGlobals.getInstance().getSongDetailsList();
    ArrayList<Song> songs = null;

    public ArtistAlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.now_playing_artist_album, container, false);

        //Retrieves data sent from NowPlayingActivity
        Bundle bundle = this.getArguments();
        String artistOrAlbum = "";
        String artistName = "";
        String albumName = "";

        /*
        * Checks if bundle has come from the ArtistsActivity or AlbumsActivity
        * Makes sub list of songs according to the artist or album that has been clicked
        * Displays the list in the now playing screen at the bottom
        * Clicking on the list item plays the required song
        * */
        if (bundle != null) {
            artistOrAlbum = bundle.getString("source");
            if ("artist".equals(artistOrAlbum)) {
                artistName = bundle.getString("artist");
                if (artistName != null) {
                    switch (artistName) {
                        case ApplicationGlobals.KISHORI:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.KISHORI)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.BHIMSEN:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.BHIMSEN)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.GANDHARV:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.GANDHARV)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.HARIPRASAD:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.HARIPRASAD)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.SHIVKUMAR:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.SHIVKUMAR)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.AMJADALIKHAN:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getArtistName().equals(ApplicationGlobals.AMJADALIKHAN)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getAlbumName()));
                                }
                            }
                            break;
                    }
                }
            }

            if ("album".equals(artistOrAlbum)) {
                albumName = bundle.getString("album");
                if (albumName != null) {
                    switch (albumName) {
                        case ApplicationGlobals.GODS_BREATH:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.GODS_BREATH)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.MUSIC_MOUNTAINS:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.MUSIC_MOUNTAINS)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.LIVE_CONCERT:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.LIVE_CONCERT)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.SANS_BREATH:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.SANS_BREATH)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.NIRGUNI_BHAJANS:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.NIRGUNI_BHAJANS)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.RANGI_RANGALA:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.RANGI_RANGALA)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.SAROD_EUPHONY:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.SAROD_EUPHONY)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                        case ApplicationGlobals.ABHANGVAANI:
                            songs = new ArrayList<Song>();
                            for(int i = 0; i < songsDetailsList.size(); i++){
                                if(songsDetailsList.get(i).getAlbumName().equals(ApplicationGlobals.ABHANGVAANI)){
                                    songs.add(new Song(songsDetailsList.get(i).getSongTitle(), songsDetailsList.get(i).getArtistName()));
                                }
                            }
                            break;
                    }
                }
            }


        }

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), songs);

        //Displays a list of songs in a particular album or that of a particular artist that has been clicked in the previous screen
        ListView songList = rootView.findViewById(R.id.song_list);
        songList.setAdapter(adapter);
        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);
                String songArtist = "";
                for(int i = 0; i < songsDetailsList.size(); i++){
                    if(songsDetailsList.get(i).getSongTitle().equals(song.getSongTitle())){
                        songArtist = songsDetailsList.get(i).getArtistName();
                    }
                }
                //Displays the title of the song that is clicked in the list
                TextView txtNowPlayingSongTitle = rootView.findViewById(R.id.now_playing_song_title);
                String nowPlaying = song.getSongTitle() + " - " + songArtist;
                txtNowPlayingSongTitle.setText(nowPlaying);
            }
        });

        final ImageView playPauseButton = rootView.findViewById(R.id.img_play_pause2);
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
        return rootView;
    }
}
