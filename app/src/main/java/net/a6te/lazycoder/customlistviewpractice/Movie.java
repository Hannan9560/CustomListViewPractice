package net.a6te.lazycoder.customlistviewpractice;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 3/29/2017.
 */

public class Movie {
    private String movieName;
    private String movieYear;
    private int image;

    public Movie() {
    }

    public Movie(String movieName, String movieYear, int image) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.image = image;
    }

    public Movie(String movieName, String movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avatar","1996",R.drawable.avatar));
        movies.add(new Movie("Hitman Absolute","2016",R.drawable.harculics));
        movies.add(new Movie("The Ring","1990",R.drawable.thering));
        movies.add(new Movie("Bahubali","2015",R.drawable.bahubali));
        movies.add(new Movie("Harripoter","1996",R.drawable.harripoter));
        movies.add(new Movie("Harculise","2014",R.drawable.harculics));
        movies.add(new Movie("Avatar","1996",R.drawable.avatar));
        movies.add(new Movie("Hitman Absolute","2016",R.drawable.harculics));
        movies.add(new Movie("The Ring","1990",R.drawable.thering));
        movies.add(new Movie("Bahubali","2015",R.drawable.bahubali));
        movies.add(new Movie("Harripoter","1996",R.drawable.harripoter));
        movies.add(new Movie("Harculise","2014",R.drawable.harculics));
        return movies;
    }
}
