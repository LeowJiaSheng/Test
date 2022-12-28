package com.example.test.payment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.R;


public class Adding_Bank_Account extends Fragment {
    View v;
    Button AddBankAcc;
    Action_Success Acc_Success;
    Action_Fail Acc_Fail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_adding__bank__account, container, false);

        Acc_Success = new Action_Success();
        Acc_Fail = new Action_Fail();

        AddBankAcc = getActivity().findViewById(R.id.AddBankAccBtn);


        AddBankAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AddBankAcc.setVisibility(View.GONE);


                //Put the success or fail condition here
                if(true){
                    replaceFragment(R.id.AddBankAccFrag,Acc_Success);
                }else{
                    replaceFragment(R.id.AddBankAccFrag,Acc_Fail);
                }
            }
        });




        return v;
    }

    public void replaceFragment(int fragment1, Fragment fragment2){
        FragmentManager FM = getActivity().getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.Frame,fragment2).commit();
    }



}