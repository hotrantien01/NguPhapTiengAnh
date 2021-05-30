package com.trantien.nguphaptienganh.Adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.trantien.nguphaptienganh.Activity.LoadLesson;
import com.trantien.nguphaptienganh.Ads.AdFull;
import com.trantien.nguphaptienganh.Model.ItemMain;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

import static android.content.Context.WINDOW_SERVICE;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.MyViewHolder> {

    private ArrayList<ItemMain> arrayList;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ten;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            ten = view.findViewById(R.id.txt_item_main);
            img = view.findViewById(R.id.img_item_main);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, arrayList.get(getPosition()).getName(), Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(context, LoadLesson.class);
                    i.putExtra("id", arrayList.get(getPosition()).getId());
                    context.startActivity(i);
                    //context.overridePendingTransition(R.anim.slide_left, R.anim.slide_out_right);
                    new AdFull(context);
                }
            });
        }
    }

    public AdapterMain(ArrayList<ItemMain> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public AdapterMain.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_main, parent, false);

        return new AdapterMain.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AdapterMain.MyViewHolder holder, int position) {
        WindowManager wm = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        Resources r = context.getResources();
        float truPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, r.getDisplayMetrics());
        int width = (int) (displayMetrics.widthPixels / 2 - truPx);


        holder.ten.setText(arrayList.get(position).getName());
        Glide.with(context).load(arrayList.get(position).getImg()).override(width, (int) (width - truPx)).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
