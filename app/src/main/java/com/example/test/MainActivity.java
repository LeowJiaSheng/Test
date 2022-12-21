package com.example.test;





import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int v = R.layout.fragment_front__page;
        setContentView(v);


        Button LoginFrag = findViewById(R.id.Login_Button);
        Button SignUpFrag = findViewById(R.id.SignUp_Button);


        LoginFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replaceFragment(new Login());


            }

        });


        SignUpFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replaceFragment(new SignUp());
            }


        });




    }


    private void replaceFragment(Fragment login) {

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.frameLayout,login);
        FT.commit();

    }

//    private void removeFragment(Fragment login){
//
//        FragmentManager FM = getSupportFragmentManager();
//        FragmentTransaction FT = FM.beginTransaction();
//        FT.remove(login);
//        FT.commit();
//    }



}