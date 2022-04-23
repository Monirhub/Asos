package com.sumon.testproforfb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
//
//

public class c4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4);
       //

        IronSource.init(this, "1238c3c0d");
        IronSource.setMetaData("Facebook_IS_CacheFlag","IMAGE");
        LinearLayout bannerCon=findViewById(R.id.bannerAd);
        IronSourceBannerLayout banner = IronSource.createBanner(this, ISBannerSize.RECTANGLE);
        bannerCon.addView(banner);
        IronSource.loadBanner(banner);

        IronSource.loadInterstitial();


    }

    public void gok(View view) {
        Intent viewIntent = new Intent("android.intent.action.VIEW",
                Uri.parse("https://www.offers.com/family-dollar/"));
        startActivity(viewIntent);
       //
    }


}








