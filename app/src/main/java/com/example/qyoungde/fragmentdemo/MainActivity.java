package com.example.qyoungde.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment fragment = new Fragment();


        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fg, new MyFragment(), "123");
        ft.commit();


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button1: {
                Intent intent = new Intent(this, MyTabActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.button2: {
                Intent intent = new Intent(this, MyTabActivity1.class);
                startActivity(intent);
                break;
            }
            case R.id.button3: {
                Intent intent = new Intent(this, MyTabActivity2.class);
                startActivity(intent);
                break;
            }
            default: {
                break;
            }
        }

//
//        FragmentManager fm = getFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//
//
//        Fragment fragment = fm.findFragmentByTag("123");
//
//        ft.remove(fragment);
//        ft.commit();


    }
}
