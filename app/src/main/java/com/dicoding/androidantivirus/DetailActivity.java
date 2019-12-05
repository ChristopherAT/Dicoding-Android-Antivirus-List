package com.dicoding.androidantivirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static String name = "empty";
    public static String detail = "empty";
    public static String country = "empty";
    public static String year = "empty";
    public static String price = "empty";
    public static String photo = "empty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView v_logo = findViewById(R.id.det_logo);
        TextView v_name = findViewById(R.id.det_name);
        TextView v_detail = findViewById(R.id.det_detail);
        TextView v_country = findViewById(R.id.det_country);
        TextView v_year = findViewById(R.id.det_year);
        TextView v_price = findViewById(R.id.det_price);


        String g_name = getIntent().getStringExtra("name");
        String g_detail = getIntent().getStringExtra("detail");
        String g_country = getIntent().getStringExtra("country");
        String g_year = getIntent().getStringExtra("year");
        String g_price = getIntent().getStringExtra("price");
        int g_logo = getIntent().getIntExtra("photo",0);

        v_name.setText(g_name);
        v_detail.setText(g_detail);
        v_country.setText(g_country);
        v_year.setText(g_year);
        v_price.setText(g_price);
        Glide.with(this).load(g_logo).into(v_logo);

        if (getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Detail");
        }
    }
}
