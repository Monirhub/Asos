package com.sumon.testproforfb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ironsource.adapters.ironsource.IronSourceInterstitialListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
//
//


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //StartAppSDK.init(this, "205235712", true);


        IronSource.init(this, "1238c3c0d");
        IronSource.setMetaData("Facebook_IS_CacheFlag","IMAGE");
        LinearLayout bannerCon=findViewById(R.id.bannerAd);
        IronSourceBannerLayout banner = IronSource.createBanner(this, ISBannerSize.BANNER);
        bannerCon.addView(banner);
        IronSource.loadBanner(banner);

        IronSource.loadInterstitial();



    }


    protected void onResume() {
        super.onResume();
        IronSource.onResume(this);
    }
    protected void onPause() {
        super.onPause();
        IronSource.onPause(this);
    }

    public void c1(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
            Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c1.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c1.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



       //
    }

    public void c2(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
           // Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c2.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c2.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }

    public void c3(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
            //Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c3.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c3.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }

    public void c4(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
          //  Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c4.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c4.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }

    public void c5(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
           // Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c5.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c5.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }

    public void c6(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
           // Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c6.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c6.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }

    public void c7(View view) {

        if(IronSource.isInterstitialReady()){
            IronSource.showInterstitial();
        }else {
       //
            //Toast.makeText(this, "AI No loaded", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, c7.class);
            startActivity(intent);
            IronSource.loadInterstitial();


        }
        IronSource.setInterstitialListener(new InterstitialListener() {
            @Override
            public void onInterstitialAdReady() {

            }

            @Override
            public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdOpened() {

            }

            @Override
            public void onInterstitialAdClosed() {
                IronSource.loadInterstitial();
                Intent i = new Intent(MainActivity.this, c7.class);
                startActivity(i);
            }

            @Override
            public void onInterstitialAdShowSucceeded() {

            }

            @Override
            public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {

            }

            @Override
            public void onInterstitialAdClicked() {

            }
        });



        //
    }









}