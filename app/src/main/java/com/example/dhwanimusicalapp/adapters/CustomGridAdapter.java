package com.example.dhwanimusicalapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dhwanimusicalapp.R;
import com.example.dhwanimusicalapp.data.Song;

import java.util.ArrayList;

//Adapter for the grid view
public class CustomGridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList artistOrAlbumList;

    public CustomGridAdapter(Context context, ArrayList<Song> artistOrAlbumList) {
        this.context = context;
        this.artistOrAlbumList = artistOrAlbumList;
    }

    @Override
    public int getCount() {
        return artistOrAlbumList.size();
    }

    @Override
    public Object getItem(int position) {
        return artistOrAlbumList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;
        if(gridItemView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridItemView = inflater.inflate(R.layout.grid_item, parent, false);
        }

        Song currentArtistOrAlbum = (Song) getItem(position);

        TextView artistOrAlbumName = gridItemView.findViewById(R.id.tv_artist_album_name);

        if(currentArtistOrAlbum != null){
            artistOrAlbumName.setText(currentArtistOrAlbum.getArtistAlbum());
        }

        ImageView artistOrAlbumImage = gridItemView.findViewById(R.id.img_artist_album);

        if(currentArtistOrAlbum != null){
            if(currentArtistOrAlbum.hasImage()){
                artistOrAlbumImage.setImageResource(currentArtistOrAlbum.getImageResourceId());
            }
        }
        return gridItemView;
    }
}
