package com.example.studyroom;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyroom.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_main);
        ListView listView = findViewById(R.id.listView);
        String[] threadTitle = {"Hello!","Hello2","Hello3"};
        String[] threadText = {"Hello1","Test test","Test Test"};
        ArrayList<Texts> textsList = new ArrayList<>();
        for(int i =0; i<3;i++ ){
            textsList.add(new Texts(threadTitle[i],threadText[i]));
        }
        TextsAdapter adapter = new TextsAdapter(this,textsList);
        listView.setAdapter(adapter);

    }
}
