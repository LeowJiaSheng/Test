package com.example.test.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.test.R;


public class SignUp extends Fragment {

   View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_sign_up, container, false);

        //Create Page
        User_Info UserInfo = new User_Info();

        //Create Button
        Button SignUp = v.findViewById(R.id.Register_Button);
        SignUp.setVisibility(View.VISIBLE);


        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUp.setVisibility(View.GONE);
                replaceFragment(R.id.SignUpPage,UserInfo);
            }
        });


        return v;
    }

    public void replaceFragment(int fragment1, Fragment fragment2){
        FragmentManager FM = getActivity().getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(fragment1,fragment2).commit();
    }
















}