package com.example.test.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.test.R;


public class Login extends Fragment{


    View v;
    Button Login;
    TextView Forgot;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Create the page
        v = inflater.inflate(R.layout.fragment_login, container, false);
        Profile Profile = new Profile();
        Forgot_Password Forgot_password = new Forgot_Password();

        Login = v.findViewById(R.id.LoginBtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login.setVisibility(View.GONE);
                replaceFragment(R.id.frag_login,Profile);
            }
        });

        Forgot = v.findViewById(R.id.forgot);

        Forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Forgot.setVisibility(View.GONE);
                replaceFragment(R.id.frag_login,Forgot_password);
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