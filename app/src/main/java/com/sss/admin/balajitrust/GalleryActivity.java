package com.sss.admin.balajitrust;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sss.admin.balajitrust.gallery_pages.AmmanTempleActivity;
import com.sss.admin.balajitrust.gallery_pages.FoodProvidingActivity;
import com.sss.admin.balajitrust.gallery_pages.FreeWheelchairActivity;
import com.sss.admin.balajitrust.gallery_pages.VinayagarTempleActivity;

public class GalleryActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView FoodProviding,FreeWheelchair,Ammanteple,Vinayagartemple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        //define cards
        FoodProviding=findViewById(R.id.food_providing);
        FreeWheelchair=findViewById(R.id.free_wheelchair);
        Ammanteple=findViewById(R.id.amman_temple);
        Vinayagartemple=findViewById(R.id.vinayagar_temple);

        //Add click listeners to the cards
        FoodProviding.setOnClickListener(this);
        FreeWheelchair.setOnClickListener(this);
        Ammanteple.setOnClickListener(this);
        Vinayagartemple.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {
            case R.id.food_providing:
                i=new Intent(this, FoodProvidingActivity.class);
                startActivity(i);
                break;

            case R.id.free_wheelchair:
                i=new Intent(this, FreeWheelchairActivity.class);
                startActivity(i);
                break;

            case R.id.amman_temple:
                i=new Intent(this, AmmanTempleActivity.class);
                startActivity(i);
                break;

            case R.id.vinayagar_temple:
                i=new Intent(this, VinayagarTempleActivity.class);
                startActivity(i);
                break;

                default:break;
        }

    }
}
