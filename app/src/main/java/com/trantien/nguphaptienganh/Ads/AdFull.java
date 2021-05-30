package com.trantien.nguphaptienganh.Ads;

import android.content.Context;

import com.trantien.nguphaptienganh.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class AdFull {
    Context context;
    InterstitialAd interstitialAd;

    public AdFull(final Context context) {
        this.context = context;

        AdRequest adRequest = new AdRequest.Builder()
                .tagForChildDirectedTreatment(true)
                .build();
        interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.ad_full));
        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
//                if(interstitialAd.isLoaded()){
//                    interstitialAd.show();
//                }

            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                Common.interstitialAd = new AdFull(context).getInterstitialAd();
            }
        });
    }

    public InterstitialAd getInterstitialAd() {
        return interstitialAd;
    }
}
