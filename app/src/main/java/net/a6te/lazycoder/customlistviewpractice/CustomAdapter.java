package net.a6te.lazycoder.customlistviewpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 3/29/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Movie> movies = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Movie> movies) {
        super(context, R.layout.custom_layout, movies);
        this.context = context;
        this.movies = movies;
    }


    class ViewHolder{
        TextView movieName;
        TextView movieYear;
        ImageView movieImg;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){//when first row create that time it will be called
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_layout,parent,false);
            holder.movieName = (TextView) convertView.findViewById(R.id.movie_name);
            holder.movieYear = (TextView) convertView.findViewById(R.id.movie_release_year);
            holder.movieImg = (ImageView) convertView.findViewById(R.id.movie_image);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.movieName.setText(movies.get(position).getMovieName());
        holder.movieYear.setText(movies.get(position).getMovieYear());
        holder.movieImg.setImageResource(movies.get(position).getImage());

        return convertView;
    }
}
