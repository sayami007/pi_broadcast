package com.planetinnovative.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PhoneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        for (String key : bundle.keySet()) {
            String value = String.valueOf(bundle.get(key));
            System.out.println(value);
            if (value.equals("RINGING")) {
                Toast.makeText(context, "RINGING", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
