package com.example.test;

import android.os.Bundle;

import androidx.annotation.NonNull;
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
    Button Login,SignUp;
    Login LoginPage;
    SignUp SignUpPage;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        v = inflater.inflate(R.layout.fragment_front__page, container, false);


//Later uncomment it
//        Login = v.findViewById(R.id.Login_Button);
//        SignUp = v.findViewById(R.id.SignUp_Button);
//
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Login.setVisibility(View.GONE);
//                replaceFragment(R.layout.fragment_front__page,LoginPage);
//            }
//        });
//
//        SignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SignUp.setVisibility(View.GONE);
//                replaceFragment(R.id.Front_Page,SignUpPage);
//            }
//        });




        return v;

    }

//    public void replaceFragment(int fragment1, Fragment fragment2){
//        FragmentManager FM = getActivity().getSupportFragmentManager();
//        FragmentTransaction FT = FM.beginTransaction();
//        FT.replace(fragment1,fragment2).commit();
//    }








}