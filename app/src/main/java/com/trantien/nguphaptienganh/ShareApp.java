package com.trantien.nguphaptienganh;

import android.content.Context;
import android.content.Intent;

public class ShareApp {
    Context context;

    public ShareApp(Context context) {
        this.context = context;
        share();
    }

    private void share(){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBodyText = context.getString(R.string.app_name);
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText+"\n#" );
        context.startActivity(Intent.createChooser(sharingIntent, "Share:"));
    }
}
