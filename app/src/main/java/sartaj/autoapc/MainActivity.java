package sartaj.autoapc;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            finish();
        }
        super.onBackPressed();
    }
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-5437333570108736~7058521818");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5437333570108736/6436894651");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        Button btsound = (Button) findViewById(R.id.btsound);
        Button btvibrate = (Button) findViewById(R.id.btvibrate);
        Button btsilent = (Button) findViewById(R.id.btsilent);




        btsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //going to Activity2
                startActivity(new Intent(MainActivity.this, Activity2.class));
            }
        });
        btvibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity1.class));
            }
        });
        btsilent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Activity3.class));
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {

            case R.id.credits:
                Intent intent = new Intent(this, Credits.class);
                startActivity(intent);
                break;
            case R.id.close:
                ComponentName reciever = new ComponentName(this, MyAlarm.class);
                PackageManager packageManager = this.getPackageManager();
                packageManager.setComponentEnabledSetting(reciever, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);


                ComponentName reciever2 = new ComponentName(this, MyAlarm2.class);
                PackageManager packageManager2 = this.getPackageManager();
                packageManager.setComponentEnabledSetting(reciever2, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);

                ComponentName reciever3 = new ComponentName(this, MyAlarm3.class);
                PackageManager packageManager3 = this.getPackageManager();
                packageManager.setComponentEnabledSetting(reciever3, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
                finish();
        }


        return super.onOptionsItemSelected(item);
    }
}




