package com.example.natcure.natcure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RemedyScreen extends AppCompatActivity {
    private DatabaseHelper myDb;
    private ArrayList<String> remedies;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy_screen);
        myDb=new DatabaseHelper(this);
        Bundle b=this.getIntent().getExtras();
        String[] symList=b.getStringArray("result");
        remedies=myDb.getRemedy(symList);
        listView=(ListView)findViewById(R.id.list_remedies);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.select_dialog_item,remedies);
        listView.setAdapter(adapter);
    }
}
