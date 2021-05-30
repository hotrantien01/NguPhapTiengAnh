package com.trantien.nguphaptienganh.Activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.trantien.nguphaptienganh.Adapter.AdapterTab;
import com.trantien.nguphaptienganh.Ads.AdBanner;
import com.trantien.nguphaptienganh.Ads.AdFull;
import com.trantien.nguphaptienganh.LoadLession;
import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class LoadLesson extends AppCompatActivity {
    ArrayList<ItemLession> arrayList;
    AdapterTab adapterTab;
    RecyclerView rv;
    AdView adView;
    int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_lesson);

        // nhận dữ liệu từ màn hình main
        getinformation();
        setControl();
        ToolBar();
        arrayList = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        adapterTab = new AdapterTab(this, arrayList, rv);
        int parentWidth = rv.getWidth();
        int itemWidth = 120;
        rv.setAdapter(adapterTab);
        rv.setHasFixedSize(true);


        addLession();
        new AdBanner(adView);
    }


    private void ToolBar() {
        // Khởi tạo tool bar và thay thế action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Loại bỏ tiêu đề tool bar
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        // Hiển thị nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void setControl() {
        rv = findViewById(R.id.rv_tab);
        adView = findViewById(R.id.ad_banner_lession);
    }


    private void getinformation() {
        id = getIntent().getExtras().getInt("id");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addLession() {
        new LoadLession(id, arrayList);
    }

    @Override
    public void onBackPressed() {
        finish();
        new AdFull(this);
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }
}
