package sg.edu.rp.c346.id22038283.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassi;
    Button btnPassC;
    TextView tvDisplay3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay3=findViewById(R.id.tvDisplay3);
        btnPassi = findViewById(R.id.btnPassi);
        btnPassC = findViewById(R.id.btnPassC);


        btnPassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

                    }
                });
        btnPassC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                intent2.putExtra("value", "a");
                startActivity(intent2);

            }
        });

        tvDisplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value3", 99.99);
                startActivity(intent);
            }
        });


    }
}

