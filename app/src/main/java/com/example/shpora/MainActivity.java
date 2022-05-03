package com.example.shpora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView CatList = findViewById(R.id.cat);
        String[] catty = getResources().getStringArray(R.array.delaet);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.activity_stile, catty);
        CatList.setAdapter(adapter);
        Intent intent = new Intent(this, CatActivity2.class);
        CatList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                intent.putExtra("key", ((TextView)v).getText() + ".html");
                startActivity(intent);
            }
        });
    }
}