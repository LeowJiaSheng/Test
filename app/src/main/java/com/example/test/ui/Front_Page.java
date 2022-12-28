package com.example.test.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.R;


public class Front_Page extends Fragment {


    View v;
    Button Login,SignUp;
    Login LoginPage;
    SignUp SignUpPage;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LoginPage = new Login();
        SignUpPage = new SignUp();

        v = inflater.inflate(R.layout.fragment_front__page, container, false);



        Login = v.findViewById(R.id.Login_Button);
        SignUp = v.findViewById(R.id.SignUp_Button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login.setVisibility(View.GONE);
                SignUp.setVisibility(View.GONE);
                replaceFragment(R.id.Front_Page,LoginPage);
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login.setVisibility(View.GONE);
                SignUp.setVisibility(View.GONE);
                replaceFragment(R.id.Front_Page,SignUpPage);
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