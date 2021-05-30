package com.trantien.nguphaptienganh.Ads;

import android.content.Context;
import android.content.SharedPreferences;

public class CountAds {
    Context context;

    public CountAds(Context context) {
        this.context = context;

    }
    public void count(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("number", Context.MODE_PRIVATE);
        int count = sharedPreferences.getInt("count",0);
        if(count == 1){
            //new AdFull(context);
            if (Common.interstitialAd.isLoaded()){
                Common.interstitialAd.show();
            }
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("count",0);
            editor.commit();
        }else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            count++;
            editor.putInt("count",count);
            editor.commit();
        }
    }

    public void reset(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("number", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("count",1);
        editor.commit();
    }
}
