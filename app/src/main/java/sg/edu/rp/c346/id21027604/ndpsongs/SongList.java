package sg.edu.rp.c346.id21027604.ndpsongs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongList extends AppCompatActivity {

    Button show5starsBtn;
    ListView lvSongs;
    ArrayList<song> al;
    ArrayAdapter<song> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        show5starsBtn = findViewById(R.id.btnshow5stars);
        lvSongs  = findViewById(R.id.songList);
        al = new ArrayList<song>();
        aa = new ArrayAdapter<song>(this, android.R.layout.simple_list_item_1, al);
        lvSongs.setAdapter(aa);
    }
}