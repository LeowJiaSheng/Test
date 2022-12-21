package com.example.test;

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


public class Login extends Fragment{


    View v;


    Button login,back;




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_login, container, false);


        login = getView().findViewById(R.id.Login_Button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email = view.findViewById(R.id.editEmail);
                Bundle resultEmail = new Bundle();
                resultEmail.putString("Email",email.getText().toString());
                getParentFragmentManager().setFragmentResult("Email Request",resultEmail);
                email.setText("");


            }
        });




//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                onDestroyView();
//
//                FragmentManager FM = getParentFragmentManager();
//                FragmentTransaction FT = FM.beginTransaction();
//
//
//            }
//        });




        return v;
    }







}