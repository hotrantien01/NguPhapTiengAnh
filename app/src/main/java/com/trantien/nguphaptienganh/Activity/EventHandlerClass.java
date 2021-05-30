package com.trantien.nguphaptienganh.Activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class EventHandlerClass {

    // Define a tag that is used to log any kind of error or comment
    private static final String LOG_TAG = "EVENTHANDLER";

    // Declare a MediaPlayer to be used by the app
    private static MediaPlayer mp;

    // Creates and starts a MediaPlayer instance to play a sound
    public static void startMediaPlayer(Context context, int file) {

        try {

            // Check if the sound id was set correctly


            // Check if the MediaPlayer maybe is in use
            // If so the MediaPlayer will be reset
            if (mp != null)
                mp.reset();

            // Create and start the MediaPlayer on the given sound id
            mp = MediaPlayer.create(context, file);
            mp.start();

        } catch (Exception e) {

            // Log error if process failed
            Log.e(LOG_TAG, "Failed to start the MediaPlayer: " + e.getMessage());
        }
    }

    // Releases all data from the MediaPlayer
    public static void releaseMediaPlayer() {

        if (mp != null) {

            mp.release();
            mp = null;
        }
    }

}
