package com.example.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        submitButton = (Button)findViewById(R.id.submitButton);

    }

    public void submitClicked(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("submittal", editText.getText().toString());
                startActivity(intent);
    };


//    public void submitClicked(View view) {
//
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("submittal", editText.getText().toString());
//        startActivity(intent);
//
//    }




}
//        friends.add("johny");
//        friends.add("camila");
//
