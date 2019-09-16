package com.sss.admin.balajitrust.gallery_details_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.sss.admin.balajitrust.R;

public class GalleryDetailsActivity extends AppCompatActivity {

    ImageView imageView;

    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_details);

        imageView=findViewById(R.id.img_fullView);

        img=getIntent().getIntExtra("image",0);
        imageView.setImageResource(img);

    }
}
