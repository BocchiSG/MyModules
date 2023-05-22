package sg.edu.rp.c346.id22019575.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.C346);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Code = "C346";
                String Name = "Android Programming";
                int Year = 2020;
                int Sem = 1;
                int Credit = 4;
                String Venue = "W66M";

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", Code);
                intent.putExtra("name", Name);
                intent.putExtra("year", Year);
                intent.putExtra("sem", Sem);
                intent.putExtra("credit", Credit);
                intent.putExtra("venue", Venue);
                startActivity(intent);
            }
        });

    }
}