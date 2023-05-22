package sg.edu.rp.c346.id22038283.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        textView3 = findViewById(R.id.textView3);
        Intent intentReceived3 = getIntent();
        double doubleValue = intentReceived3.getDoubleExtra("value3", 0);
        textView3.setText("Double value received is: " + doubleValue);
    }
}