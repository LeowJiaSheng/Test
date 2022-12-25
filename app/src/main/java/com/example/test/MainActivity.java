package com.example.test;





import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Front_Page FrontPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        int main = R.layout.activity_main;
        setContentView(main);

        Button customer = findViewById(R.id.Customer_Button);
        Button worker = findViewById(R.id.Worker_Button);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customer.setVisibility(View.GONE);
                replaceFragment(main,FrontPage);

                }
        });

    }
    public void replaceFragment(int fragment1, Fragment fragment2){
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.Frame,fragment2).commit();
    }



}