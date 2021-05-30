package com.trantien.nguphaptienganh.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trantien.nguphaptienganh.Activity.LessonActivity;
import com.trantien.nguphaptienganh.Activity.NoiDungActivity;
import com.trantien.nguphaptienganh.Ads.CountAds;
import com.trantien.nguphaptienganh.Model.BaiHoc;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<BaiHoc> arrayList;
    private Context context;
    private int code;
    private boolean isLoadAds = true;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, des;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.txt_title);
            des = (TextView) view.findViewById(R.id.txt_des);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String id = arrayList.get(getLayoutPosition()).getId();
                    String title = arrayList.get(getLayoutPosition()).getTitle();
                    if(code == 0 && !id.equals("4") && !id.equals("8") && !id.equals("10") && !id.equals("11")
                            && !id.equals("12") && !id.equals("14") && !id.equals("15") && !id.equals("16")
                            && !id.equals("22") && !id.equals("23") && !id.equals("24") && !id.equals("25")){
                        Intent i = new Intent(context, LessonActivity.class);
                        i.putExtra("id",id);
                        i.putExtra("title", title);
                        context.startActivity(i);
                    }else {
                        Intent i = new Intent(context, NoiDungActivity.class);
                        i.putExtra("id",id);
                        i.putExtra("title", title);
                        CountAds countAds = new CountAds(context.getApplicationContext());
                        countAds.count();
                        context.startActivity(i);
                    }
                }
            });
        }
    }


    public CustomAdapter(ArrayList<BaiHoc> arrayList, Context context, int code) {
        this.arrayList = arrayList;
        this.context = context;
        this.code = code;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_cau_tu, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BaiHoc bh = arrayList.get(position);
        holder.title.setText(bh.getTitle());
        holder.des.setText(bh.getDes());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
