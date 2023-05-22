package sg.edu.rp.c346.id22019575.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSem, tvCredit, tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.code);
        tvName = findViewById(R.id.name);
        tvYear = findViewById(R.id.year);
        tvSem = findViewById(R.id.sem);
        tvCredit = findViewById(R.id.credit);
        tvVenue = findViewById(R.id.venue);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int year = intentReceived.getIntExtra("year", 2020);
        int sem = intentReceived.getIntExtra("sem", 0);
        int credit = intentReceived.getIntExtra("credit", 0);
        String venue = intentReceived.getStringExtra("venue");
        tvCode.setText("Module Code: "+code);
        tvName.setText("Module Name: "+name);
        tvYear.setText("Academic Year: "+year);
        tvSem.setText("Semester: "+sem);
        tvCredit.setText("Module Credit: "+credit);
        tvVenue.setText("Venue: "+venue);
    }
}