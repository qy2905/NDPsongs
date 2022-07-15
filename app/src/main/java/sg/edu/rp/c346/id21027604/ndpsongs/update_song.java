package sg.edu.rp.c346.id21027604.ndpsongs;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import sg.edu.rp.c346.id21027604.ndpsongs.databinding.ActivityUpdateSongBinding;

public class update_song extends AppCompatActivity {

    TextView tvsongid;
    EditText etsongid;
    TextView tvsongtitle;
    EditText etsongtitle;
    TextView tvsingers;
    EditText etsingers;
    TextView tvyear;
    EditText etyear;
    TextView editrating;
    RadioGroup updaterating;
    Button updatebtn;
    Button deletebtn;
    Button cancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_song);

        tvsongid = findViewById(R.id.updateSongID);
        etsongid = findViewById(R.id.editUpdateSongID);
        tvsongtitle = findViewById(R.id.updateSongTitle);
        etsongtitle = findViewById(R.id.editUpdateSongTitle);
        tvsingers = findViewById(R.id.updateSinger);
        etsingers = findViewById(R.id.editSingers);
        tvyear = findViewById(R.id.updateYear);
        etyear = findViewById(R.id.editUpdateYear);
        editrating = findViewById(R.id.editRatings);
        updaterating = findViewById(R.id.updaterating);
        updatebtn = findViewById(R.id.updatebtn);
        deletebtn = findViewById(R.id.deletebtn);
        cancelbtn = findViewById(R.id.cancelbtn);

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbh = new DBHelper(update_song.this);

            }
        });
    }
}