package com.example.test;





import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {


    Login LoginPage = new Login();
    SignUp SignUp_Page = new SignUp();
    Front_Page FrontPage = new Front_Page();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int main = R.layout.activity_main;
        setContentView(main);

        setContentView(FrontPage.getView());


        //Setup the login button & sign up button on front page

        Button LoginFrag = findViewById(FrontPage.Login.getId());
        Button SignUpFrag = findViewById(FrontPage.SignUp.getId());





        LoginFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //This make the layout from main activity invisible, thus login view can be visible
                LoginFrag.setVisibility(View.GONE);



                //Replace the layout with login fragment
                replaceFragment(LoginPage);
//                Button LoginBtn = findViewById(LoginPage.login.getId());





            }

        });


//        SignUpFrag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SignUpFrag.setVisibility(View.GONE);
//                replaceFragment(SignUp_Page);
//            }
//
//
//        });





    }

    public void replaceFragment (Fragment frag){

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(FrontPage.getView().getId(), frag);
        FT.commit();

    }


}