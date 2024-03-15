package com.jeelpatel.stpicalculatorgtu.helper;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.material.card.MaterialCardView;

public class BannerAdHelper {

    Context context;
    String AD_UNIT_ID;
    MaterialCardView materialCardView;
    WindowManager windowManager;

    public BannerAdHelper(Context context, String AD_UNIT_ID, MaterialCardView materialCardView, WindowManager windowManager) {
        this.context = context;
        this.AD_UNIT_ID = AD_UNIT_ID;
        this.materialCardView = materialCardView;
        this.windowManager = windowManager;
    }

    public void loadBanner() {
        // Create an ad request.
        AdView adView = new AdView(context);
        adView.setAdUnitId(AD_UNIT_ID);

        materialCardView.removeAllViews();
        materialCardView.addView(adView);

        AdSize adSize = getAdSize();
        adView.setAdSize(adSize);
        AdRequest adRequest = new AdRequest.Builder().build();

        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {

        // Determine the screen width (less decorations) to use for the ad width.
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = outMetrics.density;

        float adWidthPixels = materialCardView.getWidth();

        // If the ad hasn't been laid out, default to the full screen width.
        if (adWidthPixels == 0) {
            adWidthPixels = outMetrics.widthPixels;
        }

        int adWidth = (int) (adWidthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adWidth);
    }
}