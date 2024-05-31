package com.veniaaurilia.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://cf.bstatic.com/xdata/images/hotel/max1024x768/507775515.jpg?k=e4993e03bd7affcf94f12a8bc4437a16b2a72c27a326c6c34969de9a9e46372e&o=&hp=1";
                Picasso.with(this).load(imageUrl).into(_imageView);

    }
}