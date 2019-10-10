package com.example.a721;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText = findViewById(R.id.EditText);
    }

    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if (Character.isLetter(EditText.getText().charAt(0))) {
            Uri uri = Uri.parse("geo:?q=" + EditText.getText().toString());
            intent.setData(uri);
        } else {
            Uri uri = Uri.parse("geo:" + EditText.getText().toString());
           intent.setData(uri);
        }
        startActivity(intent);
    }
}