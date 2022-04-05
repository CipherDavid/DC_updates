package com.example.rsscinema;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDCcomics = findViewById(R.id.btnDCcomics);
        Button btnCartoonBook = findViewById(R.id.btnCartoonBook);
        btnDCcomics.setOnClickListener(this);
        btnCartoonBook.setOnClickListener(this);

        rssLinks.add("https://www.dccomics.com/feed");
        rssLinks.add("https://comicbook.com/feed/rss/"); //https://comicbook.com/feed/rss/
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDCcomics:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;

            case R.id.btnCartoonBook:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(1)));
                break;
        }
    }
}

