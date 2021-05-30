package com.trantien.nguphaptienganh.Adapter;

import android.content.Context;
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

import com.trantien.nguphaptienganh.Activity.EventHandlerClass;
import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

import static android.content.Context.WINDOW_SERVICE;

// Màn hinh dưới lession
public class AdapterTab extends RecyclerView.Adapter<AdapterTab.MyViewHolder> {

    private ArrayList<ItemLession> arrayList;
    Context context;
    RecyclerView rv;
    LayoutInflater inflater;

    public AdapterTab(Context context, ArrayList<ItemLession> arrayList, RecyclerView rv) {
        this.arrayList = arrayList;
        this.context = context;
        this.rv = rv;
        inflater = LayoutInflater.from(context);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgsound, imgeye, imgeyewith;
        TextView txt_eng;
        TextView txt_vie;

        public MyViewHolder(View view) {
            super(view);
            txt_eng = view.findViewById(R.id.txt_eng);
            txt_vie = view.findViewById(R.id.txt_vie);
            imgsound = view.findViewById(R.id.imgsound);
            imgeye = view.findViewById(R.id.imgeye);
            imgeyewith = view.findViewById(R.id.imgeyewith);
        }
    }


    @Override
    public AdapterTab.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_tab, parent, false);
        return new AdapterTab.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        WindowManager wm = (WindowManager) context.getSystemService(WINDOW_SERVICE);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        Resources r = context.getResources();
        float truPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, r.getDisplayMetrics());
        int width = (int) (displayMetrics.widthPixels / 2 - truPx);

        final ItemLession itemLession = arrayList.get(position);
        holder.txt_eng.setText(itemLession.getEng());
        holder.txt_vie.setText(itemLession.getVie());
        final int file = itemLession.getFile();

        holder.imgsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventHandlerClass.startMediaPlayer(context, file);
            }
        });
        holder.imgeye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.txt_vie.setVisibility(View.VISIBLE);
                holder.imgeyewith.setVisibility(View.VISIBLE);
                holder.imgeye.setVisibility(View.GONE);
            }
        });
        holder.imgeyewith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.txt_vie.setVisibility(View.GONE);
                holder.imgeye.setVisibility(View.VISIBLE);
                holder.imgeyewith.setVisibility(View.GONE);
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //EventHandlerClass.startMediaPlayer(context, file);
                holder.imgeye.setVisibility(View.VISIBLE);
                holder.imgeyewith.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}

