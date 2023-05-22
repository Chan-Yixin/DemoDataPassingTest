package sg.edu.rp.c346.id22038283.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView textView2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_third);

            textView2 = findViewById(R.id.textView2);
            Intent intentReceived2 = getIntent();
            Character charValue = intentReceived2.getCharExtra("value", 'a');
            textView2.setText("Character value received is: " + charValue);
        }
    }


