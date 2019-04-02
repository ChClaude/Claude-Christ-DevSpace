package com.claudechrist.claudedevspace;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MyProfileActivity extends AppCompatActivity {

    public void toMenuScreen(View view) {
        Intent intent = new Intent(this, MyMenuScreenActivity.class);
        startActivity(intent);
    }

    public void openBrowser(View view) {
        // Get url from tag
        String url = "https://github.com/ChClaude";

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        // passing the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ImageView mySelfieImageView = findViewById(R.id.mySelfieImageView);

        Glide.with(this).load(R.drawable.my_selfie).apply(RequestOptions.circleCropTransform()).into(mySelfieImageView);
        mySelfieImageView.animate().alpha(1).setDuration(3000);
    }
}
