package com.example.tothenextactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentToSecond extends Fragment {

     TextView textView;
     Button button, button2, nextA;
     Integer countValue = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_to_second, container, false);
         textView = view.findViewById(R.id.txtView);
         nextA = view.findViewById(R.id.btn3);
         button = view.findViewById(R.id.btn1);
         button2 = view.findViewById(R.id.btn2);
         onListener();


        return view;
    }

    private void onListener() {
        textView.setOnClickListener(view -> {

        });
        button.setOnClickListener(view -> {
            countValue++;
            textView.setText(String.valueOf(countValue));
        });
        button2.setOnClickListener(view -> {
            countValue--;
            textView.setText(String.valueOf(countValue));
        });
        nextA.setOnClickListener(view -> {
            String textFromFragment = textView.getText().toString();

            Intent intent = new Intent(getActivity(), MainActivity2.class);

            intent.putExtra("textFromFragment", textFromFragment);

            startActivity(intent);
        });
    }


}