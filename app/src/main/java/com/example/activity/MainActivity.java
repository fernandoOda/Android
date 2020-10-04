package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar (View v)  {
        EditText editText1 = findViewById(R.id.edit_text_1);
        EditText editText2 = findViewById(R.id.edit_text_2);
        Toast.makeText(MainActivity.this, (editText1.getText()).toString() + (" ") + (editText2.getText()).toString() , Toast.LENGTH_LONG).show();
    }

    public void onClickBtnApagar (View v)  {
        EditText editText1 = findViewById(R.id.edit_text_1);
        EditText editText2 = findViewById(R.id.edit_text_2);
        editText1.setText("");
        editText2.setText("");
    }

}
