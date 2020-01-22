package sartaj.autoapc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.widget.Toast;

/**
 * Created by Sartaj Roshanm on 01-Nov-17.
 */
public class MyAlarm extends BroadcastReceiver {
    // AudioManager audioManager;
    @Override
    public void onReceive(Context context, Intent intent) {
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

        switch (audioManager.getRingerMode()) {
            case AudioManager.RINGER_MODE_NORMAL:
                audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                break;
            case AudioManager.RINGER_MODE_SILENT:
                audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);

                break;
        }


        //audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        // audioManager.start();

    }

}
