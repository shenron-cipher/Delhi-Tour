package com.example.shenron.delhitour;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout intro = (RelativeLayout) findViewById(R.id.about_icon);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent introIntent = new Intent(MainActivity.this, About.class);
                startActivity(introIntent);
            }
        });

        RelativeLayout restaurant = (RelativeLayout) findViewById(R.id.restaurant_icon);
        restaurant.setBackgroundColor(Color.rgb(255, 112, 112));

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(resIntent);
            }
        });

        RelativeLayout hotels = (RelativeLayout) findViewById(R.id.hotel_icon);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelIntent);
            }
        });

        RelativeLayout museums = (RelativeLayout) findViewById(R.id.museum_icon);

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        RelativeLayout sights = (RelativeLayout) findViewById(R.id.sights_icon);

        sights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);
                startActivity(sightsIntent);
            }
        });

        RelativeLayout help = (RelativeLayout) findViewById(R.id.help_icon);

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpIntent = new Intent(MainActivity.this, help.class);
                startActivity(helpIntent);

            }
        });

    }

}
