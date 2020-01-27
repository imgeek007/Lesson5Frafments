package com.geektech.lesson5frafments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IButtonFragment {
    FragmentManager manager=getSupportFragmentManager();

    ButtonFragment fragment =new ButtonFragment();
    TextFragment textFragment=new TextFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeFragment(R.id.container, ButtonFragment.create(this));
    }
    public void changeFragment(int container, Fragment fragment){

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();

    }

    @Override
    public void showTextFragment() {
        changeFragment(R.id.container2, new TextFragment());
    }

    @Override
    public void showButtonFragment() {
    textFragment.changeText("N");
    }
}
