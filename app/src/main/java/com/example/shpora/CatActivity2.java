package com.example.shpora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class CatActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat2);
        Intent intent = getIntent();
        WebView textView = findViewById(R.id.catiweb);
        textView.loadUrl("file:///android_asset/" + intent.getStringExtra("key"));

    }
}