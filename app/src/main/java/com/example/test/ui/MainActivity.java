package com.example.test.ui;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test.R;


public class MainActivity extends AppCompatActivity {


    Button customer,worker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Front_Page FrontPage = new Front_Page();

        int main = R.layout.activity_main;
        setContentView(main);

        customer = findViewById(R.id.Customer_Button);
        worker = findViewById(R.id.Worker_Button);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customer.setVisibility(View.GONE);
                worker.setVisibility(View.GONE);
                replaceFragment(R.id.Frame,FrontPage);

                }
        });

        worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customer.setVisibility(View.GONE);
                worker.setVisibility(View.GONE);
                replaceFragment(R.id.Frame,FrontPage);
            }
        });



    }

    //Change to other fragment
    //replaceFragment   (that fragment layout ID, classname)
    // Class classname = new Class();
    //Example: Login login = new Login();

    //change from activity_main to Login
    //Example
    //replaceFragment(R.layout.activity_main, Login);

    public void replaceFragment(int fragment1, Fragment fragment2){
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.Frame,fragment2).commit();
    }



}