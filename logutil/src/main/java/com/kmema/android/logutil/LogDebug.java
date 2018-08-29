package com.kmema.android.logutil;

import android.util.Log;


public class LogDebug {

    private static final String TAG = "SUPER AWESOME APP";
    public static void d(String message){
        Log.d(TAG, message);
    }

}
