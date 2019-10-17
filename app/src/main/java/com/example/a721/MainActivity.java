package com.example.a721;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditText;
    Button mBtnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText = findViewById(R.id.EditText);
        mBtnSearch = findViewById(R.id.search);


        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchClick();
            }
        });

    }

    private void searchClick() {
        String searchString = EditText.getText().toString();
        String param = "geo:?q=";
        if (searchString.indexOf(", ") != -1 & searchString.matches("[\\d,. ]+")){
            param = "geo:";
        }
        Uri objectName = Uri.parse(param + searchString);
        Intent findObject = new Intent(Intent.ACTION_VIEW, objectName);
        startActivity(findObject);

    }


}


