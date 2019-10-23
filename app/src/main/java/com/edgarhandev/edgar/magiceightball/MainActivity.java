package com.edgarhandev.edgar.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    MagicEightBall magicEightBall;
    Button button;
    TextView textView;
    ImageView imageView;
    final String YOUR_ADMOB_APP_ID = "ca-app-pub-5445092696369420~4718377742";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, YOUR_ADMOB_APP_ID);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        magicEightBall = new MagicEightBall();
        textView = (TextView)findViewById(R.id.text_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getResponse();
            }
        });

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getResponse();
            }
        });

        TextView privacy_policy_link = (TextView) findViewById(R.id.privacy_policy_link);
        privacy_policy_link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    void getResponse() {
        textView.setText(magicEightBall.getResponse());
    }
}
