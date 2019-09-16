package com.sss.admin.balajitrust;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.sss.admin.balajitrust.adapter.SlidePagerAdapter;
import com.sss.admin.balajitrust.model.Slide;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout myDrawer;
    private ActionBarDrawerToggle myToggle;

    //slide view
    private List<Slide> lstSlides;
    private ViewPager slidePager;
    private TabLayout indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDrawer=findViewById(R.id.mydrawer);
        myToggle=new ActionBarDrawerToggle(this,myDrawer,R.string.open,R.string.close);

        myDrawer.addDrawerListener(myToggle);
        myToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //find the slide page items
        slidePager=findViewById(R.id.slider_page);
        indicator=findViewById(R.id.indicator);


        //prepare a list of slides
        lstSlides=new ArrayList<>();

        lstSlides.add(new Slide(R.drawable.bct1,"Providing Food For Poor People \nFor a Better Tomorrow"));
        lstSlides.add(new Slide(R.drawable.bct2,"Provide Wheelchairs Free of Cost \nTo the Poorest of the Poor"));
        lstSlides.add(new Slide(R.drawable.bct3,"Amman Temple Program \nProviding Food To People"));

        SlidePagerAdapter adapter=new SlidePagerAdapter(this,lstSlides);
        slidePager.setAdapter(adapter);

        //setup timer
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MainActivity.SlideTimer(),4000,4000);
        indicator.setupWithViewPager(slidePager,true);

        /*//debugging
        Log.i("myInfotag","info message");*/

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (myToggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();

        if (id==R.id.home)
        {
            Intent homeIntent=new Intent(this,HomeActivity.class);
            startActivity(homeIntent);
            Toast.makeText(this, "Home activity", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.about_us)
        {
            Intent aboutusIntent=new Intent(this,AboutUsActivity.class);
            startActivity(aboutusIntent);
        }else if (id==R.id.gallery)
        {
            Intent GalleryIntent=new Intent(this,GalleryActivity.class);
            startActivity(GalleryIntent);
        }else if (id==R.id.donate_now)
        {
            Intent DonateIntent=new Intent(this,DonateNowActivity.class);
            startActivity(DonateIntent);
        }else if (id==R.id.contact_us)
        {
            Intent ContactusIntent=new Intent(this,ContactActivity.class);
            startActivity(ContactusIntent);
        }

        return false;
    }

    //slide timer
    public class SlideTimer extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (slidePager.getCurrentItem()<lstSlides.size()-1)
                    {
                        slidePager.setCurrentItem(slidePager.getCurrentItem()+1);
                    }
                    /*else
                        slidePager.setCurrentItem(0);*/
                }
            });
        }
    }

}
