package sartaj.autoapc;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sartaj Roshanm on 31-Oct-17.
 */
public class Activity3 extends AppCompatActivity {
    TimePicker timePicker;
    //private ToggleButton toggleButton;
    private View hdnchk;
    private AdView mAdView;




DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        MobileAds.initialize(this, "ca-app-pub-5437333570108736~7058521818");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        timePicker = (TimePicker) findViewById(R.id.timepicker);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        //toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        hdnchk = (View) findViewById(R.id.hdnchk);
        //CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);


        findViewById(R.id.setalarm1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();
                if (Build.VERSION.SDK_INT >= 23) {
                    calendar.set(
                            datePicker.getYear(),
                            datePicker.getMonth(),
                            datePicker.getDayOfMonth(),
                            timePicker.getHour(),
                            timePicker.getMinute(),
                            0
                    );

                } else {
                    calendar.set(
                            datePicker.getYear(),
                            datePicker.getMonth(),
                            datePicker.getDayOfMonth(),
                            timePicker.getCurrentHour(),
                            timePicker.getCurrentMinute(),
                            0
                    );
                }
                setAlarm(calendar.getTimeInMillis());

                finish();

            }


        });
        ComponentName reciever = new ComponentName(this, MyAlarm3.class);
        PackageManager packageManager = this.getPackageManager();
        packageManager.setComponentEnabledSetting(reciever, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);



    };

    public void stop1(View view){
        ComponentName reciever = new ComponentName(this, MyAlarm3.class);
        PackageManager packageManager = this.getPackageManager();
        packageManager.setComponentEnabledSetting(reciever, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
        Toast.makeText(this, "Silent mode scheduling stopped", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(this, MyAlarm3.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);



        alarmManager.set(AlarmManager.RTC, timeInMillis,pendingIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent);
        Toast.makeText(this, "Silent mode Scheduled", Toast.LENGTH_SHORT).show();

    }
    private void schedule1(long time){



        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend1 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend1);
        Toast.makeText(this, "Repeat Sundays ", Toast.LENGTH_SHORT).show();
    }
    private void schedule2(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend2 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend2);
        Toast.makeText(this, "Repeat Mondays ", Toast.LENGTH_SHORT).show();

    }
    private void schedule3(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend3 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend3);
        Toast.makeText(this, "Repeat Tuesdays ", Toast.LENGTH_SHORT).show();

    }
    private void schedule4(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend4 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP,time, AlarmManager.INTERVAL_DAY * 7, pend4);
        Toast.makeText(this, "Repeat Wednesdays ", Toast.LENGTH_SHORT).show();

    }
    private void schedule5(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend5 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend5);
        Toast.makeText(this, "Repeat Thursdays ", Toast.LENGTH_SHORT).show();

    }
    private void schedule6(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend6 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend6);
        Toast.makeText(this, "Repeat Fridays ", Toast.LENGTH_SHORT).show();

    }
    private void schedule7(long time){

        Intent intent = new Intent(this,MyAlarm3.class);
        PendingIntent pend7 = PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alrm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alrm.setRepeating(AlarmManager.RTC_WAKEUP, time, AlarmManager.INTERVAL_DAY * 7, pend7);
        Toast.makeText(this, "Repeat Saturdays ", Toast.LENGTH_SHORT).show();

    }

    public void check(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.chk_sunday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.HOUR, 24);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,1);

                    }

                    schedule1(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_monday:

                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,2);

                    }

                    schedule2(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_tuesday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,3);

                    }

                    schedule3(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_wednesday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,4);

                    }

                    schedule4(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_thursday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,5);

                    }

                    schedule5(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_friday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,6);

                    }

                    schedule6(calendar.getTimeInMillis());
                }
                break;
            case R.id.chk_saturday:
                if (checked) {
                    final Calendar calendar = Calendar.getInstance();
                    if (Build.VERSION.SDK_INT >= 23) {
                        calendar.set(
                                datePicker.getYear(),
                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getHour(),
                                timePicker.getMinute(),
                                0
                        );

                    } else {
                        calendar.set(
                                datePicker.getYear(),

                                datePicker.getMonth(),
                                datePicker.getDayOfMonth(),

                                timePicker.getCurrentHour(),
                                timePicker.getCurrentMinute(),
                                0
                        );
                        if (calendar.getTimeInMillis() < System.currentTimeMillis()) {
                            calendar.add(Calendar.DAY_OF_YEAR, 7);


                        }
                        calendar.set(Calendar.DAY_OF_WEEK,7);

                    }

                    schedule7(calendar.getTimeInMillis());
                }
                break;
        }

    }


}
