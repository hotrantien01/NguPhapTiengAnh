package com.trantien.nguphaptienganh.Ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdBanner {
    AdView adView;

    public AdBanner(AdView adView) {
        this.adView = adView;

        AdRequest adRequest = new AdRequest.Builder()
                .tagForChildDirectedTreatment(true)
                .build();
        adView.loadAd(adRequest);
    }
}
