package com.f55121037.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HewanActivity extends AppCompatActivity {

    private String[] dataName;
    private TypedArray dataPhoto;
    private HewanAdapter adapter;
    ListView listView;
    private ArrayList<Hewan> hewans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);
        adapter = new HewanAdapter(this);
        listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);


        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(HewanActivity.this, hewans.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);

    }

    private void addItem() {
        hewans = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Hewan hewan = new Hewan();
            hewan.setPhoto(dataPhoto.getResourceId(i, -1));
            hewan.setName(dataName[i]);
            hewans.add(hewan);
        }
        adapter.setHewans(hewans);
    }

}