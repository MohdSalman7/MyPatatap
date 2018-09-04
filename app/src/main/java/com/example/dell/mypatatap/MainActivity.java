package com.example.dell.mypatatap;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    void playMusic(View view)
    {
          int id=view.getId();
        Log.i("id","view id is"+id);
        String nameId=view.getResources().getResourceEntryName(id);
        Log.i("nameId","Name id is : "+nameId);

        int myMusic=getResources().getIdentifier(nameId,"raw","com.example.dell.mypatatap");
        MediaPlayer mediaPlayer=MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
