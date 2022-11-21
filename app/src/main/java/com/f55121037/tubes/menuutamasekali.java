package com.f55121037.tubes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class menuutamasekali extends AppCompatActivity {
    private ImageSlider imageSlider;
    public menuutamasekali(){}
    View view;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutamasekali);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.pic1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic3, ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        Button bt = findViewById(R.id.more);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuutamasekali.this, HewanActivity.class));
            }
        });
    }
}