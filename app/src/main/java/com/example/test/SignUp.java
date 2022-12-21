package com.example.test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SignUp extends Fragment {

   View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sign_up, container, false);

        getParentFragmentManager().setFragmentResultListener("Email Request", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                String data = result.getString("Email");
                TextView display = getView().findViewById(R.id.showTextfromLogin);
                display.setText(data);



            }
        });











        return v;
    }
}