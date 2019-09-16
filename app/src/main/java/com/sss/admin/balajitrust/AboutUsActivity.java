package com.sss.admin.balajitrust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    private ImageView img_profile;
    private TextView aboutus_title,aboutus_slogan,aboutus_desc,misson_desc,vision_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //find the views
        img_profile=findViewById(R.id.img_aboutus);
        aboutus_title=findViewById(R.id.txt_aboutus_title);
        aboutus_slogan=findViewById(R.id.txt_aboutus_slogan);
        aboutus_desc=findViewById(R.id.txt_aboutus_desc);
        misson_desc=findViewById(R.id.txt_mission_desc);
        vision_desc=findViewById(R.id.txt_vision_desc);

    }
}
