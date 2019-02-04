package com.example.dhwanimusicalapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.data.Song;

import java.util.ArrayList;

//Adapter for the list view
public class CustomListAdapter extends ArrayAdapter<Song> {

    public CustomListAdapter(Context context, ArrayList<Song> songsList) {
        super(context, 0, songsList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = (Song) getItem(position);
        ImageView imgPlay = listItemView.findViewById(R.id.img_play);
        TextView txtTitle = listItemView.findViewById(R.id.tv_title);
        TextView txtSubtitle1 = listItemView.findViewById(R.id.tv_subtitle1);

        if(currentSong != null){
            if(currentSong.getFlag()){
                txtTitle.setText(currentSong.getSongTitle());
                txtSubtitle1.setText(currentSong.getAlbumName());
                TextView txtSubtitle2 = listItemView.findViewById(R.id.tv_subtitle2);
                txtSubtitle2.setVisibility(View.VISIBLE);
                txtSubtitle2.setText(currentSong.getArtistName());
                imgPlay.setImageResource(R.drawable.play_white);
            }else{
                txtTitle.setText(currentSong.getSongTitle());
                txtTitle.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                txtSubtitle1.setText(currentSong.getArtistAlbum());
                txtSubtitle1.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                TextView txtSubtitle2 = listItemView.findViewById(R.id.tv_subtitle2);
                txtSubtitle2.setVisibility(View.GONE);
                imgPlay.setImageResource(R.drawable.play_brown);
            }
        }
        return listItemView;
    }
}
