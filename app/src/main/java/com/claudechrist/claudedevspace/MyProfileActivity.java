package com.claudechrist.claudedevspace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MyProfileActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ImageView mySelfieImageView = findViewById(R.id.mySelfieImageView);

        Glide.with(this).load(R.drawable.my_selfie).apply(RequestOptions.circleCropTransform()).into(mySelfieImageView);
    }
}
