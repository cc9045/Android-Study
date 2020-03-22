package com.mirai.hellomyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity");
    }
    Button btn = findViewById(R.id.button);
    int size = 30;
    public void clicked(View v){
        EditText name = (EditText) findViewById(R.id.editText);
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Wish you happy!"+name.getText().toString());
        text.setTextSize(++size);
    }
    public void checked(View v){
        EditText edit = findViewById(R.id.editText);
        edit.setEnabled(true);
    }
}
