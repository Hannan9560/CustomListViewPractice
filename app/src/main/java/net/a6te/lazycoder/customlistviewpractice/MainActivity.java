package net.a6te.lazycoder.customlistviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Movie> movies;
    private Movie myMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        myMovie = new Movie();
        movies = new ArrayList<>();
        movies = myMovie.getAllMovie();
        CustomAdapter adapter = new CustomAdapter(MainActivity.this,movies);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,movies.get(i).getMovieName(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
