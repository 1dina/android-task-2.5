package com.example.dialogtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button show = findViewById(R.id.show_dialog);
        Button change = findViewById(R.id.ChangeText);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragment =  DialogFragment.newInstance("Decision","Do you wanna close the app ?!");
                fragment.show(getSupportFragmentManager(),null);
            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    change.setText(null);
                    change.getText().length();
                   throw new NullPointerException();
                }
                catch (NullPointerException e) {
                        Log.d("result", "Error ");

                }
            }
        });

    }
}