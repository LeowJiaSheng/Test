package com.example.test;





import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int main = R.layout.activity_main;
        setContentView(main);




        int v = R.layout.fragment_front__page;
        setContentView(v);

        //Setup the login button on front page
        Button LoginFrag = findViewById(R.id.Login_Button);
        Button SignUpFrag = findViewById(R.id.SignUp_Button);


        LoginFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This make the layout from main activity invisible, thus login view can be visible
                LoginFrag.setVisibility(View.GONE);

                //Replace the layout with login fragment
                replaceFragment(new Login());


            }

        });


        SignUpFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpFrag.setVisibility(View.GONE);
                replaceFragment(new SignUp());
            }


        });

        TextView name = findViewById(R.id.UserName);
        name.setText("Name");



    }

    public void replaceFragment (Fragment frag){

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.Front_Page, frag);
        FT.commit();

    }


}