package com.sss.admin.balajitrust.gallery_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.sss.admin.balajitrust.R;
import com.sss.admin.balajitrust.adapter.StaggeredRecyclerviewAdapter;
import com.sss.admin.balajitrust.model.RowItem_Wheelchair;

import java.util.ArrayList;

public class FreeWheelchairActivity extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private StaggeredRecyclerviewAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_free_wheelchair);

        //for full screen activity
        getSupportActionBar().hide();

        staggeredRv=findViewById(R.id.staggered_rv_food);
        manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);


        //13-09-2019 url edit
        ArrayList imageUrlList=prepareData();
        StaggeredRecyclerviewAdapter staggeredRecyclerviewAdapter=new StaggeredRecyclerviewAdapter(getApplicationContext(),imageUrlList);
        staggeredRv.setAdapter(staggeredRecyclerviewAdapter);

    }

    private ArrayList prepareData() {

        String imageUrls[]={
                "http://192.168.0.25/imagesbct/wheel1.jpg",
                "http://192.168.0.25/imagesbct/wheel2.jpg",
                "http://192.168.0.25/imagesbct/wheel3.jpg",
                "http://192.168.0.25/imagesbct/wheel4.jpg",
                "http://192.168.0.25/imagesbct/wheel5.jpg",
                "http://192.168.0.25/imagesbct/wheel6.jpg",
                "http://192.168.0.25/imagesbct/wheel7.jpg",
                "http://192.168.0.25/imagesbct/wheel8.jpg",
                "http://192.168.0.25/imagesbct/wheel9.jpg",
                "http://192.168.0.25/imagesbct/wheel10.jpg",
                "http://192.168.0.25/imagesbct/wheel11.jpg",
                "http://192.168.0.25/imagesbct/wheel12.jpg",
                "http://192.168.0.25/imagesbct/wheel13.jpg",
                "http://192.168.0.25/imagesbct/wheel14.jpg",
                "http://192.168.0.25/imagesbct/wheel15.jpg",
                "http://192.168.0.25/imagesbct/wheel16.jpg",
                "http://192.168.0.25/imagesbct/wheel17.jpg",
                "http://192.168.0.25/imagesbct/wheel18.jpg",
                "http://192.168.0.25/imagesbct/wheel19.jpg",
                "http://192.168.0.25/imagesbct/wheel20.jpg",
                "http://192.168.0.25/imagesbct/wheel21.jpg",
                "http://192.168.0.25/imagesbct/wheel22.jpg",
                "http://192.168.0.25/imagesbct/wheel23.jpg",
                "http://192.168.0.25/imagesbct/wheel24.jpg",
                "http://192.168.0.25/imagesbct/wheel25.jpg",
                "http://192.168.0.25/imagesbct/wheel26.jpg",
                "http://192.168.0.25/imagesbct/wheel27.jpg",
                "http://192.168.0.25/imagesbct/wheel28.jpg",
                "http://192.168.0.25/imagesbct/wheel29.jpg",
                "http://192.168.0.25/imagesbct/wheel30.jpg",
                "http://192.168.0.25/imagesbct/wheel31.jpg",
                "http://192.168.0.25/imagesbct/wheel32.jpg",
                "http://192.168.0.25/imagesbct/wheel33.jpg",
                "http://192.168.0.25/imagesbct/wheel34.jpg"
        };

        ArrayList imageUrlList=new ArrayList<>();

        for (int i=0;i<imageUrls.length;i++)
        {
            RowItem_Wheelchair rowItemWheelchair=new RowItem_Wheelchair();
            rowItemWheelchair.setImgurls(imageUrls[i]);
            imageUrlList.add(rowItemWheelchair);
        }

        return null;
    }
}
