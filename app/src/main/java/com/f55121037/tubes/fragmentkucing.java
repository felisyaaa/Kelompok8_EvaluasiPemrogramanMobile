package com.f55121037.tubes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragmentkucing extends Fragment {
    Button bt;
        View view;
        public fragmentkucing(){
        }
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.activity_fragmentanjing, container, false);

            View v = inflater.inflate(R.layout.activity_fragmentanjing,container, false);
            bt=v.findViewById(R.id.buttonmenu);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), menuutamasekali.class);
                    startActivity(intent);
                }
            });
            return v;
        }
    }