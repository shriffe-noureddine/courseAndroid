package com.example.androidquiz51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText monday;
    EditText tuesday;
    EditText wednesday;
    EditText thursday;
    EditText friday;
    SharedPreferences P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P = getPreferences(MODE_PRIVATE);
        setContentView(R.layout.activity_main);
        monday = (EditText)findViewById(R.id.monday);
        tuesday = (EditText)findViewById(R.id.tuesday);
        wednesday = (EditText)findViewById(R.id.wednesday);
        thursday = (EditText)findViewById(R.id.thursday);
        friday = (EditText)findViewById(R.id.friday);
    }

    protected void onStart()
    {
        super.onStart();
        monday.setText(P.getString("monday",""));
        tuesday.setText(P.getString("tuesday",""));
        wednesday.setText(P.getString("wednesday",""));
        thursday.setText(P.getString("thursday",""));
        friday.setText(P.getString("friday",""));
    }
    protected void onStop()
    {
        SharedPreferences.Editor editor = P.edit();
        editor.putString("monday",monday.getText().toString());
        editor.putString("tuesday",tuesday.getText().toString());
        editor.putString("wednesday",wednesday.getText().toString());
        editor.putString("thursday",thursday.getText().toString());
        editor.putString("friday",friday.getText().toString());

        editor.commit();
        super.onStop();
    }
}