package sg.edu.rp.c346.id21027604.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvSongTitle;
    EditText etSongTitle;
    TextView tvSingers;
    EditText etSingers;
    TextView tvYear;
    EditText etYear;
    TextView tvrating;
    RadioGroup rating;
    Button btnInsert;
    Button btnShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSongTitle = findViewById(R.id.songtitle);
        etSongTitle = findViewById(R.id.editSongTitle);
        tvSingers = findViewById(R.id.singers);
        etSingers = findViewById(R.id.editSingers);
        tvYear = findViewById(R.id.year);
        etYear = findViewById(R.id.editYear);
        tvrating = findViewById(R.id.rating);
        rating = findViewById(R.id.ratings);
        btnInsert = findViewById(R.id.btninsert);
        btnShowList = findViewById(R.id.btnshowlist);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dataSongtitle = etSongTitle.getText().toString();
                String dataSinger = etSingers.getText().toString();
                String dataYear = etYear.getText().toString();
                DBHelper DBH = new DBHelper(MainActivity.this);
                long insert_dataSong = dbh.insertNote(dataSongtitle);
                long insert_datasinger = dbh.insertNote(dataSinger);
                long insert_datayear = dbh.insertNote(dataYear);
            }
        });
    }

}