package com.trantien.nguphaptienganh.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.trantien.nguphaptienganh.Adapter.CustomAdapter;
import com.trantien.nguphaptienganh.Ads.AdBanner;
import com.trantien.nguphaptienganh.Load.LoadBaiHoc;
import com.trantien.nguphaptienganh.Model.BaiHoc;
import com.trantien.nguphaptienganh.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class LessonActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<BaiHoc> arrayList;
    CustomAdapter adapter;
    String id, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        id = getIntent().getStringExtra("id");
        title = getIntent().getStringExtra("title");
        getSupportActionBar().setTitle(title);

        rv = findViewById(R.id.rv_lession);
        arrayList = new ArrayList<>();
        new LoadBaiHoc(id, arrayList);
        adapter = new CustomAdapter(arrayList, this, 1);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
        AdView adView = findViewById(R.id.ad_lesson);
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
