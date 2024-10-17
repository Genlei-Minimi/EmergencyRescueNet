package com.example.test4;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoFirstAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_faid);
        ImageButton imageButton = findViewById(R.id.backbutton);
        imageButton.setOnClickListener(this::onClick);


        final VideoView videoView = (VideoView) findViewById(R.id.vid_first_aid);
        videoView.setVideoPath("android.resource://" + getPackageName()+"/" + R.raw.firstaid);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mediaController);
        videoView.setMediaController(mediaController);

        videoView.start();



    }

    private void onClick(View v) {
        onBackPressed();


    }

}
