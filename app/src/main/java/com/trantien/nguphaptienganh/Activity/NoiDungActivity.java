package com.trantien.nguphaptienganh.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import com.trantien.nguphaptienganh.Ads.AdBanner;
import com.trantien.nguphaptienganh.Load.LoadNoiDung;
import com.trantien.nguphaptienganh.R;
import com.google.android.gms.ads.AdView;

public class NoiDungActivity extends AppCompatActivity {

    String id, title;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_pdf);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        id = getIntent().getStringExtra("id");
        title = getIntent().getStringExtra("title");
        getSupportActionBar().setTitle(title);
        wv = findViewById(R.id.wv);
        new LoadNoiDung(id, wv);
        AdView adView = findViewById(R.id.ad_nd);
        new AdBanner(adView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
