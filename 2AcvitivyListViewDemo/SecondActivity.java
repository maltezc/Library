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
import java.util.List;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    String passed;
    Button backButton;
    ListView listView;
    Bundle bundle;
    Button submitButton;
    static List<String> friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = (ListView)findViewById(R.id.myFriendsListView);
        backButton = (Button)findViewById(R.id.backButton);
        submitButton = (Button)findViewById(R.id.submitButton);

        if(friends==null){
            friends = new ArrayList<String>();
        }

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, friends);

        bundle = getIntent().getExtras();
        passed = bundle.getString("submittal");
        Log.i("info", passed);

        friends.add(passed);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();

    }



    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
