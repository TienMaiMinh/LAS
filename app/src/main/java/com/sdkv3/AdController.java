package com.sdkv3;

import android.content.Context;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class AdController {
    private static InterstitialAd mInterstitialAd;
    public static void loadAndShow(Context context){
        MobileAds.initialize(context, "ca-app-pub-8634259134319673~2803248743");
        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId("ca-app-pub-8634259134319673/4279981940");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mInterstitialAd.show();
            }
        });
    }
}
