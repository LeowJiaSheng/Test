package com.example.test;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Front_Page extends Fragment {






    View v;
    Button login;




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        v = inflater.inflate(R.layout.fragment_front__page, container, false);
        return v;

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        Button LoginFrag = findViewById(R.id.Login_Button);
//        Button SignUpFrag = findViewById(R.id.SignUp_Button);
//
//
//        LoginFrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                LoginFrag.setVisibility(View.GONE);
//                replaceFragment(new Login());
//
//
//            }
//
//        });
//
//
//        SignUpFrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SignUpFrag.setVisibility(View.GONE);
//                replaceFragment(new SignUp());
//            }
//
//
//        });
//
//
//
//    }
//
//    public void replaceFragment(Fragment frag) {
//
//        FragmentManager FM = getSupportFragmentManager();
//        FragmentTransaction FT = FM.beginTransaction();
//        FT.replace(R.id.Front_Page,frag);
//        FT.commit();
//
//    }







}