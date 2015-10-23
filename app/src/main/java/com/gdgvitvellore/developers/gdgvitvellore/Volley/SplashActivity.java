package com.gdgvitvellore.developers.gdgvitvellore.Volley;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.gdgvitvellore.developers.gdgvitvellore.Feeds.HomeActivity;
import com.gdgvitvellore.developers.gdgvitvellore.Login.LoginActivity;
import com.gdgvitvellore.developers.gdgvitvellore.Login.MainFragment;
import com.gdgvitvellore.developers.gdgvitvellore.R;

/**
 * Created by shalini on 19-03-2015.
 */
public class SplashActivity extends FragmentActivity {
    Thread t;
    private MainFragment mainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        /*t=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish();
            }
        });
        */

        try {

            if (savedInstanceState == null) {
                // Add the fragment on initial activity setup

                mainFragment = new MainFragment(this);
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(android.R.id.content, mainFragment)
                        .commit();
            }

            else {
                // Or set the fragment from restored state info
                mainFragment = (MainFragment) getSupportFragmentManager()
                        .findFragmentById(android.R.id.content);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        //t.start();
    }
}
