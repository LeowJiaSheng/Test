package com.example.test.payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test.R;

public class Payment extends AppCompatActivity {

    Button AddAcc;
    Adding_Bank_Account AddBankAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int main;
        AddBankAcc = new Adding_Bank_Account();

        main = R.layout.activity_payment;
        setContentView(main);

        //for recycler view I haven't go research yet. If can could you use the same method you use in your activity to here?
        AddAcc = findViewById(R.id.AddAccBtn);

        AddAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddAcc.setVisibility(View.GONE);
                replaceFragment(main,AddBankAcc);
            }
        });

    }

    public void replaceFragment(int fragment1, Fragment fragment2){
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.Frame,fragment2).commit();
    }






}